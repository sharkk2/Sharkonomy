package org.sharkconomy.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.sharkconomy.utils.PlayerData;

public class playerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        PlayerData.giveStartingBalance(event.getPlayer());
    }
}
