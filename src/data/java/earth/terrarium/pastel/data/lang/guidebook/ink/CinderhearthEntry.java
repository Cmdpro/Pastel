package earth.terrarium.pastel.data.lang.guidebook.ink;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class CinderhearthEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.cinderhearth.page0.text", "A state-of-my-art Blast Furnace that consumes [#](e16201)Orange Ink[#]() to smelt ores and the like.\\\n\\\nI can further enhance its abilities using [Upgrades](entry://magical_blocks/upgrades).");
		provider.add("book.pastel.guidebook.cinderhearth.page1.text", "Putting in a [Knowledge Gem](entry://enchanting/knowledge_gem) will funnel experience gained from smelting XP into it.");
		provider.add("book.pastel.guidebook.cinderhearth.page2.text", "Upgrades must be placed on the two Chiseled Blocks.");
		provider.add("book.pastel.guidebook.cinderhearth.page3.text", "- 1 Cinderhearth\n- 21 Polished Blocks\n- 6 Crest Blocks\n- 5 Glass-like Blocks\n- 2 Chiseled Blocks\n- 6 Buckets of Lava\n\n\\\n*Did it really need that [#](bb00bb)Lava[#]() underneath since I already have [#](e16201)Ink[#]()*?\\\nNo, not really. But it looks so. much. better.");
		provider.add("book.pastel.guidebook.cinderhearth.page4.text", "[Upgrades](entry://magical_blocks/upgrades) placed on the [#](bb00bb)Chiseled Blocks[#]() require an additional type of [Ink](entry://ink/ink), depending on the type of Upgrade. The higher the upgrades level, the higher the consumption.");
		provider.add("book.pastel.guidebook.cinderhearth.page4.title", "Upgrades");
		provider.add("book.pastel.guidebook.cinderhearth.page5.text", "- Speed ([#](aa32a0)Magenta Ink[#]()):\nfaster smelt times\n- Yield ([#](258ac8)Light Blue Ink[#]()):\nchance to multiply the output\n- Experience ([#](ff4ff6)Purple Ink[#]()):\nvastly increases experience gain\n- Efficiency ([#](302951)Black Ink[#]()):\nvastly decreased Ink consumption of other types, including [#](e16201)Orange[#]()");
	}
}
