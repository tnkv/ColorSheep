package ru.tnkv.sheepspawner.colors;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.DyeColor;
import org.bukkit.Location;


public class color {

    public void red(Player p){
        Location locRaw = p.getLocation();
        Location location = new Location(p.getWorld(), locRaw.getX(), locRaw.getY() + 5, locRaw.getZ());
        Sheep entity = (Sheep) p.getWorld().spawnEntity(location, EntityType.SHEEP); 
        entity.setColor(DyeColor.RED);
        
    };
    public static void blue(Player p){
        Location locRaw = p.getLocation();
        Location location = new Location(p.getWorld(), locRaw.getX(), locRaw.getY() + 5, locRaw.getZ());
        Sheep entity = (Sheep) p.getWorld().spawnEntity(location, EntityType.SHEEP); 
        entity.setColor(DyeColor.BLUE);

    };
    public static void green(Player p){
        Location locRaw = p.getLocation();
        Location location = new Location(p.getWorld(), locRaw.getX(), locRaw.getY() + 5, locRaw.getZ());
        Sheep entity = (Sheep) p.getWorld().spawnEntity(location, EntityType.SHEEP); 
        entity.setColor(DyeColor.GREEN);

    };
    public static void yellow(Player p){
        Location locRaw = p.getLocation();
        Location location = new Location(p.getWorld(), locRaw.getX(), locRaw.getY() + 5, locRaw.getZ());
        Sheep entity = (Sheep) p.getWorld().spawnEntity(location, EntityType.SHEEP); 
        entity.setColor(DyeColor.YELLOW);

}
    
}



