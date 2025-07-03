package earth.terrarium.pastel.data.lang.guidebook.magicalblocks;

import net.neoforged.neoforge.common.data.LanguageProvider;

public class CreatureDetectorEntry {
	public static void addTranslations(LanguageProvider provider) {
		provider.add("book.pastel.guidebook.creature_detector.name", "Creature Detector");
		provider.add("book.pastel.guidebook.creature_detector.page0.text", "The gem built into the Creature Detector reacts to micro-vibrations in the ground.\\\nThis gives it the ability to measure the number of creatures in its vicinity.");
		provider.add("book.pastel.guidebook.creature_detector.page1.text", "Outputs a cumulative strength of 1 for every creature within a 10 block radius.");
	}
}
