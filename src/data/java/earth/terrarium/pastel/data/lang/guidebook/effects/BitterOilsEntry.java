package earth.terrarium.pastel.data.lang.guidebook.effects;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BitterOilsEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.bitter_oils.page0.text", "Another useful formula from the Poisoner's Handbook. This reagent makes the effects of my potions much harder to purge, causing Milk and similar items to reduce the duration of the effect rather than clearing it outright.\\\n\\\nUnfortunately, it also **heavily** reduces the yield of the brew.");
		provider.add("book.pastel.guidebook.bitter_oils.page1.text", "Attempting to apply a potion empowered in this way to a target under the effects of Immunity will reduce the duration of the Immunity, by an amount proportional to the incoming effect's potency.");
	}
}
