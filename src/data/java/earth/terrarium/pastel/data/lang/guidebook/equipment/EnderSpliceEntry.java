package earth.terrarium.pastel.data.lang.guidebook.equipment;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnderSpliceEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.ender_splice.page0.text", "I was quite successful replicating the Endermen's teleport ability! However, in order to determine the destination, I first have to take a snapshot of the position. Endermen don't have to do that, it seems - why? Or *do* they?\\\nFirst use binds to my current position, second use teleports me back.");
		provider.add("book.pastel.guidebook.ender_splice.page1.text", "- Can also be bound to players\n- Cannot teleport across dimensions");
		provider.add("book.pastel.guidebook.ender_splice.page2.text", "Reduces the chance of it breaking on use.");
		provider.add("book.pastel.guidebook.ender_splice.page3.text", "Allows for inter-dimensional teleportation.");
	}
}
