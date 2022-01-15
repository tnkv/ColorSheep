package ru.tnkv.sheepspawner.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.io.*;
import org.bukkit.Bukkit;
import ru.tnkv.sheepspawner.*;


public class CommandSheep implements CommandExecutor {

    Colors color = new color();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("sheep")) {
        
        switch (equalsIgnoreCase) {
        case red: color.red((Player) sender, Integer.parseInt(args[1]));
            break;
        case blue: color.blue((Player) sender, Integer.parseInt(args[1]));
            break;
        case yellow: color.yellow((Player) sender, Integer.parseInt(args[1]));
            break;
        case green: color.green((Player) sender, Integer.parseInt(args[1]));
            break;
          }
        return false;
    }
}
}