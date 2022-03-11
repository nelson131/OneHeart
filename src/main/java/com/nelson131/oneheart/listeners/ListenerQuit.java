package com.nelson131.oneheart.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.net.http.WebSocket;

public class ListenerQuit implements WebSocket.Listener {
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onQuit(PlayerQuitEvent Event){
        Player player = Event.getPlayer();
        player.getHealth();
        player.saveData();
    }
}
