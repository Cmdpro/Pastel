package earth.terrarium.pastel.data.lang.guidebook.main;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class ColoredTreesEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.colored_trees.name", "Colored Trees");
		provider.add("book.pastel.guidebook.colored_trees.page0.text", "I need to mix my pigments with something organic. Through experimentation, I have found that the roots of [#](bb00bb)Saplings[#]() absorb the color in the [Gemstone Powder](entry://general/gemstone_powder) with ease. Pure Color pulsates through their tiny stems and first few leaves already.\\\n\\\nHow will they look when fully grown?");
		provider.add("book.pastel.guidebook.colored_trees.page1.text", "The recipes require specific combination of [Gemstone Powder](entry://general/gemstone_powder) per color, corresponding to the [amount I noted to mix it](entry://general/color_mixing_cmy).\\\n\\\nThe leaves will need to be broken by hand.");
		provider.add("book.pastel.guidebook.colored_trees.crafting_colored_saplings.title", "Creating a Colored Sapling");
		provider.add("book.pastel.guidebook.colored_trees.natural_generation.text", "Wow, those trees existed around me all along and I did not even know it! Who knows what else is out there.");
		provider.add("book.pastel.guidebook.colored_trees.natural_generation.title", "Natural Generation");
		provider.add("book.pastel.guidebook.colored_trees.colored_wood.text", "Like their non-colored, non-magical counterparts, I can strip the logs and use their wood for Planks, Stairs, Slabs, Buttons, Pressure Plates, Fences and Fence Gates.");
		provider.add("book.pastel.guidebook.colored_trees.colored_wood.title", "Colored Wood");
		provider.add("book.pastel.guidebook.colored_trees.leaf_crushing.title", "Leaf Crushing");
		provider.add("book.pastel.guidebook.colored_trees.leaf_crushing.text", "[Crushing colored leaves with an Anvil](entry://general/item_crushing) will always give me some Pigment.\\\n\\\n*It's not much, but it's honest work.*");
	}
}
