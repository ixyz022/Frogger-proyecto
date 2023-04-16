package src.core.froggerLevel.levels;

import src.core.froggerLevel.FloggerLevel;

public class Level1 {
    public static FloggerLevel getFroggerLevel() {
        return new FloggerLevel(
                new int[]{1, 1, 1},
                new String[]{"LLL      LLL       ", "RRRR     RRRR     RRRR     ",
                        "RR  BB     LL  MM     YY"});
    }
}