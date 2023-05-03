package src.core.TrafficComponents;

import src.core.carComponents.Car;

import java.awt.*;
import java.util.Vector;

//a clase "CarManager" se encarga de la creación y manejo de objetos "Car"

public class CarManager {
    private TrafficFactory trafficFactory;
    private Vector<Car> cars;

    public CarManager(int speed, String pattern, boolean left, Rectangle bounds, int y) {
        trafficFactory = new TrafficFactory(speed, pattern, left, bounds, y);
        cars = trafficFactory.initCars();
    }

    public void addCar() {
        trafficFactory.createCar();
    }

    public void moveCars(boolean left) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null) {
                if (left) {
                    cars.add(i, (Car) cars.get(i).moveLeft());
                    cars.remove(i + 1);
                } else {
                    cars.add(i, (Car) cars.get(i).moveRight());
                    cars.remove(i + 1);
                }
            }
        }
    }

    public void testForNewCar(Rectangle bounds) {
        if (!cars.isEmpty() && !cars.get(0).intersects(bounds)) {
            cars.remove(0);
            addCar();
        }
    }

    public Vector<Car> getCars() {
        return cars;
    }
}