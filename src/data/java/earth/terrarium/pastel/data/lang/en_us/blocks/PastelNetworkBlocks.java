package earth.terrarium.pastel.data.lang.en_us.blocks;

import earth.terrarium.pastel.registries.PastelBlocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PastelNetworkBlocks {
	public static void addTranslations(LanguageProvider provider) {
		provider.addBlock(PastelBlocks.BUFFER_NODE, "§aPastel Network Buffer Node");
		provider.add("block.pastel.buffer_node.tooltip", "Stocks Items for Gather Nodes");
		provider.addBlock(PastelBlocks.CONNECTION_NODE, "§7Pastel Network Connection Node");
		provider.add("block.pastel.connection_node.tooltip", "Extends the range of your Network");
		provider.addBlock(PastelBlocks.GATHER_NODE, "§8Pastel Network Gather Node");
		provider.add("block.pastel.gather_node.tooltip", "Gathers items from Sender, Provider and Storage Nodes");
		provider.add("block.pastel.pastel_network_nodes.connection_debug", "This node is connected to:");
		provider.add("block.pastel.pastel_network_nodes.tooltip.placing", "Place against some form of inventory");
		provider.add("block.pastel.pastel_network_nodes.tooltip.range", "Connects to other nodes in a %d block radius");
		provider.add("block.pastel.pastel_node", "Pastel Node");
		provider.addBlock(PastelBlocks.PROVIDER_NODE, "§dPastel Network Provider Node");
		provider.add("block.pastel.provider_node.tooltip", "Supplies Gather Nodes with items");
		provider.addBlock(PastelBlocks.SENDER_NODE, "§ePastel Network Sender Node");
		provider.add("block.pastel.sender_node.tooltip", "Sends items to Gather and Storage Nodes");
		provider.addBlock(PastelBlocks.STORAGE_NODE, "§bPastel Network Storage Node");
		provider.add("block.pastel.storage_node.tooltip", "Serves as storage for Sender and Gather Nodes");
	}
}
