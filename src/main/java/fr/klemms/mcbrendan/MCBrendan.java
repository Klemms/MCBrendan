package fr.klemms.mcbrendan;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import fr.klemms.mcbrendan.events.CreeperEvents;

public class MCBrendan extends JavaPlugin {
	
	public static Material[] CREEPER_PREVENT = {
			Material.BEE_NEST, 
			Material.BEEHIVE, 
			Material.ACACIA_SIGN, 
			Material.ACACIA_WALL_SIGN, 
			Material.BIRCH_SIGN, 
			Material.BIRCH_WALL_SIGN, 
			Material.CRIMSON_SIGN, 
			Material.CRIMSON_WALL_SIGN, 
			Material.DARK_OAK_SIGN, 
			Material.DARK_OAK_WALL_SIGN, 
			Material.JUNGLE_SIGN, 
			Material.JUNGLE_WALL_SIGN, 
			Material.OAK_SIGN, 
			Material.OAK_WALL_SIGN, 
			Material.SPRUCE_SIGN, 
			Material.SPRUCE_WALL_SIGN, 
			Material.WARPED_SIGN, 
			Material.WARPED_WALL_SIGN, 
			Material.CHEST, 
			Material.TRAPPED_CHEST, 
			Material.DISPENSER, 
			Material.FURNACE, 
			Material.BREWING_STAND, 
			Material.HOPPER, 
			Material.DROPPER, 
			Material.BARREL, 
			Material.SMOKER, 
			Material.BLAST_FURNACE, 
			Material.CAMPFIRE, 
			Material.SOUL_CAMPFIRE, 
			Material.LECTERN, 
			Material.BEACON, 
			Material.SPAWNER, 
			Material.NOTE_BLOCK, 
			Material.JUKEBOX, 
			Material.ENCHANTING_TABLE, 
			Material.ENDER_CHEST, 
			Material.DAYLIGHT_DETECTOR, 
			Material.FLOWER_POT, 
			Material.COMPARATOR, 
			Material.REPEATER, 
			Material.BELL};
	
	public static List<Material> CREEPER_PREVENT_LIST = Arrays.asList(CREEPER_PREVENT);

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new CreeperEvents(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
