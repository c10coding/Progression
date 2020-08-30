package net.dohaw.play.progression;

import lombok.Getter;
import net.dohaw.play.progression.files.BaseConfig;
import net.dohaw.play.progression.utils.XPHelper;
import org.bukkit.plugin.java.JavaPlugin;

public final class Progression extends JavaPlugin {

    @Getter private BaseConfig baseConfig;

    @Override
    public void onEnable() {
        XPHelper.setBaseConfig(baseConfig);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
