package src.core.froggerLevel.levels;

import src.core.froggerLevel.FloggerLevel;

public class Level2 {
    public static FloggerLevel getFroggerLevel() {
        return new FloggerLevel(
                new int[]{2, 1, 2, 1, 2},
                new String[]{"RR         L  ", "BB  LL  RR     ", "    RR    MM     ",
                        "MMM     MMM     ", "RR      L     "});
    }
}