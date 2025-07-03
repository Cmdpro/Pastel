package earth.terrarium.pastel.data.lang;

import com.klikli_dev.modonomicon.api.datagen.AbstractModonomiconLanguageProvider;
import com.klikli_dev.modonomicon.api.datagen.ModonomiconLanguageProvider;
import earth.terrarium.pastel.PastelCommon;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PastelLanguageProvider extends LanguageProvider implements ModonomiconLanguageProvider {
	public PastelLanguageProvider(PackOutput output) {
		super(output, PastelCommon.MOD_ID, "en_us");
	}
	
	@Override
	public void accept(String s, String s2) {
		this.add(s, s2);
	}
	
	@Override
	protected void addTranslations() {
		PastelAdvancements.addTranslations(this);
		PastelAttributes.addTranslations(this);
		PastelBiomes.addTranslations(this);
		PastelBlocks.addTranslations(this);
		PastelCommands.addTranslations(this);
		PastelContainers.addTranslations(this);
		PastelCurios.addTranslations(this);
		PastelDeathMessages.addTranslations(this);
		PastelDimensions.addTranslations(this);
		PastelEffects.addTranslations(this);
		PastelEnchantments.addTranslations(this);
		PastelEntities.addTranslations(this);
		PastelExplosionArchetypes.addTranslations(this);
		PastelFluidTypes.addTranslations(this);
		PastelGui.addTranslations(this);
		PastelGuidebook.addTranslations(this);
		PastelInk.addTranslations(this);
		PastelItemGroups.addTranslations(this);
		PastelItems.addTranslations(this);
		PastelJukeboxSongs.addTranslations(this);
		PastelMessages.addTranslations(this);
		PastelMultiblocks.addTranslations(this);
		PastelOptions.addTranslations(this);
		PastelRecipeGroups.addTranslations(this);
		PastelRecipes.addTranslations(this);
		PastelREIReagents.addTranslations(this);
		PastelSignText.addTranslations(this);
		PastelSpecial.addTranslations(this);
		PastelStructures.addTranslations(this);
		PastelSubtitles.addTranslations(this);
		PastelTags.addTranslations(this);
		PastelToasts.addTranslations(this);
		PastelTooltips.addTranslations(this);
		PastelVanillaChanges.addTranslations(this);
		
		PastelTodoUnused.addTranslations(this);
	}
}
