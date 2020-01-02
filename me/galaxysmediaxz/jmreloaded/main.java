
package me.galaxysmediaxz.jmreloaded;

import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
public class main extends JavaPlugin{
    
    
    
    private main plugin;
    private JoinEvent sub;
    private QuitEvent sup;

    
    @Override
    public void onEnable(){
        if(getConfig().getBoolean("Enable", true)){
        getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §ais starting...\n§b§lVersion: §a0.7\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------");
        
        Bukkit.getPluginManager().registerEvents(new JoinEvent(this), this);
        Bukkit.getPluginManager().registerEvents(new QuitEvent(this), this);
        saveDefaultConfig();
        if(getConfig().getBoolean("Settings.Check-For-Update", true)){
        try {
                getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §aChecking for update\n§6§lIn this time may server may not working until sucess\n§eDisable it in config!\n§a-----------------------------------------------------");
        SpigotUpdater updater = new SpigotUpdater(this, 68407);
        if(updater.checkForUpdates()) {
            getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §aChecking for update : Results\n§aThere are have update!\n§b§lCurrent Version: §e" + Bukkit.getPluginManager().getPlugin("JoinMessages-Reloaded").getDescription().getVersion() + "\n§b§lNew Version: §e" + updater.getLatestVersion() + "\n§b§lYou can download at §e" + updater.getResourceURL() + "\n§a-----------------------------------------------------");
        }else{
        getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §cNo update!\n§a-----------------------------------------------------");
        }
        }catch(Exception e) {
        Bukkit.getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §aChecking for update : Results\n§cError was founded!\n§eShort Stacktrace: " + e + "\n§a-----------------------------------------------------");        }
       getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §aI'm ready!\n§b§lVersion: §a0.7\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------"); }else{
                           getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §4ACCESS IS DENIED\n§cCan't check for update because it disable by user\n§eEnable it in config!\n§a-----------------------------------------------------"); 
        }
        }else{
            getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §cis shutting down...\n§eBecause plugin enable was disabled by user in config\n§eSee you later!\n§b§lVersion: §a0.7\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }
    
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage("\n§a-----------------------------------------------------\n§b§lJoinMessages - Reloaded §cis stopping...\n§b§lVersion: §a0.7\n§b§lAuthor: §aGalaxySMediaXz\n§b§lUpdate Link: §ehttps://www.spigotmc.org/resources/68407\n§a-----------------------------------------------------");
    }
    
    @Override
    public void onLoad(){
        
    }
    
    
}
