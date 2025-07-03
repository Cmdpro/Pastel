package earth.terrarium.pastel.data.guidebook.compat;

import com.klikli_dev.modonomicon.api.datagen.CategoryProvider;
import com.klikli_dev.modonomicon.api.datagen.EntryProvider;
import com.klikli_dev.modonomicon.api.datagen.book.BookEntryModel;
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel;
import com.klikli_dev.modonomicon.api.datagen.book.condition.BookModLoadedConditionModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel;
import com.mojang.datafixers.util.Pair;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;
import earth.terrarium.pastel.compat.PastelIntegrationPacks;
import earth.terrarium.pastel.compat.create.CreateCompat;
import earth.terrarium.pastel.compat.modonomicon.pages.datagen.BookChecklistPageModel;
import earth.terrarium.pastel.compat.modonomicon.pages.datagen.BookCollectionPageModel;
import earth.terrarium.pastel.registries.PastelAdvancements;
import net.minecraft.resources.ResourceLocation;

import static com.simibubi.create.AllBlocks.CRUSHING_WHEEL;

public class CreateEntry extends EntryProvider {
    public static String ID = "create_entry";

    public CreateEntry(CategoryProvider parent) {
        super(parent);
    }

    public BookEntryModel additionalSetup(BookEntryModel entry) {
        return entry
            .withCondition(this
                               .condition()
                               .and(
                                   BookModLoadedConditionModel
                                       .create()
                                       .withModId(PastelIntegrationPacks.CREATE_ID), this
                                       .condition()
                                       .advancement(PastelAdvancements.PLACE_PEDESTAL)
                               ))
            .hideWhileLocked(true);
    }

    @Override
    protected void generatePages() {
        this.page(
            "page0", () -> BookTextPageModel
                .create()
                .withText(this
                              .context()
                              .pageText())
                .withTitle(this
                               .context()
                               .pageTitle())
        );
        this.pageText(
            "Everywhere it rattles and fizzles, whistles and smokes. An ensemble of assemblage.\\\n\\\nSurely some of" +
            " these machines will come in handy.");
        this.pageTitle("Create Entry");

        this.page(
            "page1", () -> BookCollectionPageModel
                .create()
                .withText(this
                              .context()
                              .pageText())
                .withTitle(this
                               .context()
                               .pageTitle())
                .withCondition(this
                                   .condition()
                                   .and(
                                       this
                                           .condition()
                                           .advancement(PastelAdvancements.PLACE_PEDESTAL), BookModLoadedConditionModel
                                           .create()
                                           .withModId(PastelIntegrationPacks.CREATE_ID)
                                   ))
                .withItems(
                    CreateCompat.SMALL_ZINC_BUD.getId(), CreateCompat.LARGE_ZINC_BUD.getId(),
                    CreateCompat.ZINC_CLUSTER.getId(),
                    CreateCompat.PURE_ZINC_BLOCK.getId(), CreateCompat.PURE_ZINC.getId()
                )
        );
        this.pageTitle("Pure Zinc");

    }

    @Override
    protected String entryName() {
        return "Create";
    }

    @Override
    protected String entryDescription() {
        return "";
    }

    @Override
    protected Pair<Integer, Integer> entryBackground() {
        return new Pair<>(0, 0);
    }

    @Override
    protected BookIconModel entryIcon() {
        return BookIconModel.create(CRUSHING_WHEEL.asItem());
    }

    @Override
    protected String entryId() {
        return ID;
    }
}
