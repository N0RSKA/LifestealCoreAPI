package dev.norska.lsc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EffectHeartConsumeEvent extends Event implements Cancellable{

    private final Player player;
    private final String tier;
    private boolean isCancelled;

    public EffectHeartConsumeEvent(Player player, String tier) {
        this.player = player;
        this.tier = tier;
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

}
