package eventmanager.eventman.api;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class api {

    private static api instance;

    public api() {
        instance = this;
    }

    public static api getInstance() {
        return instance;
    }



    public void sendMessageToEveryone(String message) {
        if (!(message.isEmpty())) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                players.sendMessage(message);
            }
        }else{ return;}
    }


    public void sendMessageToPrivileged(String permission, String message) {
        if (!(message.isEmpty())) {
        for (Player players : Bukkit.getOnlinePlayers()) {

            if(players.hasPermission(permission)) {
                players.sendMessage(message);
            }
        }
        }else{ return;}
    }


    public void sendMessageToOp(String message) {
        if (!(message.isEmpty())) {
        for (Player players : Bukkit.getOnlinePlayers()) {

            if (players.isOp()) {
                players.sendMessage(message);
            }

        }

        }else{ return;}




    }












    }







