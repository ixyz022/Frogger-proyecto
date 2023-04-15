package src.froggerLevel;

import src.froggerLevel.levels.Level1;
import src.froggerLevel.levels.Level2;

import java.util.ArrayList;
import java.util.List;

public class LevelConfig {
    public static List<FroggerLevel> getLevels() {
        List<FroggerLevel> levels = new ArrayList<>();

        FroggerLevel level1 = Level1.getFroggerLevel();
        FroggerLevel level2 = Level2.getFroggerLevel();

        levels.add(level1);
        levels.add(level2);

        return levels;
    }
}
