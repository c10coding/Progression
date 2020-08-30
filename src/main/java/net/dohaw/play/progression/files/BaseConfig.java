package net.dohaw.play.progression.files;

import me.c10coding.coreapi.files.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class BaseConfig extends Config {

    public BaseConfig(JavaPlugin plugin) {
        super(plugin, "config.yml");
    }

    public double getDifficultyFactor(){
        return config.getDouble("Difficulty Factor");
    }

    public double getBaseXP(){
        return config.getDouble("Base XP");
    }

}
