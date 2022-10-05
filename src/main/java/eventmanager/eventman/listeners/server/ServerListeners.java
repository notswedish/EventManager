package eventmanager.eventman.listeners.server;

import eventmanager.eventman.Eventman;
import eventmanager.eventman.api.api;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;


public class ServerListeners implements Listener {

    @EventHandler
    public void onPluginDisable(PluginDisableEvent event) {

        //if(Eventman.getInstance().getConfig().getBoolean("broadcast-message")){ }
        //if(Eventman.getInstance().getConfig().getString("broadcast").equals(null)){ }

        if (!(Eventman.getInstance().getConfig().getString("-broadcast-message").equals(null))) {
            api.getInstance().sendMessageToEveryone(Eventman.getInstance().getConfig().getString("-broadcast-message").replaceAll("&", "§").replaceAll("%plugin%", event.getPlugin().getName()));
        }
        if (!(Eventman.getInstance().getConfig().getString("-send-message-to-op").equals(null))) {
            api.getInstance().sendMessageToOp(Eventman.getInstance().getConfig().getString("-send-message-to-op").replaceAll("&", "§").replaceAll("%plugin%", event.getPlugin().getName()));
        }


    }


}
