package earth.terrarium.pastel.data.guidebook.compat;

import com.klikli_dev.modonomicon.api.datagen.CategoryProvider;
import com.klikli_dev.modonomicon.api.datagen.SingleBookSubProvider;
import com.klikli_dev.modonomicon.api.datagen.book.BookIconModel;
import net.minecraft.resources.ResourceLocation;

public class CompatCategory extends CategoryProvider {
    public static final String ID = "compat_category";

    public CompatCategory(SingleBookSubProvider parent) {
        super(parent);
    }

    @Override
    protected String[] generateEntryMap() {
        return new String[]{
            "a_________i",
            "___________",
            "__b_______j",
            "___________",
            "_______e_gk",
            "_________h_",
            "____c___f__",
            "___________",
            "____d______"
        };
    }

    @Override
    protected void generateEntries() {

    }

    @Override
    protected String categoryName() {
        return "Mod Integration";
    }

    @Override
    protected BookIconModel categoryIcon() {
        return BookIconModel.create(ResourceLocation.parse("minecraft:knowledge_book"));
    }

    @Override
    public String categoryId() {
        return ID;
    }
}
