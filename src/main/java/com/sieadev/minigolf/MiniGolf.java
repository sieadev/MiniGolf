package com.sieadev.minigolf;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class MiniGolf extends JavaPlugin {

    public static String prefix;
    public static int fadeIn;
    public static int stay;
    public static int fadeOut;

    // Messages
    public static String gameStart;
    public static String holeInOne;
    public static ArrayList<String> holeTitle;
    public static ArrayList<String> holeSubTitle;
    public static ArrayList<String> broadcastHoleInOne;
    public static ArrayList<String> broadcastHole;
    public static String noPermisson;
    public static ArrayList<String> outOfBounds;
    public static ArrayList<String> wrongItem;
    public static int countdown;
    public static boolean broadcastHoleMessage;
    public static int startTime;
    public static int maximumHits;


    @Override
    public void onEnable() {
        saveDefaultConfig();
        loadConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig() {
        prefix = getConfig().getString("prefix");
        fadeIn = getConfig().getInt("fadeIn");
        stay = getConfig().getInt("stay");
        fadeOut = getConfig().getInt("fadeOut");
        gameStart = getConfig().getString("GameStart");
        holeInOne = getConfig().getString("holeInOne");
        holeTitle = (ArrayList<String>) getConfig().getStringList("holeTitle");
        holeSubTitle = (ArrayList<String>) getConfig().getStringList("holeSubTitle");
        broadcastHoleInOne = (ArrayList<String>) getConfig().getStringList("broadcastHoleInOne");
        broadcastHole = (ArrayList<String>) getConfig().getStringList("broadcastHole");
        noPermisson = getConfig().getString("noPermisson");
        countdown = getConfig().getInt("countdown");
        broadcastHoleMessage = getConfig().getBoolean("broadcastHoleMessage");
        startTime = getConfig().getInt("startTime");
        maximumHits = getConfig().getInt("maximumHits");
        outOfBounds = (ArrayList<String>) getConfig().getStringList("outOfBounds");
        wrongItem = (ArrayList<String>) getConfig().getStringList("wrongItem");
    }
}
