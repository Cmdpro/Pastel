package earth.terrarium.pastel.data.lang.guidebook.magicalblocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BlockDetector {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.block_detector.page0.text", "Similar to an [#](bb00bb)Observer[#](), but more specific.\\\nGives off a [#](449900)redstone pulse[#]() each time a block is placed in front of it that matches the block below it (or above it, if facing down).");
	}
}
