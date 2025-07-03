package earth.terrarium.pastel.data.guidebook.main;

import appeng.core.definitions.AEBlocks;
import com.klikli_dev.modonomicon.api.datagen.CategoryProvider;
import com.klikli_dev.modonomicon.api.datagen.EntryProvider;
import com.klikli_dev.modonomicon.api.datagen.book.BookEntryModel;
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel;
import com.klikli_dev.modonomicon.api.datagen.book.condition.BookModLoadedConditionModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookSpotlightPageModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookTextPageModel;
import com.mojang.datafixers.util.Pair;
import earth.terrarium.pastel.blocks.pastel_network.Pastel;
import earth.terrarium.pastel.compat.PastelIntegrationPacks;
import earth.terrarium.pastel.registries.PastelAdvancements;

public class BloodOrchidEntry extends EntryProvider {
    public static String ID = "blood_orchid_entry";

    public BloodOrchidEntry(CategoryProvider parent) {
        super(parent);
    }

    public BookEntryModel additionalSetup(BookEntryModel entry) {
        return entry
            .withCondition(this
                               .condition()
                               .advancement(PastelAdvancements.Unlocks.Blocks.BLOOD_ORCHID))
            .hideWhileLocked(true);
    }

    @Override
    protected void generatePages() {
        this.page(
            "page0", () -> BookTextPageModel
                .create()
                .withTitle(this
                               .context()
                               .pageTitle())
                .withText(this
                              .context()
                              .pageText())
        );
        this.pageTitle("Applied Energistics");
        this.pageText("\"Any technology advanced enough is indistinguishable from magic\", I once heard.\\\n\\\nI'm " +
                      "still not entirely sure how this system manages to store so many blocks in such a small " +
                      "space," + " " + "but " +
                      "since I regularly walk around with hundreds of square metres of dirt, I've never bothered to " +
                      "question it.");

        this.page(
            "page1", () -> BookSpotlightPageModel
                .create()
                .withTitle(this
                               .context()
                               .pageTitle())
                .withText(this
                              .context()
                              .pageText())
                .withItem(AEBlocks.GROWTH_ACCELERATOR.asItem())
        );
        this.pageTitle("Growth Acceleration");
        this.pageText(
            "Looks like the [#](bb00bb)Crystal Growth Accelerator[#]() can speed up the growth of all kinds " +
            "of Gemstone Buds!");

    }

    @Override
    protected String entryName() {
        return "Applied Energistics";
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
        return BookIconModel.create(AEBlocks.CONTROLLER.asItem());
    }

    @Override
    protected String entryId() {
        return ID;
    }
}
