package earth.terrarium.pastel.data.lang.guidebook.ink;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class InkEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.ink.name", "Ink");
		provider.add("book.pastel.guidebook.ink.page0.text", "Now that I'm familiar with [Pigment](entry://general/pigment), I see no reason to lug it around like in the Middle Ages. I have found a way to convert [Pigment](entry://general/pigment) into a higher form of energy!\\\n\\\nI called it **[#](5bffed)I[#](aa32a0)n[#](eded00)k[#]()**.");
		provider.add("book.pastel.guidebook.ink.page1.text", "[Pigment](entry://general/pigment) can be converted to Ink using the [Color Picker](entry://ink/color_picker) and then extracted into containers like an [Ink Flask](entry://ink/ink_flask).\\\n\\\nThe only drawback: deprived of its physical form, there is no way to reverse this transformation.");
		provider.add("book.pastel.guidebook.ink.page1.title", "Producing & Storing");
		provider.add("book.pastel.guidebook.ink.page2.text", "Ink behaves a bit like gas. It flows from where it is abundant to where there is little.");
		provider.add("book.pastel.guidebook.ink.page2.title", "Transfer");
		provider.add("book.pastel.guidebook.ink.page3.text", "\\\nWhen two objects that store Ink are connected - like when putting in an [Ink Flask](entry://ink/ink_flask) into a [Color Picker](entry://ink/color_picker) - the Ink between the two will slowly equalize.\\\nThe larger the difference, the faster the Flask is filled.");
	}
}
