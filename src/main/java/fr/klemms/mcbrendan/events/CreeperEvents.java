package fr.klemms.mcbrendan.events;

import java.util.Iterator;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

import fr.klemms.mcbrendan.MCBrendan;

public class CreeperEvents implements Listener {

	@EventHandler
	public void onCreeperExplode(EntityExplodeEvent event) {
		if (event.getEntityType() != EntityType.CREEPER)
			return;
		
		event.setYield(1F);
		
		Iterator<Block> blocks = event.blockList().iterator();
		
		while(blocks.hasNext()) {
			Block b = blocks.next();
			
			if (MCBrendan.CREEPER_PREVENT_LIST.contains(b.getType())) {
				blocks.remove();
			}
		}
	}
	
	@EventHandler
	public void preventHangingsRemoval(HangingBreakByEntityEvent event) {
		if (event.getRemover().getType() != EntityType.CREEPER)
			return;
		
		event.setCancelled(true);
	}
	
	@EventHandler
	public void preventArmorStandRemoval(EntityDamageByEntityEvent event) {
		if (event.getEntityType() != EntityType.ARMOR_STAND || event.getDamager().getType() != EntityType.CREEPER)
			return;
		
		event.setCancelled(true);
	}
}
