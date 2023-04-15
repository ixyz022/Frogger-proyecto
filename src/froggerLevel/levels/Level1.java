package src.froggerLevel.levels;

import src.froggerLevel.FroggerLevel;
import src.froggerLevel.LevelStructure;

public class Level1 {
    public static FroggerLevel getFroggerLevel() {
        return new FroggerLevel(
                new int[]{1, 1, 1},
                new String[]{"LLL      LLL       ", "RRRR     RRRR     RRRR     ",
                        "RR  BB     LL  MM     "});
    }
}