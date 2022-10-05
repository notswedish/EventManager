package eventmanager.eventman;

import eventmanager.eventman.api.api;
import eventmanager.eventman.api.commands;
import eventmanager.eventman.listeners.JoinLeaveListener;
import eventmanager.eventman.listeners.server.ServerListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class Eventman extends JavaPlugin {
private static Eventman instance;




    @Override
    public void onEnable() {
        saveDefaultConfig();

        if (getConfig().getBoolean("send-startup-message-in-console")) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a EventManager v6.9 successfully enabled"));
        }


        getServer().getPluginManager().registerEvents(new ServerListeners(), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getCommand("test").setExecutor(new commands());

    }

    public Eventman() {
        instance = this;
    }

    public static Eventman getInstance() {
        return instance;
    }






    @Override
    public void onDisable() {

    }
}
