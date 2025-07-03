package earth.terrarium.pastel.data.lang.guidebook.ink;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class ColorPickerEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.color_picker.page0.text", "Converts [Pigment](entry://general/pigment) into pure [Ink](entry://ink/ink) so I can transfer it into containers, such as [Ink Flasks](entry://ink/ink_flask).\\\n\\\nUnfortunately - [because of the way Ink is transferred](entry://ink/ink@transfer) - there is always some left over. Kind of annoying... although I see some benefit in it, too: The bigger the difference between containers, the faster the transfer!");
		provider.add("book.pastel.guidebook.color_picker.page1.text", "*Never develop a passion you can't afford. It'll eat away at your heart like a bookworm.*");
	}
}
