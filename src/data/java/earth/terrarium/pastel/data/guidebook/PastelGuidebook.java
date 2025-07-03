package earth.terrarium.pastel.data.guidebook;

import com.klikli_dev.modonomicon.Modonomicon;
import com.klikli_dev.modonomicon.api.datagen.ModonomiconLanguageProvider;
import com.klikli_dev.modonomicon.api.datagen.SingleBookSubProvider;
import com.klikli_dev.modonomicon.api.datagen.book.BookModel;
import com.klikli_dev.modonomicon.book.BookFrameOverlay;
import earth.terrarium.pastel.PastelCommon;
import earth.terrarium.pastel.registries.PastelItemGroups;
import earth.terrarium.pastel.registries.PastelItems;
import earth.terrarium.pastel.registries.PastelSoundEvents;
import net.minecraft.resources.ResourceLocation;

public class PastelGuidebook extends SingleBookSubProvider {
    public static final String ID = "guidebook";

    public PastelGuidebook(String modid, ModonomiconLanguageProvider lang) {
        super(ID, modid, lang);
    }

    private BookModel addFrameOverrides(BookModel book) {
        return book
            .withLeftFrameOverride(new BookFrameOverlay(
                ResourceLocation.fromNamespaceAndPath(
                    PastelCommon.MOD_ID, "textures/gui/modonomicon/guidebook_overlay_left.png"), 256, 256, 9, 124, 3, 0
            ))
            .withRightFrameOverride(new BookFrameOverlay(
                ResourceLocation.fromNamespaceAndPath(
                    PastelCommon.MOD_ID, "textures/gui/modonomicon/guidebook_overlay_right.png"), 256, 256, 9, 124, -4,
                0
            ))
            .withTopFrameOverride(new BookFrameOverlay(
                ResourceLocation.fromNamespaceAndPath(
                    PastelCommon.MOD_ID, "textures/gui/modonomicon/guidebook_overlay_top.png"), 256, 256, 106, 11, 0, 4
            ))
            .withBottomFrameOverride(new BookFrameOverlay(
                ResourceLocation.fromNamespaceAndPath(
                    PastelCommon.MOD_ID, "textures/gui/modonomicon/guidebook_overlay_bottom.png"), 256, 256, 80, 8, 0,
                -4
            ));
    }

    private BookModel addTextures(BookModel book) {
        return book
            .withFrameTexture(ResourceLocation.fromNamespaceAndPath(
                PastelCommon.MOD_ID,
                "textures/gui/modonomicon" + "/guidebook_frame.png"
            ))
            .withBookContentTexture(ResourceLocation.fromNamespaceAndPath(
                PastelCommon.MOD_ID,
                "textures/gui/modonomicon" +
                "/guidebook_entry.png"
            ))
            .withBookOverviewTexture(ResourceLocation.fromNamespaceAndPath(
                PastelCommon.MOD_ID,
                "textures/gui/modonomicon/guidebook_icons.png"
            ))
            .withCraftingTexture(ResourceLocation.fromNamespaceAndPath(
                Modonomicon.MOD_ID,
                "textures/gui/crafting_textures.png"
            ));
    }

    private BookModel addOffsets(BookModel book) {
        return book
            .withSearchButtonXOffset(0)
            .withSearchButtonYOffset(0)
            .withBookTextOffsetWidth(-5)
            .withBookTextOffsetX(2)
            .withBookTextOffsetY(1)
            .withReadAllButtonYOffset(0)
            .withCategoryButtonXOffset(0)
            .withCategoryButtonYOffset(0);
    }

    @Override
    protected BookModel additionalSetup(BookModel book) {
        addTextures(book);
        addOffsets(book);
        addFrameOverrides(book);

        return book
            .withCustomBookItem(PastelItems.GUIDEBOOK.getId())
            .withCreativeTab(PastelItemGroups.TOOLS_ID)
            .withModel(ResourceLocation.fromNamespaceAndPath(PastelCommon.MOD_ID, "guidebook"))
            .withFont(ResourceLocation.fromNamespaceAndPath("minecraft", "uniform"))
            .withGenerateBookItem(false)
            .withAutoAddReadConditions(false)
            .withAllowOpenBooksWithInvalidLinks(true)
            .withDefaultTitleColor(1705998)
            .withCategoryButtonIconScale(0.875F)
            .withTurnPageSound(PastelSoundEvents.GUIDEBOOK_PAGES.getLocation());
    }

    @Override
    protected void registerDefaultMacros() {
    }

    @Override
    protected void generateCategories() {
    }

    @Override
    protected String bookName() {
        return "Colorful World";
    }

    @Override
    protected String bookTooltip() {
        // The old book.json specified this as 'book.pastel.guidebook.tooltip', but that translation key simply not
        // does not exist
        return "";
    }
}
