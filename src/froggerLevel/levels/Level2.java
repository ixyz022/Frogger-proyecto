package src.froggerLevel.levels;

import src.froggerLevel.FroggerLevel;
import src.froggerLevel.LevelStructure;

public class Level2 {
    public static FroggerLevel getFroggerLevel() {
        return new FroggerLevel(
                new int[]{2, 1, 2, 1, 2},
                new String[]{"RR         L  ", "BB  LL  RR     ", "    RR    MM     ",
                        "MMM     MMM     ", "RR      L     "});
    }
}