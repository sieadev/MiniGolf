package com.sieadev.minigolf.util;
import com.sieadev.minigolf.*;
import org.bukkit.entity.Player;

public class openGui {
    String noPermisson = MiniGolf.noPermisson;
    public openGui(Player p) {
        if (p.hasPermission("administration.gamemaker.golf.") || p.hasPermission("golf.admin")){
            //Open Gui
        }
        else p.sendMessage(noPermisson);
    }
}
