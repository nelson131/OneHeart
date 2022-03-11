package com.nelson131.oneheart.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OnOneHp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = ChatColor.WHITE + "[OneHeart]" + " ";
        String NoOP = prefix + ChatColor.AQUA + "You dont have permission to use this command.";
        if(command.getName().equalsIgnoreCase("hearts") && sender.isOp()){
            switch (args[0]) {
                case "on":
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.setMaxHealth(2.0);
                        sender.sendMessage(prefix + ChatColor.AQUA + "One Heart mode activated.");
                        sender.sendMessage(prefix + ChatColor.AQUA + "Good Luck!");

                        return true;
                    }
                case "off":
                    for (Player all : Bukkit.getServer().getOnlinePlayers()) {
                        all.setMaxHealth(20.0);
                        all.setHealth(20.0);
                        sender.sendMessage(prefix + ChatColor.AQUA + "One  Heart mode disabled." );
                        return true;
                    }
                case "help":
                    sender.sendMessage(ChatColor.WHITE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    sender.sendMessage(ChatColor.BLUE + "/hearts on" + " " + ChatColor.WHITE + "-" + " " + ChatColor.AQUA + "to activate one heart mode.");
                    sender.sendMessage(ChatColor.BLUE + "/hearts off" + " " + ChatColor.WHITE + "-" + " " + ChatColor.AQUA + "to disable one heart mode.");
                    sender.sendMessage(ChatColor.BLUE + "/hearts on" + " " + ChatColor.WHITE + "-" + " " + ChatColor.AQUA + "all commands of plugin. ");
                    sender.sendMessage(ChatColor.WHITE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    return true;
            }
        }

        else{
            sender.sendMessage(NoOP);
            return false;
        }
        return true;
    }

}
