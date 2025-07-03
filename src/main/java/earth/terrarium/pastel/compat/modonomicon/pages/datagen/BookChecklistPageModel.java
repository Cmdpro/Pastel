package earth.terrarium.pastel.compat.modonomicon.pages.datagen;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.klikli_dev.modonomicon.api.ModonomiconConstants;
import com.klikli_dev.modonomicon.api.datagen.book.BookTextHolderModel;
import com.klikli_dev.modonomicon.api.datagen.book.condition.BookConditionModel;
import com.klikli_dev.modonomicon.api.datagen.book.page.BookPageModel;
import com.klikli_dev.modonomicon.book.BookTextHolder;
import com.klikli_dev.modonomicon.book.conditions.BookCondition;
import com.klikli_dev.modonomicon.book.conditions.BookNoneCondition;
import com.klikli_dev.modonomicon.util.BookGsonHelper;
import earth.terrarium.pastel.compat.modonomicon.ModonomiconCompat;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BookChecklistPageModel extends BookPageModel<BookChecklistPageModel> {
    protected BookTextHolderModel title = new BookTextHolderModel("");
    protected boolean useMarkdownInTitle = false;
    protected boolean showTitleSeparator = true;
    protected BookTextHolderModel text = new BookTextHolderModel("");
    protected Map<ResourceLocation, BookTextHolderModel> checklist = new LinkedHashMap<>();

    protected BookChecklistPageModel() {
        super(ModonomiconCompat.CHECKLIST_PAGE);
    }

    public static BookChecklistPageModel create() {
        return new BookChecklistPageModel();
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
        var checklistObject = new JsonObject();
        for (var key : this.checklist.keySet()) {
            checklistObject.add(
                key.toString(), this.checklist
                    .get(key)
                    .toJson(provider)
            );
        }
        json.add("checklist", checklistObject);
        
        return json;
    }

    public BookChecklistPageModel withTitle(String title) {
        this.title = new BookTextHolderModel(title);
        return this;
    }

    public BookChecklistPageModel withTitle(Component title) {
        this.title = new BookTextHolderModel(title);
        return this;
    }

    public BookChecklistPageModel withUseMarkdownInTitle(boolean useMarkdownInTitle) {
        this.useMarkdownInTitle = useMarkdownInTitle;
        return this;
    }

    public BookChecklistPageModel withShowTitleSeparator(boolean showTitleSeparator) {
        this.showTitleSeparator = showTitleSeparator;
        return this;
    }

    public BookChecklistPageModel withText(String text) {
        this.text = new BookTextHolderModel(text);
        return this;
    }

    public BookChecklistPageModel withText(Component text) {
        this.text = new BookTextHolderModel(text);
        return this;
    }

    public BookChecklistPageModel withChecklist(Map<ResourceLocation, BookTextHolderModel> checklist) {
        this.checklist = checklist;
        return this;
    }

}
