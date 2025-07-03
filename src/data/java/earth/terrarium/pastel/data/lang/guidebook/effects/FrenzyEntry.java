package earth.terrarium.pastel.data.lang.guidebook.effects;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class FrenzyEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.frenzy.page0.text", "My damage, attack speed, movement speed and knockback resistance were buffed with each kill. The higher the level of the effect, the higher the buff.\\\nWhen I fail to get a kill in 10 seconds, I get a debuff instead.");
		provider.add("book.pastel.guidebook.frenzy.page1.text", "Instead, when I get a level of Frenzy, additional levels are stacked on top of existing levels, increasing the potency of the effect rather than resetting it's duration.");
	}
}
