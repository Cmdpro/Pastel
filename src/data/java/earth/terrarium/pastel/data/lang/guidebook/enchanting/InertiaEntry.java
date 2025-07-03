package earth.terrarium.pastel.data.lang.guidebook.enchanting;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class InertiaEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.inertia.page0.text", "I'd almost think this enchantment breathes a little life into my tools.\\\n\\\nLike a living creature, the tool gradually gets used to the block that I'm mining and specializes in it. The trade-off is that it becomes slower at mining other blocks when switching.");
		provider.add("book.pastel.guidebook.inertia.page1.text", "Reduced mining speed. Speed picks up with each block of the same type mined.\\\n\\\nMax Level: 3\\\nApplicable to mining tools.\\\nMutually exclusive with Efficiency.");
	}
}
