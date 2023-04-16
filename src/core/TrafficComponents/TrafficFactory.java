package src.core.TrafficComponents;

import src.core.carComponents.Car;

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
                        this.cars.add(new Car(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed, Color.RED));
                case 'B' ->
                        this.cars.add(new Car(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed, Color.BLUE));
                case 'L' ->
                        this.cars.add(new Car(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed, Color.BLACK));
                case 'M' ->
                        this.cars.add(new Car(left ? next * Car.WIDTH : (int) bounds.getWidth() - next * Car.WIDTH, y, speed, Color.MAGENTA));
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
            case 'R' -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, Color.RED));
            case 'B' -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, Color.BLUE));
            case 'L' -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, Color.BLACK));
            case 'M' -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, Color.MAGENTA));
            default -> cars.add(new Car(left ? (int) bounds.getWidth() : 0, y, speed, null));
        }
    }


}
