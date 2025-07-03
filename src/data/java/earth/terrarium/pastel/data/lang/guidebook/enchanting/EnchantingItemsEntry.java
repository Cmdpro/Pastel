package earth.terrarium.pastel.data.lang.guidebook.enchanting;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnchantingItemsEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.enchanting_items.page0.text", "Using the Enchanter to enchant items is fairly simple:\\\nI need to place [](item://minecraft:enchanted_book) in the [Item Bowls](entry://decoration/item_bowl) and the item I want to enchant on the Enchanter itself.\\\n\\\nUnlike normal enchanting, this will not consume my books - but will require a much greater amount of experience in exchange.");
		provider.add("book.pastel.guidebook.enchanting_items.page1.text", "I can provide a steady stream of experience via [Knowledge Gem](entry://enchanting/knowledge_gem).");
		provider.add("book.pastel.guidebook.enchanting_items.page2.text", "To create new [](item://minecraft:enchanted_book) I need to place the [](item://minecraft:enchanted_book) I want to copy in the [Item Bowls](entry://decoration/item_bowl) and a [common book](item://minecraft:book) on the [Enchanter](entry://enchanting/enchanter).\\\n\\\nBecause of the mundane nature of the books this will require a lot of experience, though.");
		provider.add("book.pastel.guidebook.enchanting_items.page2.title", "Copy Enchanted Books");
		provider.add("book.pastel.guidebook.enchanting_items.page3.text", "In most cases I estimate the cost to be **between 50 and 200 experience per enchantment**.\\\nOther factors affect this, too: how rare the enchantment is, its level and how well the target item can absorb enchantments.\\\nInterferences, such as enchantments that do not fit my target, will add to this cost.");
		provider.add("book.pastel.guidebook.enchanting_items.page3.title", "Required Experience");
	}
}
