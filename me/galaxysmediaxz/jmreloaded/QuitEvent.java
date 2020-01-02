
package me.galaxysmediaxz.jmreloaded;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEvent implements Listener {

        private main plugin;    
    public QuitEvent(main plugin)   {
        this.plugin = plugin;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e){
        Player p = e.getPlayer();
        if(plugin.getConfig().getBoolean("Settings.Custom-Quit-Message", true)){
            e.setQuitMessage(plugin.getConfig().getString("Messages.Quit-Message").replace("%player%", p.getName()).replace("&", "§"));
        }
    }
    
}
