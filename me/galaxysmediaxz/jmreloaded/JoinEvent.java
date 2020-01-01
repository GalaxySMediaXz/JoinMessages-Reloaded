/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        for (int i = 0; i <100; i++){
            p.sendMessage("  ");
        }
        List<String> Lines = plugin.getConfig().getStringList("MOTD");
        for (String s : Lines) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&' , s).replace("%player%", p.getName()));
        }
    }
    
}
