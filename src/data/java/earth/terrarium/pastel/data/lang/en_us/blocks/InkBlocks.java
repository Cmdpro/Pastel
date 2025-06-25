package earth.terrarium.pastel.data.lang.en_us.blocks;

import earth.terrarium.pastel.registries.PastelBlocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class InkBlocks {
	public static void addTranslations(LanguageProvider provider) {
		provider.addBlock(PastelBlocks.COLOR_PICKER, "Color Picker");
		provider.add("block.pastel.color_picker.tooltip", "Converts §2P§3i§cg§6m§be§en§dt§7 into §bI§dn§ek");
		provider.addBlock(PastelBlocks.CRYSTAL_APOTHECARY, "Crystal Apothecary");
		provider.add("block.pastel.crystal_apothecary.owner", "%s's Crystal Apothecary");
		provider.add("block.pastel.crystal_apothecary.tooltip", "Place in a Geode to harvest Gemstone Shards");
		provider.addBlock(PastelBlocks.CRYSTALLARIEUM, "Crystallarieum");
		
	}
}
