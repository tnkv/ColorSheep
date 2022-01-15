package ru.tnkv.sheepspawner;

import org.bukkit.plugin.java.JavaPlugin;
import ru.tnkv.sheepspawner.commands.*;

public final class SheepSpawner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
       System.out.println("SheepSpawner enabled");
       this.getCommand("sheep").setExecutor(new CommandSheep());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("SheepSpawner disabled");
    }
}
