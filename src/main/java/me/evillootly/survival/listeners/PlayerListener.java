package me.evillootly.survival.listeners;

import me.evillootly.survival.survivalmain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener
{
    private transient survivalmain instance;

    public PlayerListener(survivalmain instance)
    {
        this.instance = instance;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event)
    {

    }
}
