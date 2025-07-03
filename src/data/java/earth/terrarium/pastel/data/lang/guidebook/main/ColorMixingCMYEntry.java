package earth.terrarium.pastel.data.lang.guidebook.main;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class ColorMixingCMYEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.color_mixing_cmy.name", "Color Mixing");
		provider.add("book.pastel.guidebook.color_mixing_cmy.description", "How to combine and not combine colors");
		provider.add("book.pastel.guidebook.color_mixing_cmy.page0.text", "I can create any color by mixing the primary colors [#](157687)Cyan[#](), [#](aa32a0)Magenta[#]() and [#](f0af15)Yellow[#]()!\\\n*...in theory*.");
		provider.add("book.pastel.guidebook.color_mixing_cmy.page1.text", "My attempts to mix [Gemstone Powder](entry://general/gemstone_powder) directly have not been very successful. Just crafting them together just will not do.\\\n\\\nBut now I have another idea:\\\nthe closeness of my gemstones to nature suggests that *nature* could be the answer, too!\\\n\\\n[This recipe](entry://general/colored_trees) looks very promising and worth a try! I used the [Gemstone Powder](entry://general/gemstone_powder) to infuse [#](bb00bb)Saplings[#]() as a middleman instead.");
	}
}
