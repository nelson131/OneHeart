package com.nelson131.oneheart;

import com.nelson131.oneheart.commands.OnOneHp;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.logging.Logger;

public class OneHeart extends JavaPlugin {
    Logger log = getLogger();
            @Override
    public void onEnable(){
                saveDefaultConfig();
                log.info("Enabled OneHeart Plugin");
                getCommand("hearts").setExecutor(new OnOneHp());
            }
            @Override
    public void onDisable(){
                log.info("Disabled OneHeart Plugin");
            }

}

