package earth.terrarium.pastel.data.lang.en_us.blocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class ColoredBlocks {
	public static void addTranslations(LanguageProvider provider) {
		var colors = new String[]{
				"Black", "Blue", "Brown", "Cyan", "Gray", "Green", "Light Blue", "Light Gray", "Lime", "Magenta", "Orange", "Pink", "Purple", "Red", "White", "Yellow"
		};
		var blocks = new String[]{
				"Block", "Button", "Fence", "Fence Gate", "Glowblock", "Lamp", "Leaves", "Log", "Planks", "Pressure Plate", "Sapling", "Slab", "Spore Blossom", "Stairs", "Wood"
		};
		for (String color : colors) {
			for (String block : blocks) {
				provider.add("block.pastel." + color.toLowerCase() + "_" + block.toLowerCase().replace(' ', '_'), color + " " + block);
			}
			provider.add("block.pastel.stripped_" + color.toLowerCase() + "_log", "Stripped " + color + " Log");
			provider.add("block.pastel.stripped_" + color.toLowerCase() + "_wood", "Stripped " + color + " Wood");
			provider.add("block.pastel.potted_" + color.toLowerCase() + "_sapling", "Potted " + color + " Sapling");
		}
		
		provider.add("block.pastel.black_spirit_sallow_vines_body", "Black Spirit Sallow Vines");
		provider.add("block.pastel.cyan_spirit_sallow_vines_body", "Cyan Spirit Sallow Vines");
		provider.add("block.pastel.magenta_spirit_sallow_vines_body", "Magenta Spirit Sallow Vines");
		provider.add("block.pastel.white_spirit_sallow_vines_body", "White Spirit Sallow Vines");
		provider.add("block.pastel.yellow_spirit_sallow_vines_body", "Yellow Spirit Sallow Vines");
		
		provider.add("block.pastel.black_spirit_sallow_vines_head", "Black Spirit Sallow Vines");
		provider.add("block.pastel.cyan_spirit_sallow_vines_head", "Cyan Spirit Sallow Vines");
		provider.add("block.pastel.magenta_spirit_sallow_vines_head", "Magenta Spirit Sallow Vines");
		provider.add("block.pastel.white_spirit_sallow_vines_head", "White Spirit Sallow Vines");
		provider.add("block.pastel.yellow_spirit_sallow_vines_head", "Yellow Spirit Sallow Vines");
	}
}
