package dev.norska.lsc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BeaconConsumeEvent extends Event implements Cancellable{

    private final Player player;
    private final String tier;
    private Integer reviveTime, durability;
    private boolean isCancelled;

    public BeaconConsumeEvent(Player player, String tier, Integer reviveTime, Integer durability) {
        this.player = player;
        this.tier = tier;
        this.reviveTime = reviveTime;
        this.durability = durability;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public String getTier() {
        return this.tier;
    }

    public Integer getReviveTime() {
    	return this.reviveTime;
    }
    
    public void setReviveTime(Integer seconds) {
    	reviveTime = seconds;
    }
    
    public Integer getDurability() {
    	return this.durability;
    }
    
    public void setDurability(Integer hits) {
    	durability = hits;
    }

}
