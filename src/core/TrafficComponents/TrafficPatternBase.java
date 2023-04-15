package src.core.TrafficComponents;

import java.awt.*;

public abstract class TrafficPatternBase {
    protected int speed;
    protected String pattern;
    protected boolean left;
    protected Rectangle bounds;
    protected int y;

    public TrafficPatternBase(int speed, String pattern, boolean left, Rectangle bounds, int y)
    {
        this.speed = speed;
        this.pattern = pattern;
        this.left = left;
        this.bounds = bounds;
        this.y = y;
    }
}
