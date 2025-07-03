package earth.terrarium.pastel.data.lang.guidebook.pastelnetwork;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class BufferNodeEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.buffer_node.name", "Buffer Node");
		provider.add("book.pastel.guidebook.buffer_node.page0.text", "A modified Gather Node. It will request items from storage from whence they will be available for other Gather Nodes.\\\n\\\nSpecify the items to be collected in its [#](449900)filter[#]().");
		provider.add("book.pastel.guidebook.buffer_node.page1.text", "Gathering Order:\n1. [Sender Nodes](entry://pastel_network/sender_node)\n2. [Provider Nodes](entry://pastel_network/provider_node)\n3. [Storage Nodes](entry://pastel_network/storage_node)");
	}
}
