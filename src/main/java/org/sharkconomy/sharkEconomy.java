package org.sharkconomy;

import org.bukkit.plugin.java.JavaPlugin;
import org.sharkconomy.commands.economy.EconomyCommand;
import org.sharkconomy.listeners.playerJoin;
import org.sharkconomy.commands.EconomyTabCompleter;
import org.sharkconomy.commands.economy.subcommands.Buy;

public final class sharkEconomy extends JavaPlugin {
    private static sharkEconomy instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("HELLO FROM SHARKONOMY");
        getCommand("economy").setExecutor(new EconomyCommand());
        getCommand("economy").setTabCompleter(new EconomyTabCompleter());
        getServer().getPluginManager().registerEvents(new playerJoin(), this);
        getServer().getPluginManager().registerEvents(new Buy(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static sharkEconomy getInstance() {
        return instance;
    }

}
