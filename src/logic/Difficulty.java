package logic;

import utils.Util;

public class Difficulty {

    private int difficultyLevel;
    public final int MAX_LEVEL = 10;
    public final int MIN_LEVEL = 1;

    public Difficulty() {
        setDifficultyLevel(1);
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public final void setDifficultyLevel(int difficultyLevel) {
        if (Util.isBetween(difficultyLevel, MIN_LEVEL, MAX_LEVEL)) {
            this.difficultyLevel = difficultyLevel;
        }
    }

}
