package earth.terrarium.pastel.data.lang.guidebook.equipment;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BottomlessBundleEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.bottomless_bundle.page0.text", "On my travels through the underground I collect a whole lot of mundane, identical blocks - which I will never need, but that's not the point! I am not a hoarder, *promise*.\\\n\\\nThe Bottomless Bundle stores a virtually unlimited number of items, but only of one type.");
		provider.add("book.pastel.guidebook.bottomless_bundle.page1.text", "Right-clicking it on stacks or empty slots in my inventory will fill / empty it.");
		provider.add("book.pastel.guidebook.bottomless_bundle.page2.text", "Crouching places it down, making it possible to fill / empty it automatically.");
		provider.add("book.pastel.guidebook.bottomless_bundle.page2.title", "Automation");
		provider.add("book.pastel.guidebook.bottomless_bundle.page3.text", "A placed Bottomless Bundle will always remember the last item I put into it.\\\nEven if it is emptied it will only accept new items previously held, making it usable as a filter.\\\n\\\n*Note: If it is placed empty, it will accept the first item put into it and lock to that.*");
		provider.add("book.pastel.guidebook.bottomless_bundle.page4.text", "Power increases its capacity tenfold per level.\\\n\\\n*That's a **lot** of storage. Can I completely fill one with Power V?*");
		provider.add("book.pastel.guidebook.bottomless_bundle.page5.text", "Curse of the Void will void all items that would overfill the Bottomless Bundle.\\\n\\\n*No more useless blocks cluttering my path when mining.*");
	}
}
