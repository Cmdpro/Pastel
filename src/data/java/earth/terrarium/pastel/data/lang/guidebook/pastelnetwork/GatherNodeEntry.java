package earth.terrarium.pastel.data.lang.guidebook.pastelnetwork;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class GatherNodeEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.gather_node.name", "Gather Node");
		provider.add("book.pastel.guidebook.gather_node.page0.text", "The Gather Node will actively request items from other nodes and put them in the connected inventory.\\\n\\\nSpecify the items to be collected in its [#](449900)filter[#]().");
		provider.add("book.pastel.guidebook.gather_node.page1.text", "Gathering Order:\n1. [Buffer Nodes](entry://pastel_network/buffer_node)\n2. [Sender Nodes](entry://pastel_network/sender_node)\n3. [Provider Nodes](entry://pastel_network/provider_node)\n4. [Storage Nodes](entry://pastel_network/storage_node)");
	}
}
