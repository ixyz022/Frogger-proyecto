package src.froggerLevel;

public class LevelStructure {
    private final int[] speed;
    private final String[] pattern;

    public LevelStructure(int[] speed, String[] pattern) {
        this.speed = speed;
        this.pattern = pattern;
    }

    public int[] getSpeed() {
        return speed;
    }

    public String[] getPattern() {
        return pattern;
    }
}