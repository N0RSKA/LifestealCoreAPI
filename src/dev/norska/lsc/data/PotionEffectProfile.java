package dev.norska.lsc.data;

import org.bukkit.potion.PotionEffectType;

import lombok.Getter;
import lombok.Setter;

public class PotionEffectProfile {

	@Getter @Setter private int strength, duration;
	@Getter @Setter private PotionEffectType effect;
	
}
