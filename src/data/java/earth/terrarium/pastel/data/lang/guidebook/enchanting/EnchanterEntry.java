package earth.terrarium.pastel.data.lang.guidebook.enchanting;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnchanterEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.enchanter.name", "The Enchanter");
		provider.add("book.pastel.guidebook.enchanter.page0.text", "In my search for the perfect tool, I've found that the [#](bb00bb)Enchanting Table[#]() often doesn't do my bidding. This highly modified Enchanting Table should resolve most of the issues I had with the original one.[#]()\\\n\\\nIt allows me to:\n- [create new Enchanted Books](entry://enchanting/creating_enchanted_books)\n- [upgrade them](entry://enchanting/upgrading_enchanted_books)\n- [enchant items without consuming Enchanted Books](entry://enchanting/enchanting_items)");
		provider.add("book.pastel.guidebook.enchanter.page1.text", "The Enchanter needs a focus structure to work.");
		provider.add("book.pastel.guidebook.enchanter.page2.text", "Dimensions: 11x11x5 blocks\\\nCan be enhanced by placing [Upgrades](entry://magical_blocks/upgrades) on the four Gemstone Blocks.");
		provider.add("book.pastel.guidebook.enchanter.page3.text", "- 1 Enchanter\n- 8 Item Bowls\n- 4+ Liquid Crystal Buckets\n- 4 Polished Gemstone Blocks\n- 8 Gemstone Lights\n- 12 Polished Pillars\n- 24 Polished Slabs\n- 159 Polished Blocks\n\n\\\n*Enhance the Enchanter with Upgrades by placing them on the Gemstone Blocks.*");
	}
}
