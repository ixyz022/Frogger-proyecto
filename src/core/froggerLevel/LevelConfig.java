package src.core.froggerLevel;

import src.core.froggerLevel.levels.Level1;
import src.core.froggerLevel.levels.Level2;
import src.core.froggerLevel.levels.Level3;

import java.util.ArrayList;
import java.util.List;

public class LevelConfig {
    public static List<FloggerLevel> getLevels() {
        List<FloggerLevel> levels = new ArrayList<>();

        FloggerLevel level1 = Level1.getFroggerLevel();
        FloggerLevel level2 = Level2.getFroggerLevel();
        FloggerLevel level3 = Level3.getFroggerLevel();


        levels.add(level1);
        levels.add(level2);
        levels.add(level3);

        return levels;
    }
}
