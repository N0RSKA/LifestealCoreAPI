package dev.norska.lsc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class HeartConsumeEvent extends Event implements Cancellable{

    private final Player player;
    private final String tier;
    private Integer hearts;
    private boolean isCancelled;

    public HeartConsumeEvent(Player player, String tier, Integer hearts) {
        this.player = player;
        this.tier = tier;
        this.hearts = hearts;
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

    public Integer getHearts() {
    	return this.hearts;
    }
    
    public void setHearts(Integer amount) {
    	hearts = amount;
    }

}
