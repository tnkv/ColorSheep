package ru.tnkv.sheepspawner.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ru.tnkv.sheepspawner.colors.color;


public class CommandSheep implements CommandExecutor {

    ru.tnkv.sheepspawner.colors.color colors = new color();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("sheep")) {
        
        switch (args[0]) {
        case "red": colors.red((Player) sender);           
            break;
        case "blue": color.blue((Player) sender);
            break;
        case "yellow": color.yellow((Player) sender);
            break;
        case "green": color.green((Player) sender);
            break;
          }
        return false;
    }
        return false;
}
}