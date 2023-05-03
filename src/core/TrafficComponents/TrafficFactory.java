package src.core.TrafficComponents;

import src.core.carComponents.Car;
import src.core.carComponents.cars.*;

import java.awt.*;
import java.util.*;

public class TrafficFactory extends TrafficPatternBase {
    private int next = 0;
    Vector<Car> cars = new Vector<Car>();

    public TrafficFactory(int speed, String pattern, boolean left, Rectangle bounds, int y) {
        super(speed, pattern, left, bounds, y);
    }

    public Vector<Car> initCars() {

        for (int next = 0; next * Car.WIDTH <= bounds.getWidth(); next++) {
            switch (pattern.charAt(next)) {
                case 'R' ->
                        this.cars.add(new RedCar(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed));
                case 'B' ->
                        this.cars.add(new BlueCar(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed));
                case 'L' ->
                        this.cars.add(new BlackCar(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed));
                case 'M' ->
                        this.cars.add(new MagentaCar(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed));
                default ->
                        this.cars.add(new Car(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed, null));
            }
        }
        return this.cars;
    }


    public void createCar() {
        next++;
        if(next >= pattern.length())
            next = 0;
        switch (pattern.charAt(next)) {
            case 'R' -> cars.add(new RedCar(left ? (int) bounds.getWidth() : 0, y, speed));
            case 'Y' -> cars.add(new YellowCar(left ? (int) bounds.getWidth() : 0, y, speed));
            case 'B' -> cars.add(new BlueCar(left ? (int) bounds.getWidth() : 0, y, speed));
            case 'L' -> cars.add(new BlackCar(left ? (int) bounds.getWidth() : 0, y, speed));
            case 'M' -> cars.add(new MagentaCar(left ? (int) bounds.getWidth() : 0, y, speed));
            default -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, null));
        }
    }
}
