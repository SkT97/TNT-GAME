package me.skt97.tntgame;

import org.bukkit.plugin.java.JavaPlugin;

public final class TNTGame extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Il plugin TNT Game è stato attivato!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Il plugin TNT Game è stato disattivato!");
    }
}
