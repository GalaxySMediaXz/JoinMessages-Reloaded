
package me.galaxysmediaxz.jmreloaded;

import java.util.EventListener;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
public class JoinEvent implements Listener {

    private main plugin;
    
    public JoinEvent(main plugin)   {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(plugin.getConfig().getBoolean("Settings.Custom-Join-Message", true)){
           e.setJoinMessage(plugin.getConfig().getString("Messages.Join-Message").replace("&", "§").replace("%player%", p.getName()));
        }
        if (plugin.getConfig().getBoolean("Settings.ClearChat-On-Join", true)){
            for (int i = 0; i <100; i++){
            p.sendMessage("  ");   
        }
        }        
        if (plugin.getConfig().getBoolean("Settings.Motd-On-Join", true)){
            List<String> Lines = plugin.getConfig().getStringList("Messages.MOTD");
        for (String s : Lines) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&' , s).replace("%player%", p.getName()));
        }
        return;
    }else{
            return;
        }
    }
    
}
