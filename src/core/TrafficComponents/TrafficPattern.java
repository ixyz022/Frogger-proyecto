package src.core.TrafficComponents;

import src.core.CarComponents.Car;
import src.core.Frog;

import java.awt.*;
import java.util.*;

public class TrafficPattern extends TrafficPatternBase {

    // The pattern should be of the form "RRR  BB L   MMM B  GG "
    // R == RED
    // B == BLUE
    // L == BLACK
    // M == MAGENTA

    private TrafficFactory trafficFactory;
    private Vector<Car> cars;

    public TrafficPattern(int speed, String pattern, boolean left, Rectangle bounds, int y) {
        super(speed, pattern, left, bounds, y);
        initCars();
    }

    public void initCars() {
        trafficFactory = new TrafficFactory(speed, pattern, left, bounds, y);
        cars = trafficFactory.initCars();
    }

    public void addCar() {
        trafficFactory.createCar();
    }

    public void moveCars() {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null) {
                if (left) {
                    cars.add(i, cars.get(i).moveLeft());
                    cars.remove(i + 1);
                } else {
                    cars.add(i, cars.get(i).moveRight());
                    cars.remove(i + 1);
                }
            }
        }
    }

    public void testForNewCar() {
        if (!cars.isEmpty() && !cars.get(0).intersects(bounds)) {
            cars.remove(0);
            addCar();
        }
    }

    public boolean intersects(Frog f) {
        for (Car car : cars) {
            if ((car != null) && !car.empty() && car.intersects(f.getBounds()))
                return true;
        }
        return false;
    }

    public void draw(Graphics g) {
        //g.setColor(Color.DARK_GRAY);
        //g.fillRect(0,y,(int)bounds.getWidth(), src.core.CarComponents.Car.HEIGHT);
        for (Car car : cars) {
            if (car != null)
                car.draw(g);
        }
    }

    public void update() {
        moveCars();
        testForNewCar();
    }
}