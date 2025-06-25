package earth.terrarium.pastel.data.lang.en_us.blocks;

import earth.terrarium.pastel.registries.PastelBlocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class FluidBlocks {
	public static void addTranslations(LanguageProvider provider) {
		provider.addBlock(PastelBlocks.DRAGONROT, "Dragonrot");
		provider.add("block.pastel.flowing_liquid_crystal", "Liquid Crystal");
		provider.add("block.pastel.flowing_midnight_solution", "Midnight Solution");
		provider.add("block.pastel.flowing_humus", "Humus");
		provider.addBlock(PastelBlocks.HUMUS, "Humus");
		provider.addBlock(PastelBlocks.LIQUID_CRYSTAL, "Liquid Crystal");
		provider.addBlock(PastelBlocks.MIDNIGHT_SOLUTION, "Midnight Solution");
	}
}
