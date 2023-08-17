package com.sieadev.minigolf.commands;

import com.sieadev.minigolf.util.openGui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class golf implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player)sender;
            new openGui(p);
        } else sender.sendMessage("You can not open the menu from the console.");

        return true;
    }
}
