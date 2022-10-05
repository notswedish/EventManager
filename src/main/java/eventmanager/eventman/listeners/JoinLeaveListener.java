package eventmanager.eventman.listeners;

import eventmanager.eventman.Eventman;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {




    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if(Eventman.getInstance().getConfig().getString("JoinMessage").equals(null)){
            //event.getPlayer().sendMessage("JoinMessageDeactivated");

        }else{
            String JoinMessage = Eventman.getInstance().getConfig().getString("JoinMessage").replaceAll("%player%", event.getPlayer().getDisplayName()).replaceAll("&", "§");
            event.setJoinMessage(JoinMessage);
        }
    }


    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        if(Eventman.getInstance().getConfig().getString("LeaveMessage").equals(null)){
            //event.getPlayer().sendMessage("QuitMessageDeactivated");
        }else{
            String LeaveMessage = Eventman.getInstance().getConfig().getString("LeaveMessage").replaceAll("%player%", event.getPlayer().getDisplayName()).replaceAll("&", "§");
            event.setQuitMessage(LeaveMessage);
        }
    }



    }


