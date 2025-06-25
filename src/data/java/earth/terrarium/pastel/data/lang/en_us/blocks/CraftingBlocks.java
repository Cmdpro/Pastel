package earth.terrarium.pastel.data.lang.en_us.blocks;

import earth.terrarium.pastel.registries.PastelBlocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CraftingBlocks {
	public static void addTranslations(LanguageProvider provider) {
		provider.addBlock(PastelBlocks.CINDERHEARTH, "Cinderhearth");
		provider.addBlock(PastelBlocks.ENCHANTER, "Enchanter");
		provider.add("block.pastel.fusion_shrine", "Fusion Shrine");
		provider.addBlock(PastelBlocks.FUSION_SHRINE_BASALT, "Fusion Shrine");
		provider.addBlock(PastelBlocks.FUSION_SHRINE_CALCITE, "Fusion Shrine");
		provider.add("block.pastel.pedestal", "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_ALL_BASIC, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_BASIC_AMETHYST, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_BASIC_CITRINE, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_BASIC_TOPAZ, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_MOONSTONE, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.PEDESTAL_ONYX, "Pigment Pedestal");
		provider.addBlock(PastelBlocks.POTION_WORKSHOP, "Potion Workshop");
		provider.addBlock(PastelBlocks.SPIRIT_INSTILLER, "Spirit Instiller");
		provider.addBlock(PastelBlocks.TITRATION_BARREL, "Titration Barrel");
		provider.add("block.pastel.titration_barrel.content_count_with_fluid", "Contains %s and %d items. Seal with a Colored Plank to start fermenting.");
		provider.add("block.pastel.titration_barrel.content_count_with_fluid_full", "Contains %s and %d items (full). Seal with a Colored Plank to start fermenting.");
		provider.add("block.pastel.titration_barrel.content_count_without_fluid", "Contains %d items and no liquid. Seal with a Colored Plank to start fermenting.");
		provider.add("block.pastel.titration_barrel.content_count_without_fluid_full", "Contains %d items (full) and no fluid. Seal with a Colored Plank to start fermenting.");
		provider.add("block.pastel.titration_barrel.days_of_sealing_after_opened_with_extractable_amount", "%s was fermenting for %d days (%s real days)");
		provider.add("block.pastel.titration_barrel.days_of_sealing_before_opened", "Sealed up %d days ago (%s real days). Sneak-Use to unseal");
		provider.add("block.pastel.titration_barrel.debug_added_day", "(Debug Function) Added a real life day of fermentation time");
		provider.add("block.pastel.titration_barrel.empty_when_tapping", "It... was empty. Huh");
		provider.add("block.pastel.titration_barrel.invalid_recipe", "This does not seem like it would produce something useful...");
		provider.add("block.pastel.titration_barrel.invalid_recipe_when_tapping", "This barrel only contained an unusable mixture. Eww");
		provider.add("block.pastel.titration_barrel.missing_liquid_when_tapping", "It seems to have lacked liquid, so the content has gone bad. Pity");
		provider.add("block.pastel.titration_barrel.not_yet_ready", "Sealed up %d days ago (%s real days). Not yet finished.");
		provider.add("block.pastel.titration_barrel.recipe_not_unlocked", "You have no idea what this is inside. Better leave it be.");
		provider.add("block.pastel.titration_barrel.tapping_item_required", "Tapping requires a ");
	}
}
