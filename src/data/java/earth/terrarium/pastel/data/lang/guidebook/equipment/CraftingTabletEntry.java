package earth.terrarium.pastel.data.lang.guidebook.equipment;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class CraftingTabletEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.crafting_tablet.page0.text", "The Crafting Tablet is so much more than just a portable [](item://minecraft:crafting_table). It remembers the recipe I insert and lets me craft it on demand later.");
		provider.add("book.pastel.guidebook.crafting_tablet.page1.text", "There may come a time when I need a certain material so often that I want to automate it. Or maybe I will become one of those masochists who automates every single item just because I can.\\\n\\\nThe [Pigment Pedestal](entry://general/pedestal) has a dedicated slot for a Crafting Tablet. If I add a Crafting Tablet and then hopper items into it, they will be placed as specified in the saved recipe.");
		provider.add("book.pastel.guidebook.crafting_tablet.page1.title", "Pedestal Automation");
	}
}
