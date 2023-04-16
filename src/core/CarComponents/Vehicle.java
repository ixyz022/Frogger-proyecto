package src.core.carComponents;

import java.awt.*;

public interface Vehicle {
    int WIDTH = 18;
    int HEIGHT = 18;

    Vehicle moveLeft();

    Vehicle moveRight();

    boolean isEmpty();

    void draw(Graphics g);
}