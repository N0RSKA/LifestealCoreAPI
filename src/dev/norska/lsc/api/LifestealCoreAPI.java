package dev.norska.lsc.api;

import java.util.List;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.norska.lsc.LifestealCore;
import dev.norska.lsc.data.PotionEffectProfile;

public class LifestealCoreAPI {
	
	private LifestealCore instance;

	public LifestealCoreAPI(LifestealCore instance) {
		this.instance = instance;
	}
	
	public void giveHeartItemToPlayer(Player player, String tier, int amount) {
		
	}
	
	public Boolean isBanningEnabled() {
		return null;
	}
	
	public int getMinimumHeartsWhenBanningIsDisabled() {
		return 0;	
	}
	
	public Boolean isEffectHeartItem(ItemStack item) {
		return null;
	}
	
	public int getEffectHeartItemHeartCost(ItemStack item) {
		return 0;
	}
	
	public int getEffectHeartItemCooldown(ItemStack item) {
		return 0;
	}
	
	public List<PotionEffectProfile> getEffectHeartItemPotionEffects(ItemStack item) {
		return null;
	}

	public String getEffectHeartItemTier(ItemStack item) {
		return null;
	}
	
	public String getEffectHeartItemParticleEffects(ItemStack item) {
		return null;
	}
	
	public int getEffectHeartItemParticleEffectsAmount(ItemStack item) {
		return 0;
	}
	
	public Boolean isBeaconBlock(Block b) {
		return null;
	}
	
	public void decreaseBeaconBlockDurability(Block b, Player p, int amount) {
		
	}
	
	public Boolean isBeaconItem(ItemStack item) {
		return null;
	}
	
	public Boolean isBeaconBoundToPlayer(ItemStack item) {
		return null;
	}
	
	public UUID getPlayerUUIDBoundToBeacon(ItemStack item) {
		return null;
	}
	
	public int getBeaconItemDurability(ItemStack item) {
		return 0;
	}
	
	public int getBeaconItemCooldown(ItemStack item) {
		return 0;
	}
	
	public int getBeaconItemReviveTime(ItemStack item) {
		return 0;
	}
	
	public Boolean isBeaconItemSilent(ItemStack item) {
		return null;
	}
	
	public String getBeaconItemTier(ItemStack item) {
		return null;
	}
	
	public Boolean isHeartItem(ItemStack item) {
		return null;
	}
	
	public int getHeartItemValue(ItemStack item) {
		return 0;
	}
	
	public int getHeartItemCooldown(ItemStack item) {
		return 0;
	}
	
	public String getHeartItemTier(ItemStack item) {
		return null;
	}
	
	public String getHeartItemParticleEffects(ItemStack item) {
		return null;
	}
	
	public int getHeartItemParticleEffectsAmount(ItemStack item) {
		return 0;
	}
	
	public void addPlayerHearts(UUID uuid, int amount) {

	}
	
	public int getPlayerMaxHearts(UUID uuid) {
		return 0;
	}
	
	public void setPlayerMaxHearts(UUID uuid, int amount) {

	}
	
	public void removePlayerHearts(UUID uuid, int amount, Boolean silent) {

	}
	
	public void setPlayerHearts(UUID uuid, int amount) {

	}
	
	public int getPlayerHearts(UUID uuid) {
		return 0;
	}
	
	public void setPlayerEliminated(UUID uuid, Boolean eliminated, Boolean silent) {

	}
	
	public Boolean isPlayerEliminated(UUID uuid) {
		return null;
	}
	
	public void setPlayerBantime(UUID uuid, int seconds) {

	}
	
	public int getPlayerBantime(UUID uuid) {
		return 0;
	}

}
