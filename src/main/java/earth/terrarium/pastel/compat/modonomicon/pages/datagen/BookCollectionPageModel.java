package earth.terrarium.pastel.compat.modonomicon.pages.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.klikli_dev.modonomicon.api.datagen.book.BookTextHolderModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookPageModel;
import earth.terrarium.pastel.compat.modonomicon.ModonomiconCompat;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionPageModel extends BookPageModel<BookCollectionPageModel> {
    protected BookTextHolderModel title = new BookTextHolderModel("");
    protected boolean useMarkdownInTitle = false;
    protected boolean showTitleSeparator = true;
    protected BookTextHolderModel text = new BookTextHolderModel("");
    private List<ResourceLocation> items = new ArrayList<>();

    protected BookCollectionPageModel() {
        super(ModonomiconCompat.COLLECTION_PAGE);
    }

    public static BookCollectionPageModel create() {
        return new BookCollectionPageModel();
    }

    public BookTextHolderModel getTitle() {
        return this.title;
    }

    public boolean useMarkdownInTitle() {
        return this.useMarkdownInTitle;
    }

    public boolean showTitleSeparator() {
        return this.showTitleSeparator;
    }

    public BookTextHolderModel getText() {
        return this.text;
    }

    @Override
    public JsonObject toJson(ResourceLocation entryId, HolderLookup.Provider provider) {
        var json = super.toJson(entryId, provider);
        json.add("title", this.title.toJson(provider));
        json.addProperty("use_markdown_in_title", this.useMarkdownInTitle);
        json.addProperty("show_title_separator", this.showTitleSeparator);
        json.add("text", this.text.toJson(provider));
        var itemsObj = new JsonArray();
        for (ResourceLocation item : this.items) {
            itemsObj.add(item.toString());
        }
        json.add("items", itemsObj);
        return json;
    }

    public BookCollectionPageModel withTitle(String title) {
        this.title = new BookTextHolderModel(title);
        return this;
    }

    public BookCollectionPageModel withTitle(Component title) {
        this.title = new BookTextHolderModel(title);
        return this;
    }

    public BookCollectionPageModel withUseMarkdownInTitle(boolean useMarkdownInTitle) {
        this.useMarkdownInTitle = useMarkdownInTitle;
        return this;
    }

    public BookCollectionPageModel withShowTitleSeparator(boolean showTitleSeparator) {
        this.showTitleSeparator = showTitleSeparator;
        return this;
    }

    public BookCollectionPageModel withText(String text) {
        this.text = new BookTextHolderModel(text);
        return this;
    }

    public BookCollectionPageModel withText(Component text) {
        this.text = new BookTextHolderModel(text);
        return this;
    }

    public BookCollectionPageModel withItems(ResourceLocation... items) {
        this.items = List.of(items);
        return this;
    }

}
