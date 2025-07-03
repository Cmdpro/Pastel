package earth.terrarium.pastel.data.lang.guidebook.effects;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class EffectProlongingEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.effect_prolonging.name", "Effect Prolonging (Stacking)");
		provider.add("book.pastel.guidebook.effect_prolonging.page0.text", "When I get other status effects, while this is active, they last longer.");
		provider.add("book.pastel.guidebook.effect_prolonging.page1.text", "Instead, when I get a level of Effect Prolonging, additional levels are stacked on top of existing levels, increasing the potency of the effect rather than resetting it's duration.");
	}
}
