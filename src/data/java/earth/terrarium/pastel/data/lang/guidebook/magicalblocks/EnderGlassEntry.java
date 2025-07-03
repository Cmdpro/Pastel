package earth.terrarium.pastel.data.lang.guidebook.magicalblocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnderGlassEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.ender_glass.page0.text", "I felt from the moment I put the recipe on paper that this creation was going to be something special.\\\n\\\nThe combination of [#](449900)the End[#](), [#](449900)Redstone[#]() and [#](449900)Magic[#]() gives it very strange properties.");
		provider.add("book.pastel.guidebook.ender_glass.page1.text", "Depending on the strength of the applied [#](449900)redstone signal[#](), this block takes on different properties:\n- without redstone, it is completely solid\n- a [#](449900)redstone signal[#]() makes it transparent, almost like glass\n- however, it reaches its most curious state with full strength redstone signals...");
		provider.add("book.pastel.guidebook.ender_glass.page2.text", "To make it even stranger, the material seems to respond to the last signal applied, not the strongest.\\\n\\\nTruly a curiosity from the End.");
	}
}
