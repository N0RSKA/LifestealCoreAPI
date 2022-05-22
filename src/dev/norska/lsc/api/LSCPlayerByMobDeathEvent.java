package dev.norska.lsc.api;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LSCPlayerByMobDeathEvent extends Event implements Cancellable{

    private final Player victim;
    private final Entity killer;
    private boolean isCancelled;

    public LSCPlayerByMobDeathEvent(Player victim, Entity killer) {
        this.victim = victim;
        this.killer = killer;
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

    public Player getVictim() {
        return this.victim;
    }
    
    public Entity getKiller() {
        return this.killer;
    }

}
