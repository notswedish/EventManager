package eventmanager.eventman.api;

import eventmanager.eventman.Eventman;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public class commands implements CommandExecutor {


    //not being used anymore

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        /*if (sender instanceof Player) {
            if (sender.hasPermission("em.reload")) {
                if (args.length == 0) {
                    String emwrongsyntax = Eventman.getInstance().getConfig().getString("em-wrong-syntax").replaceAll("%player%", ((Player) sender).getDisplayName()).replaceAll("&", "§");
                    sender.sendMessage(emwrongsyntax);
                } else if (args.length != 0) {
                    if (args[0] == "-yes") {
                        Eventman.getInstance().reloadConfig();
                        String emreload = Eventman.getInstance().getConfig().getString("em-reload").replaceAll("%player%", ((Player) sender).getDisplayName()).replaceAll("&", "§");
                        sender.sendMessage(emreload);

                    } else {
                        String emwrongsyntax = Eventman.getInstance().getConfig().getString("em-wrong-syntax").replaceAll("%player%", ((Player) sender).getDisplayName()).replaceAll("&", "§");
                        sender.sendMessage(emwrongsyntax);
                    }
                }

            } else {
                String emwrongperms = Eventman.getInstance().getConfig().getString("em-missing-permission").replaceAll("%player%", ((Player) sender).getDisplayName()).replaceAll("&", "§");
                sender.sendMessage(emwrongperms);
            }


        } else {
            Eventman.getInstance().reloadConfig();
        }


        return false;
    */






        return false;
    }

}










