package com.noobplayer77777.firstplugin.command;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class firstplugincommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender ;

            // /heal
            if (command.getName().equalsIgnoreCase("heal")) {
                double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
                        player.setHealth(maxHealth);
                return true;
            }

        }
        return true;
    }
}
