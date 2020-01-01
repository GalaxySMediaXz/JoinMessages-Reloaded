
package me.galaxysmediaxz.jmreloaded;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
public class main extends JavaPlugin{
    
    
    
    private main plugin;
    private JoinEvent sub;

    
    @Override
    public void onEnable(){
        
        getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §ais starting...\n§b§lVersion: §a0.5\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------");
        
        Bukkit.getPluginManager().registerEvents(new JoinEvent(this), this);
        saveDefaultConfig();
    }
    
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §ais starting...\n§b§lVersion: §a0.5\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------");
    }
    
    
}
