package com.noobplayer77777.firstplugin;

import com.noobplayer77777.firstplugin.command.firstplugincommands;
import com.noobplayer77777.firstplugin.events.firstpluginevents;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class firstplugin extends JavaPlugin  {

    @Override
    public void onEnable() {
        firstplugincommands newcommands = new firstplugincommands();
        getServer().getPluginManager().registerEvents(new firstpluginevents(), this);
        getCommand("heal").setExecutor(newcommands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN+ "[firstplugin] : plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED+ "[firstplugin] : plugin is disabled!");
    }
}