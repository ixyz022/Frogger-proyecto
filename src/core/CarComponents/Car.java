package src.core.carComponents;

import java.awt.*;

public class Car extends Rectangle implements Vehicle {
	private final int speed;
	private final Color color;

	public Car(int x, int y, int speed, Color color) {
		super(x, y, WIDTH, HEIGHT);
		this.speed = speed;
		this.color = color;
	}

	@Override
	public Vehicle moveLeft() {
		return new Car(x - speed, y, speed, color);
	}

	@Override
	public Vehicle moveRight() {
		return new Car(x + speed, y, speed, color);
	}

	@Override
	public boolean isEmpty() {
		return color == null;
	}

	@Override
	public void draw(Graphics g) {
		if (color != null) {
			g.setColor(color);
			g.fillRect(x, y, WIDTH, HEIGHT);
		}
	}
}