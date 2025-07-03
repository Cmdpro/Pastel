package earth.terrarium.pastel.data.lang.guidebook.equipment;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BlockFlooderEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.block_flooder.page0.text", "Like a caveman, I've always had to run around illuminating caves or closing their unsightly entrances in my immediate vicinity. To relieve myself of this task I took inspiration from the self-replicating abilities of [Fading](entry://general/fading) and developed the Block Flooder.\\\nIf I throw one into a narrow path, pond or ravine, it will fill up with blocks - in 5%% of the time the result even looks acceptable!");
		provider.add("book.pastel.guidebook.block_flooder.page1.text", "Pulls matching blocks directly from my inventory to fill the gaps. If I don't have any matching ones, it falls back to [](item://minecraft:cobblestone).");
	}
}
