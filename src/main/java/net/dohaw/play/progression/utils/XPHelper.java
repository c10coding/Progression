package net.dohaw.play.progression.utils;

import lombok.Setter;
import net.dohaw.play.progression.files.BaseConfig;

public class XPHelper {

    @Setter private static BaseConfig baseConfig;

    public static int calculateXPByLevel(int level){
        double baseXP = baseConfig.getBaseXP();
        double difficultyFactor = baseConfig.getDifficultyFactor();
        return (int) Math.round(baseXP * (level * difficultyFactor));
    }

}
