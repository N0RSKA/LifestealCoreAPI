package dev.norska.lsc.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LSCPlayerByPlayerDeathEvent extends Event implements Cancellable{

    private final Player victim;
    private final Player killer;
    private boolean isCancelled;

    public LSCPlayerByPlayerDeathEvent(Player victim, Player killer) {
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
    
    public Player getKiller() {
        return this.killer;
    }

}
