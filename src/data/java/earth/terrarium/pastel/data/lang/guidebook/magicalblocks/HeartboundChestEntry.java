package earth.terrarium.pastel.data.lang.guidebook.magicalblocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class HeartboundChestEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.heartbound_chest.page0.text", "I often find myself placing down a box to store my belongings, only to return to find everything looted.\\\n\\\nThis special chest can even help me protect my stuff as well as catch the thief red-handed.");
		provider.add("book.pastel.guidebook.heartbound_chest.page1.text", "Can only be opened by the person who placed it, and has the same space as two mundane chests.");
		provider.add("book.pastel.guidebook.heartbound_chest.page2.text", "Similar to a Trapped Chest it emits a [#](449900)redstone signal[#]().\\\nIf I, as the owner, open it, the signal strength will be full; if a stranger tries to tamper with my belongings then only half.");
		provider.add("book.pastel.guidebook.heartbound_chest.page2.title", "Redstone Component");
	}
}
