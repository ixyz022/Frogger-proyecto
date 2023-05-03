package src.core.TrafficComponents;

import src.core.carComponents.Car;
import src.core.frogComponents.Frog;

import java.awt.*;

public class TrafficPattern extends TrafficPatternBase {

    private CarManager carManager;

    public TrafficPattern(int speed, String pattern, boolean left, Rectangle bounds, int y) {
        super(speed, pattern, left, bounds, y);
        carManager = new CarManager(speed, pattern, left, bounds, y);
    }

    public void addCar() {
        carManager.addCar();
    }

    public void moveCars() {
        carManager.moveCars(left);
    }

    public void testForNewCar() {
        carManager.testForNewCar(bounds);
    }

    public boolean intersects(Frog f) {
        for (Car car : carManager.getCars()) {
            if ((car != null) && !car.isEmpty() && car.intersects(f.getBounds()))
                return true;
        }
        return false;
    }

    public void draw(Graphics g) {
        for (Car car : carManager.getCars()) {
            if (car != null)
                car.draw(g);
        }
    }

    public void update() {
        moveCars();
        testForNewCar();
    }
}