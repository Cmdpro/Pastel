package earth.terrarium.pastel.data.lang;

import earth.terrarium.pastel.data.lang.blocks.*;
import earth.terrarium.pastel.data.lang.blocks.compat.AlloyForgeryBlocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PastelBlocks {
	public static void addTranslations(LanguageProvider provider) {
		ColoredBlocks.addTranslations(provider);
		CraftingBlocks.addTranslations(provider);
		DecoBlocks.addTranslations(provider);
		FluidBlocks.addTranslations(provider);
		FunctionalBlocks.addTranslations(provider);
		ImbriferBlocks.addTranslations(provider);
		InkBlocks.addTranslations(provider);
		MinecraftBlocks.addTranslations(provider);
		MobHeadBlocks.addTranslations(provider);
		PastelNetworkBlocks.addTranslations(provider);
		PlantBlocks.addTranslations(provider);
		PreservationBlocks.addTranslations(provider);
		ResourceBlocks.addTranslations(provider);
		WoodBlocks.addTranslations(provider);
		
		// Compat
		AlloyForgeryBlocks.addTranslations(provider);
	}
}
