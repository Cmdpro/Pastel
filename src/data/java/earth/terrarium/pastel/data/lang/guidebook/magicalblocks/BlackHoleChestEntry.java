package earth.terrarium.pastel.data.lang.guidebook.magicalblocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BlackHoleChestEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.black_hole_chest.page0.text", "The problem with hoppers is that they are not only slow, but their lack of range makes them ill-suited to larger farms.\\\n\\\nWith a little Blue Pigment, all items within a wide radius of this chest-like mechanism can easily be brought to safety.");
		provider.add("book.pastel.guidebook.black_hole_chest.page1.text", "Radius of 12 blocks. Can be disabled by placing a solid block on top. Offers filters to specify which items it sucks in.");
		provider.add("book.pastel.guidebook.black_hole_chest.page2.text", "Putting a [Knowledge Gem](entry://enchanting/knowledge_gem) in a Black Hole Chest will allow it to absorb XP orbs, transferring the experience into the gem.");
		provider.add("book.pastel.guidebook.black_hole_chest.page2.title", "Experience Absorption");
	}
}
