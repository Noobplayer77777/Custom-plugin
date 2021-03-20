package com.noobplayer77777.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class firstpluginevents implements Listener {
    @EventHandler
    public static void noPlayerJoin (PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome To The SERVER!");
         }
         @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event){
        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();
             Material block = player.getWorld().getBlockAt(x,y-1,z).getType();
                     if(block == Material.NETHERITE_BLOCK) {
                         player.sendMessage(ChatColor.DARK_PURPLE + "YOU HAVE BECOME THE RICHEST PLAYER ON THE SERVER BECAUSE YOU ARE WALKING ON NETHERITE BLOCK");
                     }
         }
}
