package dev.norska.lsc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class LSCPlayerByGeneralCauseDeathEvent extends Event implements Cancellable{

    private final Player victim;
    private final DamageCause cause;
    private boolean isCancelled;

    public LSCPlayerByGeneralCauseDeathEvent(Player victim, DamageCause cause) {
        this.victim = victim;
        this.cause = cause;
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
    
    public DamageCause getCause() {
        return this.cause;
    }

}
