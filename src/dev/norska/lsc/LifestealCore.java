package dev.norska.lsc;

import org.bukkit.plugin.java.JavaPlugin;

import dev.norska.lsc.api.LifestealCoreAPI;
import lombok.Getter;

public class LifestealCore extends JavaPlugin {
	
	private static LifestealCore instance;
	public LifestealCore() { instance = this; }
	public static LifestealCore getInstance() { return instance; }
	@Getter private LifestealCoreAPI API = new LifestealCoreAPI(this);

}
