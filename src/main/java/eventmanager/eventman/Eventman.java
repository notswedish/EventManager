package eventmanager.eventman;

import eventmanager.eventman.listeners.Listeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Eventman extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        if (getConfig().getBoolean("send-startup-message-in-console")) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a EventManager v6.9 successfully enabled"));
        }

        getServer().getPluginManager().registerEvents(new Listeners(), this);


    }




    @Override
    public void onDisable() {

    }
}
