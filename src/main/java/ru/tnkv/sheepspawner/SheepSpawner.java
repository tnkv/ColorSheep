package ru.tnkv.sheepspawner;

import ru.tnkv.sheepspawner.*;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public final class SheepSpawner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
       System.out.println("SheepSpawner enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("SheepSpawner disabled");
    }
}
