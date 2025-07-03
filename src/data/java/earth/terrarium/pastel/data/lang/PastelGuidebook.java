package earth.terrarium.pastel.data.lang;

import earth.terrarium.pastel.data.lang.guidebook.GuidebookMeta;
import earth.terrarium.pastel.data.lang.guidebook.effects.EffectsCategory;
import earth.terrarium.pastel.data.lang.guidebook.compat.CompatCategory;
import earth.terrarium.pastel.data.lang.guidebook.creatinglife.CreatingLifeCategory;
import earth.terrarium.pastel.data.lang.guidebook.cuisine.CuisineCategory;
import earth.terrarium.pastel.data.lang.guidebook.deco.DecoCategory;
import earth.terrarium.pastel.data.lang.guidebook.enchanting.EnchantingCategory;
import earth.terrarium.pastel.data.lang.guidebook.equipment.EquipmentCategory;
import earth.terrarium.pastel.data.lang.guidebook.imbrifer.ImbriferCategory;
import earth.terrarium.pastel.data.lang.guidebook.ink.InkCategory;
import earth.terrarium.pastel.data.lang.guidebook.magicalblocks.MagicalBlocksCategory;
import earth.terrarium.pastel.data.lang.guidebook.main.MainCategory;
import earth.terrarium.pastel.data.lang.guidebook.pastelnetwork.PastelNetworkCategory;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class PastelGuidebook {
    public static void addTranslations(LanguageProvider provider) {
        EffectsCategory.addTranslations(provider);
        CompatCategory.addTranslations(provider);
        CreatingLifeCategory.addTranslations(provider);
        CuisineCategory.addTranslations(provider);
        DecoCategory.addTranslations(provider);
        EnchantingCategory.addTranslations(provider);
        EquipmentCategory.addTranslations(provider);
        ImbriferCategory.addTranslations(provider);
        InkCategory.addTranslations(provider);
        MagicalBlocksCategory.addTranslations(provider);
        MainCategory.addTranslations(provider);
        PastelNetworkCategory.addTranslations(provider);

        GuidebookMeta.addTranslations(provider);

        provider.add("book.pastel.guidebook.four_upgrade_slots", "4 upgrade slots");
        provider.add("book.pastel.guidebook.harvesting_spawners", "Harvesting Spawners");


        provider.add(
            "book.pastel.guidebook.item_detector.page0.text",
            "The Item Detector is used to count items lying on the ground within a 10 block radius.\\\n\\\nThe " +
            "strength of the [#](449900)redstone signal[#]() depends on how many items are lying around."
        );
        provider.add("book.pastel.guidebook.item_detector.page1.text", "64 items result in a maximum strength signal.");
        provider.add(
            "book.pastel.guidebook.item_roundel.page0.text",
            "I immediately took a liking to the rotating roundels in those ancient structures, so much so that I " +
            "copied their design. Definitely a nice way to present or store my items.\\\n\\\n*Hopefully the patents " +
            "have already expired.*"
        );
        provider.add(
            "book.pastel.guidebook.item_roundel.page1.text",
            "The basalt and calcite variants I cobbled together hold up to six stacks."
        );
        provider.add(
            "book.pastel.guidebook.jade_vines.page0.text",
            "The remaining energy of this plant from eons ago is barely still perceptible. So featherweight and " +
            "fragile that I feel any false move could breathe the last bit of life out of this fragile bulb" +
            ".\\\n\\\n*Will the history of this plant remain elusive to me forever?*"
        );
        provider.add(
            "book.pastel.guidebook.jade_vines.page1.text",
            "Once almost a lost cause, I now have an ace up my sleeve:\\\nWith the help of the [Spirit Instiller]" +
            "(entry://creating_life/spirit_instiller) I'm sure I can breathe some life back into the little deadish " +
            "bulb."
        );
        provider.add("book.pastel.guidebook.jade_vines.page1.title", "Germinating");
        provider.add(
            "book.pastel.guidebook.jade_vines.page2.text",
            "Pallid, fragile but beautiful hanging plants, twining down wooden fences with generous space underneath" +
            ".\\\n[#](8f2121)Not used to intense light after all these eons, they will die if exposed to too much " +
            "sunlight.\\\n[#](449900)They only grow one stage a night and only when exposed to the much softer, " +
            "indirect light of the moon."
        );
        provider.add("book.pastel.guidebook.jade_vines.page2.title", "Planting & Growing");
        provider.add(
            "book.pastel.guidebook.jade_vines.page3.text",
            "As I exposed one of the plants to strong sunlight, I found that it had withered. Not only did this " +
            "withered shrub leave me now only with new Bulbs, but also with this gel-like jelly, " +
            "though!\\\n\\\n*Unexpectedly tasty*."
        );
        provider.add(
            "book.pastel.guidebook.jade_vines.page4.text",
            "When Jade Jelly is heated blazingly fast and then cooled down again, the result is a very viscous but " +
            "sugar-sweet mass.\\\n\\\n*Fancy a sugar rush?*"
        );
        provider.add(
            "book.pastel.guidebook.jade_vines.page5.text",
            "Shiny petals can be plucked when partially grown.\\\nThey can be used for decoration and rarely, I can " +
            "find [#](449900)another Bulb[#]() when searching through the petals.\\\n\\\nWhat will Jade Vines look " +
            "like when I let them grow further, though?"
        );
        provider.add("book.pastel.guidebook.jade_vines.page5.title", "Petals");
        provider.add(
            "book.pastel.guidebook.jade_vines.page6.text",
            "After many nights, when the moon is full, the plants reach full bloom. I was able to collect some nectar" +
            " from their blossoms by using a [#](bb00bb)Glass Bottle[#]().\\\n\\\nThe nectar has great restorative " +
            "properties:\n- can be drunk for healing\n- able to repair any damaged item."
        );
        provider.add(
            "book.pastel.guidebook.jade_wine.page0.text",
            "Since the [Jade Vines](entry://general/jade_vines) are notorious for their restorative properties, it's " +
            "no wonder they translate perfectly when fermented.\\\nIn contrast to the slight bitterness of the " +
            "bulbs, adding a good portion of petals brings out a more floral and slightly tart flavor, complemented" +
            " by earthy undertones - almost resembling wine, in their characteristic jade color."
        );
        provider.add(
            "book.pastel.guidebook.jade_wine.page1.text",
            "[#](bb00bb)1 Bulb[#]() and [#](bb00bb)3 Petals[#]() for the [#](bb00bb)Bucket of Water[#]() feel like a " +
            "good starting point.\\\nThe longer the fermentation goes on, the stronger the taste gets.\\\n\\\n*A bit" +
            " of [#](bb00bb)added sweetness[#]()* would do it good, I'm sure."
        );
        provider.add(
            "book.pastel.guidebook.jade_wine.page2.text",
            "Adding a drop of [#](bb00bb)Moonstruck Nectar[#]() made the wine much easier to drink. The fermentation " +
            "process is accelerated and negative effects are noticeably mitigated."
        );
        provider.add("book.pastel.guidebook.jade_wine.page2.title", "Sweetening");
        provider.add("book.pastel.guidebook.jadeite.name", "Jadeite");
        provider.add(
            "book.pastel.guidebook.jadeite.page0.text",
            "Imposing vines hang from the high ceiling, breaking the darkness with their light. They are very tasty " +
            "and can be used as [Potion Reagent](entry://brewing/potion_workshop_reagents)."
        );
        provider.add("book.pastel.guidebook.jadeite.page0.title", "Jadeite Blossoms");
        provider.add(
            "book.pastel.guidebook.jadeite.page1.text",
            "They are very tasty and can be used as [Potion Reagent](entry://brewing/potion_workshop_reagents)."
        );
        provider.add("book.pastel.guidebook.jadeite.page1.title", "Jadeite Blocks");
        provider.add("book.pastel.guidebook.jadeite.page2.title", "Jadeite Carpet");
        provider.add(
            "book.pastel.guidebook.jeopardant.page0.text",
            "Adrenaline does not have to be the only thing racing through my veins in a state of emergency" +
            ".\\\n\\\nWith every heart lost, the [Stratine Gem](entry://general/stratine) in this ring glows " +
            "brighter and brighter, pulsing in sync with my racing heart - providing an exponential damage boost."
        );
        provider.add(
            "book.pastel.guidebook.jeopardant.page1.text",
            "*Tell me what you think about your situation\\\nComplication, aggravation*"
        );
        provider.add(
            "book.pastel.guidebook.karak_chai.page0.text",
            "While its soporific notes have taken most of my attention, the pacifying qualities of [Nightdew Sprouts]" +
            "(entry://general/nightdew_sprout) also demand some love.\\\nBoiling the leaves isolates the calming " +
            "magic of them, but the infusion ends up being very astringent. However, after doing some taste " +
            "testing, mixing it with condensed milk and a blend of spices masks the flavor for me completely!"
        );
        provider.add("book.pastel.guidebook.karak_chai.page1.text", "*Creamy tea? I guess there are worse things...*");
        provider.add("book.pastel.guidebook.kindlings.name", "Kindlings");
        provider.add(
            "book.pastel.guidebook.kindlings.page0.text",
            "Those grand skeletons that dot the depths... even in death, the dragons carry so much might and life to " +
            "them, there must be some way to restore their splendor through these [Dragonbone Chunks]" +
            "(entry://creating_life/dragonbone@dragonbone_chunks).\\\n\\\nMaybe I can become the one to restore the" +
            " age of divine dragons?"
        );
        provider.add(
            "book.pastel.guidebook.kindlings.page1.text", "*My own personal fierce dragon. This will be great.*");
        provider.add(
            "book.pastel.guidebook.kindlings.page2.text",
            "*So much for my plans for a personal Jurassic Park. Perhaps a petting zoo would be more " +
            "appropriate?*\\\n\\\nThe result is definitely not quite as... fierce... as I imagined. I'd say I'm used" +
            " to failure by now, but with this result who am I to complain?\\\n\\\nTheir down looks more than soft." +
            " Maybe if I sneak up with [Shears](item://minecraft:shears), I can cut off a feather or two?"
        );
        provider.add("book.pastel.guidebook.kindlings.page2.title", "A small Surprise");
        provider.add(
            "book.pastel.guidebook.kindlings.page3.text",
            "This night alchemy I've discovered... it seems to interact in strange ways with willpower. If dragons " +
            "are beings of pure will, then surely something would happen if the two interacted with each other" +
            ".\\\n\\\n*I can't imagine a little nap would hurt them. But... given their track record, maybe I " +
            "should do this far away from anything I care about.*"
        );
        provider.add("book.pastel.guidebook.kindlings.page3.title", "A Strange Thought");
        provider.add(
            "book.pastel.guidebook.knowledge_gem.page0.text",
            "Picking up one of those little green orbs that appear whenever I kill an enemy makes me smarter - " +
            "supposedly.\\\n\\\nHowever, inevitable death by clumsiness means that I always quickly lose this " +
            "experience again. Crystallized and safely stored in my chest, however, it will be as safe as can be."
        );
        provider.add(
            "book.pastel.guidebook.knowledge_gem.page1.text",
            "Holds up to 10,000 experience. Enchanting it with [#](449900)Efficiency[#]() increases this limit, [#]" +
            "(449900)Quick Charge[#]() boosts the transfer speed of XP."
        );
        provider.add(
            "book.pastel.guidebook.knowledge_gem.page2.text",
            "Putting a Knowledge Gem in a [Black Hole Chest](entry://magical_blocks/black_hole_chest) will allow it " +
            "to absorb XP orbs and store the experience in the gem."
        );
        provider.add("book.pastel.guidebook.knowledge_gem.page2.title", "XP Orb Absorption");
        provider.add(
            "book.pastel.guidebook.koi.page0.text",
            "A pale, large and hearty fish that feels most at home in puddles of [Liquid Crystal]" +
            "(entry://general/liquid_crystal)."
        );
        provider.add(
            "book.pastel.guidebook.lagoon_rod.page0.text",
            "Spending quiet days on my patio I have noticed that marine life seems to be strangely attracted to the " +
            "[Mermaid's Gems](entry://general/mermaids_brush) I found earlier. Since they naturally float on water, " +
            "I decided to use one as a bobber.\\\n\\\nLo and behold, not only does it increase my success, but it " +
            "also has a number of other interesting side effects..."
        );
        provider.add("book.pastel.guidebook.lagoon_rod.page1.text", "*I wonder what I can bring to the surface.*");
        provider.add(
            "book.pastel.guidebook.laurels_of_serenity.page0.text",
            "The idea of being left alone is great! What isn't so great is having my tongue go numb from drinking " +
            "leaf juice every fifteen minutes. The solution to my problems is self evident, simply wear the " +
            "nightdew!... and pump it full of purple ink.\\\n\\\n*Wait - since this is made from the flowers, does " +
            "that make it a lei?*"
        );
        provider.add(
            "book.pastel.guidebook.laurels_of_serenity.page1.text",
            "Infuse it with [Purple Ink](entry://ink/ink) in a [Color Picker](entry://ink/color_picker) to increase " +
            "stealth.\\\n\\\n*~ The sleep resistance is complimentary ~*"
        );
        provider.add(
            "book.pastel.guidebook.lava_gliding.page0.text",
            "[#](449900)Increased my movement speed and visibility in Lava[#]() with each level."
        );
        provider.add(
            "book.pastel.guidebook.lava_gliding.page1.text",
            "However, it did **NOT** protect me from damage by fire or lava.\\\n\\\n*Cries out for a slapstick sketch" +
            " at my expense one day, doesn't it?*"
        );
        provider.add(
            "book.pastel.guidebook.lava_sponge.page0.text",
            "When I held a [](item://minecraft:wet_sponge) in my hands, I thought naturally there must be a " +
            "counterpart for [#](bb00bb)Lava[#](), too. Although I haven't stumbled upon one yet, that hasn't " +
            "stopped me from inventing one.\\\n\\\nThis should make navigating the depths of the world and beyond " +
            "that hellish portal much easier."
        );
        provider.add(
            "book.pastel.guidebook.lava_sponge.page1.text",
            "...or so I thought, until I realized that the lava-soaked sponge also has an *unfortunate* side effect" +
            ".\\\nI should have guessed."
        );
        provider.add(
            "book.pastel.guidebook.lava_sponge.page2.text",
            "The Lava Sponge can be used as highly efficient fuel in the [Furnaces](item://minecraft:furnace), drying" +
            " in the process."
        );
        provider.add("book.pastel.guidebook.lava_sponge.page2.title", "Furnace Fuel");
        provider.add(
            "book.pastel.guidebook.lesser_potion_pendant.page0.text",
            "Potions are handy. Carrying half an inventory of them around, however, is not.\\\nThe Potion Pendant has" +
            " a small chamber that can be filled with a potion. As long as I wear it and have Ink on me, I will " +
            "receive the effects of that potion.\\\n\\\nSince the potions are not ingested, the effects only work " +
            "up to level III."
        );
        provider.add(
            "book.pastel.guidebook.life_drain.page0.text",
            "Life Drain is a horrible thing that turned my stomach around the first time I had it.\\\nIt slowly [#]" +
            "(449900)lowered my maximum hit points[#](), leaving me very vulnerable even to even minor hits."
        );
        provider.add(
            "book.pastel.guidebook.light_level_detector.page0.text",
            "[#](bb00bb)Daylight Detectors[#]() are imprecise when it comes to measuring light: the []" +
            "(item://minecraft:quartz) they use is so crudely processed that only sunlight can reliably trigger it" +
            ".\\\nAmethyst is much more sensitive when it comes to measuring light.\\\n\\\nEven the dim glow of a " +
            "[](item://minecraft:torch) is enough to produce a decent reading."
        );
        provider.add(
            "book.pastel.guidebook.light_level_detector.page1.text",
            "The Block Light Detector responds not only to sunlight, but also to other light sources, such as " +
            "light-emitting blocks."
        );
        provider.add(
            "book.pastel.guidebook.lightweight.page0.text",
            "[#](449900)Makes me a bit lighter[#]() with each level, allowing me to jump further and fall slower" +
            ".\\\nHigh levels even made me take [#](449900)no more fall damage[#]()."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal.page0.text",
            "The pure energy of gems in liquid form. Seems to have a healing effect."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal.page1.text",
            "Bringing it in contact with other liquids results in various materials with interesting properties."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal.page2.text",
            "Letting Liquid Crystal collide with [Humus](entry://magical_blocks/humus) creates [#](bb00bb)Clay[#]()! " +
            "Surely there are more combinations to be discovered!\\\n\\\n*Thomas had never seen such an imbalance " +
            "before.*"
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal.page3.text",
            "Allowing an entire block of Liquid Crystal to absorb the immense heat of Lava resulted in this" +
            ".\\\nAlmost feels like a [](item://minecraft:magma_block), albeit way hotter."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal.page4.text",
            "When [#](bb00bb)Water[#]() flowed into a full block of Liquid Crystal, the crystal solidified.\\\nSince " +
            "even the slightest touch was enough to give me a cold shiver, I named it Frostbite Crystal."
        );
        provider.add("book.pastel.guidebook.liquid_crystal_essences.name", "Crystallization");
        provider.add(
            "book.pastel.guidebook.liquid_crystal_essences.page0.text",
            "Allowing an entire block of [Liquid Crystal](entry://general/liquid_crystal) to absorb the immense heat " +
            "of [#](bb00bb)Lava[#]() resulted in this.\\\nAlmost feels like a [#](bb00bb)Magma Block[#](), albeit " +
            "way hotter."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal_essences.page1.text",
            "[Crushing](entry://general/item_crushing) [#](bb00bb)Blazing Crystal[#]() gave me this searing hot " +
            "essence that almost sets my hand on fire when I touch it. Crushing [#](bb00bb)Magma Blocks[#]() also " +
            "seems to work, albeit with far less yield."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal_essences.page2.text",
            "When [#](bb00bb)Water[#]() touched a source block of [Liquid Crystal](entry://general/liquid_crystal), " +
            "the crystal turned solid.\\\nSince even a light touch is enough to give me a cold shiver, I fittingly " +
            "named it Frostbite Crystal."
        );
        provider.add(
            "book.pastel.guidebook.liquid_crystal_essences.page3.text",
            "[Crushing](entry://general/item_crushing) [#](bb00bb)Frostbite Crystal[#]() gave me this ice-cold " +
            "essence that almost freezes my hand just by holding it. Crushing [#](bb00bb)Ice[#]() also seems to " +
 "work, too, albeit with far less yield."
        );
        provider.add("book.pastel.guidebook.lizards.name", "Lurking Lizards");
        provider.add("book.pastel.guidebook.lizards.page0.text", "*Not particularly affable contemporaries.*");
        provider.add(
            "book.pastel.guidebook.lizards.page1.text",
            "Quarrelsome beasts, always looking for trouble.\\\n\\\nActually, they'd be kind of cute if they weren't " +
            "always trying to bite off my limbs.\\\n...maybe I'd better keep them behind a [#](bb00bb)Glass Pane[#]" +
            "() - my extremities will thank me for it."
        );
        provider.add(
            "book.pastel.guidebook.lizards.page2.text",
            "Not particularly tasty and quite chewy, but when I am particularly hungry it does the job."
        );
        provider.add(
            "book.pastel.guidebook.lucky_roll.page0.text",
            "Will I become a pastry chef on top of my main job as an artist? These don't even look too bad (taste " +
            "good too!).\\\n\\\nComposed of [Amaranth](entry://cuisine/amaranth), [](item://minecraft:sugar), [Milk]" +
            "(item://minecraft:milk_bucket), and a [Four-Leafed Clover](entry://general/clover), I noticed a very " +
            "special effect: I was a little bit more successful handling tools with Fortune, Looting and other " +
            "random-based things."
        );
        provider.add("book.pastel.guidebook.lucky_roll.page1.text", "*Lucky Roll, get it???*");
        provider.add(
            "book.pastel.guidebook.magic_annulation.page0.text",
            "[#](449900)Reduced incoming magic damage[#]() by 1 point per level.\\\nWhile minor damage was less " +
            "dangerous to me, big hits still very much posed a threat."
        );
        provider.add("book.pastel.guidebook.malachite.name", "Malachite");
        provider.add(
            "book.pastel.guidebook.malachite.page0.text",
            "A pristine material that sparkles in a deep green hue. It seems to have strong magical properties, " +
            "almost like a abyssal analogue of [Azurite](entry://general/azurite). In another similarity to " +
            "[Azurite](entry://general/azurite), Malachite also needs to be refined. I first have to grow the small" +
            " fragments I found into full, usable crystals - though I'm not sure I'll see them fully grown in my " +
            "lifetime, since I didn't find a budding block for them."
        );
        provider.add(
            "book.pastel.guidebook.malachite.page1.text",
            "The [Crystallarieum](entry://ink/crystallarieum) seems to be the only way to grow it, serving as a " +
            "budding block alternative. I found [Moonstone](entry://general/moonstone_shards) to be a prerequisite, " +
            "as it creates an environment that mimics Imbrifer."
        );
        provider.add("book.pastel.guidebook.malachite.page1.title", "Refining Malachite");
        provider.add("book.pastel.guidebook.malachite_tools.name", "Malachite Tools");
        provider.add(
            "book.pastel.guidebook.malachite_tools.page0.text",
            "[Malachite](entry://dimension/malachite) as a material seems perfect for tools, best compared to [#]" +
            "(bb00bb)Diamond[#](), but much easier to combine with other materials.\\\n\\\nThese combinations are " +
            "where the fun begins, allowing for some uniquely intricate tools."
        );
        provider.add(
            "book.pastel.guidebook.malachite_tools.page1.text",
            "I have created the perfect [Multitool](entry://equipment/tools_and_armor/multitool)!\n- Sneak+Use to " +
            "switch between [#](449900)Silk Touch[#]() and [#](449900)Fortune[#]()\n- able to mine large tunnels at " +
            "once and able to [#](449900)strip[#](), [#](449900)till[#]() and [#](449900)flatten[#]()."
        );
        provider.add(
            "book.pastel.guidebook.malachite_tools.page2.text",
            "Its sheer size allows me to hit enemies from a greater distance with ease.\\\n\\\n*If it weren't for the" +
            " [Paltaeria](entry://general/paltaeria), I probably wouldn't even be able to lift it.*"
        );
        provider.add("book.pastel.guidebook.malachite_tools.page2.title", "Ultra Greatsword");
        provider.add(
            "book.pastel.guidebook.malachite_tools.page3.text",
            "A true powerhouse when dealing with aquatic creatures.\\\n\\\n*It may only have two prongs compared to a" +
            " [#](bb00bb)Trident[#](), but I made them twice as pointy instead!*"
        );
        provider.add(
            "book.pastel.guidebook.malachite_tools.page4.text",
            "Shoots projectiles at much higher speed and precision compared to a mundane [#](bb00bb)Crossbow[#]()."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.name", "Melochites Cookbook Vol. 1");
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page0.title", "Melochites Cuisine");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page1.text",
            "Hoi nephews! Whether this is your first time perusing a cookbook, or you are a seasoned cook who has " +
            "been following my tattling a while, I hope you are ready to explore some wonderful recipes with your " +
            "Aunt Malaya. Together, we will delve into some gorgeous traditional recipes from my corner of the deep" +
            " that I hope you will love~!\\\n\\\n  *~Mehrunes Chellaya of Melochites*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page2.text",
            "\\\nHearty, filling, and invigorating - Banyash may very well be the backbone of Melochites!\\\nThis " +
            "simple dish of crawfish is a bit of a favorite of mine, though the recent state of the surface has made" +
            " access to sweet berries somewhat difficult. Nonetheless, it remains the choice of malachite miners " +
            "for good reason!"
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page2.title", "A Sweet, Woody Stew");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page3.text",
            "*A sweet and savory Banyash, with notes of the woods. Made with crawfish and love~*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page4.text",
            "\\\nYoung hare is a delicacy not just here in Melochites, but in almost any place where Dreitons roam. " +
            "If you get the chance, please, *please* try using an artisanal azurte stout in this recipe. That kind " +
            "of beer is only made in a sparse few areas of Melochites but trust me, hard as it may be to get, it is" +
            " life changing with rabbit."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page4.title", "Hearty Roast with Beer");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page5.text",
            "*While a malt beer is traditional, any good, artisanal brew will do*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page6.text",
            "\\\nFeeding an entire group of people is no easy feat, but it is something that every mother has had to " +
            "deal with on the regular, I can tell you that much myself. This meatloaf recipe has been passed down, " +
            "doe to kit, in my family for generations - just thinking about how my mom used to cook it makes me " +
            "tear up a bit... I hope that you will pass it down onto your own children, too."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page6.title", "Loaf for a Family");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page7.text",
            "*A lovely way to feed your own nieces and nephews...\\\n\\\nYou are planning to feed a family, right?*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page8.text",
            "*Much more suitable for a single person.\\\nThough admittedly, it is still too big to fit in me.*"
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page8.title", "Stuffing Buns with Meat");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_1.page9.text",
            "*For the really freaky among you. Really takes your breath away.*"
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_1.page9.title", "Fermented Fish");
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.name", "Melochites Cookbook Vol. 2");
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page0.title", "Melochites Desserts");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page1.text",
            "Hoi nephews! Whether this is your first time perusing a cookbook, or you are a seasoned cook that has " +
            "been following my tattling a while, I hope you are ready to explore some wonderful recipes with your " +
            "Aunt Malaya. Together, we will explore some wondrous dessert and drink recipes from my home region, " +
            "which I hope you'll enjoy~!\\\n\\\n  *~Mehrunes Chellaya of Melochites*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page10.text",
            "\\\nBelieve me or not, Glass peaches are not only good with hearty food, but are also suitable for " +
            "desserts. Try it out! With even more sugar than these parts already have preserved in the jar, this jam" +
            " gives you a proper kick and whistles vigorously through your arteries."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page10.title", "Sugar Rush");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page11.text",
            "*So sweet it will color your blood orange.*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page2.text",
            "\\\nWhile Melochites may be best known for the amount and quality of malachite it exports, I can tell " +
            "you there is much more to this lovely place I call home. The breweries and distilleries nestled in this" +
            " corner of the caves are nothing short of wonderful, and the lovely liquors they make have resulted in" +
            " the creation of a lot of cocktails and drinks!"
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page2.title", "Creamy Shots");
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page3.text", "*Leaves you feeling cozy inside*");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page4.text",
            "\\\nOh, graces, of all the wonders of the surface, I can tell you none compare to the delightful cacao " +
            "and chocolate.\\\n\\\nIf there were one thing that could compel me to permanently move out and up, it " +
            "would be those two, they are truly wonderful, and if you disagree with me, I assure you this recipe " +
            "will make change your mind."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page4.title", "Plump and Chocolatey");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page5.text",
            "*If there is any proof that the Shura are still watching over us and life is good, this is it.*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page6.text",
            "\\\nYou know, sometimes it is easy to get caught up in the details of things, in nuance and long recipe " +
            "lists.\\\nSometimes, simpler is better,and this lovely pastry is a prime example of that; milk, flour, " +
            "butter, and sugar, that is all you need - don't let those stuck up Imbrifer gourmets tell you tell you" +
            " otherwise!"
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page6.title", "A Dessert Tart");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page7.text",
            "*Sweet, crispy and delicate.*\\\n\\\n*Goes great with tea!*"
        );
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page8.text",
            "\\\nA lot of people would say that us of Melochites are mighty eaters, and admittedly we do tend to be a" +
            " bit plump.\\\n\\\nBut, be honest nephew, if you lived in a place with a culinary tradition as rich as " +
            "what I've shown you, wouldn't you get a bit peckish too? At any rate, I think a lot of you lovely " +
            "readers appreciate my plumpness..."
        );
        provider.add("book.pastel.guidebook.melochites_cookbook_vol_2.page8.title", "Stuffed Treat!");
        provider.add(
            "book.pastel.guidebook.melochites_cookbook_vol_2.page9.text",
            "*A pound of eggs, a pound of sugar, a pound of flour, and a pound of cream.*"
        );
        provider.add("book.pastel.guidebook.melochites_cookbooks.aunt_melaya", "   *Aunt Melaya*");
        provider.add("book.pastel.guidebook.memories.name", "Memories");
        provider.add(
            "book.pastel.guidebook.memories.page0.text",
            "Thanks to the [Spirit Instiller](entry://creating_life/spirit_instiller), I was finally able to breathe " +
            "new life into a once dead creature!\\\nIt will materialise in an ethereal form at first, which I called" +
            " a *Memory*."
        );
        provider.add(
            "book.pastel.guidebook.memories.page1.text",
            "To remember a creature's memory, I need its [Head](entry://creating_life/mob_heads), as well as its most" +
            " beloved item and [Vegetal](entry://general/vegetal) as a bonding agent.\\\nUsing [Neolith]" +
            "(entry://general/neolith) seems to completely overwhelm the creature's energies, rendering the " +
            "resulting Memory unrecognizable, until the memory manifests."
        );
        provider.add(
            "book.pastel.guidebook.memories.page2.text",
            "Memories take a certain amount of time to manifest, almost like an egg: I have to place it down and wait" +
            ". Depending on the creature, it can be fairly quick, or it can take forever.\\\n\\\n*Placing Memories " +
            "on certain blocks seems to speed up the process or stop it altogether.*"
        );
        provider.add("book.pastel.guidebook.memories.page2.title", "Manifesting");
        provider.add(
            "book.pastel.guidebook.memories.page3.text",
            "Thanks to my vast knowledge, I can now resurrect even powerful creatures, such as Ender Dragons, Withers" +
            " and Wardens."
        );
        provider.add("book.pastel.guidebook.memories.page3.title", "Reviving Bosses");
        provider.add("book.pastel.guidebook.memory_to_head.name", "Mob Heads from Memories");
        provider.add(
            "book.pastel.guidebook.memory_to_head.page0.text",
            "Cutting off creatures' heads is not exactly the English way. And not one that is known for particularly " +
            "low animal cruelty. Nor the most efficient. Let's just say it exists.\\\nI like this new method here " +
            "much better. What was I thinking, back then?"
        );
        provider.add("book.pastel.guidebook.memory_to_head.page1.text", "*Pacifism run, go!*");
        provider.add("book.pastel.guidebook.mermaids_brush.name", "Mermaid's Brushes");
        provider.add(
            "book.pastel.guidebook.mermaids_brush.page0.text",
            "Mermaid's Brushes are an inconspicuous plant I found growing in the deepest depths of oceans, forever " +
            "untouched by human influence.\\\n\\\nThey grow a single blossom, which slowly develops into a " +
            "pearl-shaped seed. When fully grown, these hollow seeds float to the surface to be carried away by the" +
            " waves."
        );
        provider.add("book.pastel.guidebook.mermaids_brush.page0.title", "Mermaid's Brushes");
        provider.add(
            "book.pastel.guidebook.mermaids_brush.page1.text",
            "These seeds can be planted to grow another plant.\\\n\\\nMermaid's Gems have a strong bond with water - " +
            "So much so, that when I crack one open, water just comes rushing out.\\\n\\\n*Much more convenient than" +
            " lugging heavy buckets filled to the brim with water around...*\\\n*Where does the water come from?*"
        );
        provider.add("book.pastel.guidebook.mermaids_brush.page1.title", "Mermaid's Gems");
        provider.add(
            "book.pastel.guidebook.mermaids_jam.page0.text",
            "*Tastes like the ocean*\\\n\\\nA special kind of [Cheong](entry://cuisine/cheong) made from [Mermaid's " +
            "Gems](entry://general/mermaids_brush)."
        );
        provider.add(
            "book.pastel.guidebook.mermaids_jam.page1.text",
            "The recipe didn't win me over mainly with its flavour, that's for sure (especially not without eating " +
            "something with it).\\\nBut it does impress with the additional effect of water breathing.\\\n\\\nNot as" +
            " sweet as the other ones, but still, very tasty. It has a light note of salt."
        );
        provider.add(
            "book.pastel.guidebook.mermaids_popcorn.page0.text",
            "You know, these little seedlings of Mermaids Brushes are actually quite tasty. Of course I had to try " +
            "them.\\\nGetting them out of their shells is always a pain, though (just like my shy friends!).\\\nThen" +
            " I heated them up really strongly until the pressure from the inside caused the shell to burst all by " +
            "itself.\\\n\\\n*Crunchy*"
        );
        provider.add(
            "book.pastel.guidebook.mermaids_popcorn.page1.text",
            "*I could eat a whole bag in one sitting while watching my mob farm work.*"
        );
        provider.add("book.pastel.guidebook.midnight_aberration.description", "A great failure");
        provider.add(
            "book.pastel.guidebook.midnight_aberration.page0.text",
            "*This abomination of a gemstone radiates an eerie aura.*\\\n\\\nIt looks loosely connected at best. No " +
            "wonder it falls apart in my hands in no time. Total failure. Diary, I am both *devastated* and " +
            "disappointed in myself."
        );
        provider.add(
            "book.pastel.guidebook.midnight_aberration.page1.text",
            "While the chaos that ensued was *definitely* not the result I craved for, the result does indeed hold " +
            "immense power.\\\nSo much so that it will crumble to dust if not used quickly.\\\n\\\nAnd then there is" +
            " that aggressive blackish fluid that manifested in the process. Because of its color I named it " +
            "[Midnight Solution](entry://general/midnight_solution)."
        );
        provider.add(
            "book.pastel.guidebook.midnight_chip.page0.text",
            "Creatures that die in Midnight Solution drop a small splinter almost resembling [Midnight Aberration]" +
            "(entry://general/midnight_aberration), only much, much smaller, sharp-edged, and vicious" +
            ".\\\n\\\nCreatures unalived by this gruesome process also seem to [#](449900)drop items as if they " +
            "were killed by a player[#]()."
        );
        provider.add(
            "book.pastel.guidebook.midnight_chip.page1.text",
            "The very drop I get from killing creatures with this feisty liquid enables me to make even more of it. " +
            "Quite morbid, when I think about it."
        );
        provider.add(
            "book.pastel.guidebook.midnight_solution.page0.text",
            "This bizarre liquid is a direct result of [my failed fusion experiment]" +
            "(entry://general/midnight_aberration). Pity, really, but look what I have now.\\\n\\\nCreatures that " +
            "touch it seem to have their lives sucked out of them. Interesting...\\\nBetter not get caught in it " +
            "myself."
        );
        provider.add(
            "book.pastel.guidebook.midnight_solution.page3.text",
            "A seemingly useless block that forms around pools of Midnight Solution."
        );
        provider.add(
            "book.pastel.guidebook.midnight_solution.page4.text",
            "Throwing some items into the liquid seems to corrupt them to the point where they change into something " +
            "else entirely."
        );
        provider.add(
            "book.pastel.guidebook.midnight_solution.page5.text",
            "When I throw enchanted items into it, they will lose their special abilities. All that's left is the " +
            "normal item and a bunch of experience."
        );
        provider.add("book.pastel.guidebook.midnight_solution.page5.title", "Disenchanting");
        provider.add(
            "book.pastel.guidebook.milky_resin.page0.text",
            "This caramel-colored sap has a sweet aroma and a surprisingly luxurious taste! I can use it in the same " +
            "way as milk, it just needs a little bit of fermenting first.\\\n\\\n*The resin itself is tasty as well," +
            " but too sticky to drink on its own.*"
        );
        provider.add(
            "book.pastel.guidebook.milky_resin.page1.text",
            "*~ A pinch of sugar and a little love, and tada - [Clotted Cream](entry://cuisine/titration_barrel#4)! ~*"
        );
        provider.add("book.pastel.guidebook.milky_resin.page1.title", "Plant-based Milk");
        provider.add(
            "book.pastel.guidebook.mob_heads.page0.text",
            "I was able to get a Mob Head, but not one of the ones I knew about, but one I had never seen before" +
            ".\\\n\\\nWhile they make for a nice display on my wall, they also still inherit a small spark of the " +
            "creature's existence."
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.name", "Applied Energistics");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page0.text",
            "\"Any technology advanced enough is indistinguishable from magic\", I once heard.\\\n\\\nI'm still not " +
            "entirely sure how this system manages to store so many blocks in such a small space, but since I " +
            "regularly walk around with hundreds of square metres of dirt, I've never bothered to question it."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page1.text",
            "Looks like the [#](bb00bb)Crystal Growth Accelerator[#]() can speed up the growth of all kinds of " +
            "Gemstone Buds!"
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.page1.title", "Growth Acceleration");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page2.text",
            "The [Crystal Apothecary](entry://ink/crystal_apothecary) is able to harvest [#](bb00bb)Certus Quartz[#]()."
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.page2.title", "Quartz Auto-Harvesting");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page3.text",
            "Tools enchanted with [Resonance](entry://enchanting/enchantments/resonance) are able to harvest [#]" +
            "(bb00bb)Budding Quartz[#](), they even retain their *flawless* state."
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.page3.title", "Moving Budding Quartz");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page4.text",
            "Many of AE2's items can be [crushed to dust with an Anvil](entry://general/item_crushing): [#](bb00bb)" +
            "Certus Quartz[#](), [#](bb00bb)Fluix Crystals[#](), [#](bb00bb)Skystone[#]() and [#](bb00bb)Ender " +
            "Pearls[#]()."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page5.text",
            "In desperate need of [#](bb00bb)Charged Certus Quartz[#]()? [Storm Stones](entry://general/storm_stones)" +
            " will charge them up in a heartbeat."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.page6.text",
            "...and then create [#](bb00bb)Fluix[#]() out of it, if I get impatient."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.silicon_from_rock_crystal.text",
            "Looks like Rock Crystals are a great source of Silicon!"
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.silicon_from_rock_crystal.title", "Efficient Silicon");
        provider.add("book.pastel.guidebook.mod_integration.ae2.pure_resources.title", "Pure Certus & Fluix");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.pure_resources.text",
            "As crystalline structures, [#](bb00bb)Certus Quartz[#]() and [#](bb00bb)Fluix Crystals[#]() can be grown" +
            " in the [Crystallarieum](entry://ink/crystallarieum)."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.pure_certus_quartz_growing.title", "Growing Pure Certus Quartz");
        provider.add("book.pastel.guidebook.mod_integration.ae2.pure_certus_quartz_growing.text", "");
        provider.add(
            "book.pastel.guidebook.mod_integration.ae2.pure_fluix_crystal_growing.title",
            "Growing Pure Fluix Crystals"
        );
        provider.add("book.pastel.guidebook.mod_integration.ae2.pure_fluix_crystal_growing.text", "");

        provider.add("book.pastel.guidebook.mod_integration.alloy_forgery.forge_controller", "Forge Controller");
        provider.add("book.pastel.guidebook.mod_integration.alloy_forgery.name", "Alloy Forgery");
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.intro0.text",
            "Hardened by heat and pressure, beautiful Alloy Forges can be made from calcite and basalt" +
            ".\\\n\\\nPerhaps I will even find more minerals to use on my next adventure. Best to write them all " +
            "down here."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.intro1.text",
            "In addition, some items can be used as special fuel for Alloy Forges, and some ores have increased " +
        "output when smelted in one.\\\n\\\nTell Noaaan I said hi!"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.pyrite_alloy_forge.text",
            "A high-end forge that melts at an incomparable temperature. Low capacity."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.bone_ash_alloy_forge.text",
            "An exceptional forge that uses extra pressure to speed up the melting process. Holds a reasonable amount" +
            " of fuel, but is rather slow."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.pure_resources.text",
            "Pure Resources get a nice multiplier when turned into their mundane counterpart."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.stratine_ore.text",
            "With a high tier [#](449900)Alloy Forge[#]() I can squeeze quite a bit more [Stratine]" +
            "(entry://general/stratine) out of the raw ore."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.paltaeria_ore.text",
            "...same is true for its sister ore [Paltaeria](entry://general/paltaeria), of course."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.wet_lava_sponge.text",
            "A dripping [#](bb00bb)Lava Sponge[#]() contains enough heat to power an Alloy Forge for quite some time."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.incandescent_essence.text",
            "Also a good heat source for my Alloy Forges."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.basalt_alloy_forge.text",
            "Quite slow, but packs a *lot* of fuel."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.calcite_alloy_forge.text",
            "Twice as fast as the Basalt variant, but I have to refuel quite more often."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.blackslag_alloy_forge.text",
            "A high-tier Forge with medium speed and fuel capacity."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.alloy_forgery.shale_clay_alloy_forge.text",
            "A high-end forge with incredible capacity and reasonable smelting speed."
        );
        provider.add("book.pastel.guidebook.mod_integration.biomemakeover.name", "Biome Makeover");
        provider.add(
            "book.pastel.guidebook.mod_integration.biomemakeover.page0.text",
            "I recently found new materials scattered across the landscape in new, beautiful terrain. I'm sure I can " +
            "use them in some interesting way."
        );
        provider.add("book.pastel.guidebook.mod_integration.biomemakeover.page1.title", "Antidote Potions");
        provider.add("book.pastel.guidebook.mod_integration.biomemakeover.page2.title", "Nocturnal Potions");
        provider.add(
            "book.pastel.guidebook.mod_integration.biomemakeover.page3.text",
            "The [Crystal Apothecary](entry://ink/crystal_apothecary) is capable of harvesting [#](bb00bb)Illunite " +
            "Shards[#]()."
        );
        provider.add("book.pastel.guidebook.mod_integration.biomemakeover.page3.title", "Illunite Auto-Harvesting");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.black_lotus_reagent.text",
            "- +1 positive effect\n- 50%% chance for negative effect\n- makes the potion unidentifiable.\\\n\\\n*Do I" +
            " fancy a gamble?*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.blacker_lotus_reagent.text",
            "- +2 positive effects\n- +1 negative effect\n- makes the potion unidentifiable.\\\n\\\n*Do I fancy a " +
            "gamble?*"
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.blackest_lotus.text", "Mana against humanity.");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.blackest_lotus_reagent.text",
            "- +3 positive effects\n- +1 negative effect\n- makes the potion unidentifiable.\\\n\\\n*Do I fancy a " +
            "gamble?*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.least_black_lotus.text", "This one... ummm.... hmmm, yeah.");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.least_black_lotus_reagent.text",
            "- +1 positive effect\n- +3 negative effects\n- makes the potion unidentifiable.\\\n\\\n*Do I fancy a " +
            "gamble?*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.life_essence_reagent.text",
            "- +2.5 potency\n- -3 yield\\\n\\\nRequires other reagents to increase the yield, otherwise I will end up" +
            " with nothing..."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.mana_powder_reagent.text",
            "- +25%% duration\n- 15%% chance to add last effect"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.pixie_dust_reagent.text",
            "- creates Lingering Potions & Tipped Arrows\n- -25%% potency"
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.name", "Botania");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page0.text",
            "I found an abundance of colorful flowers growing in small patches in forests and plains! What's up with " +
            "those? Definitely worth a look tinkering with them and train my brown thumb."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page1.text",
            "Crushing the flowers may seem a bit unorthodox, but it *did* work. No problem plucking the petals from " +
            "the flattened blossom afterwards."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page2.text",
            "Having studied color theory as well as botany, I can definitely see some similarities. The colored " +
            "flowers, resemble [Colored Trees](entry://general/colored_trees) in more than just one way.\\\n\\\nNo " +
            "wonder their petals make a great source of [Ink](entry://ink/ink)."
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.page2.title", "Ink from Petals");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page20.text",
            "Constructors and Exchanging Staffs are able to pull blocks out of my Black Hole Talisman."
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.page20.title", "Providing Building Blocks");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page3.text",
            "Adding some [Shimmerstone](entry://general/shimmerstone) to magical flowers will make them glimmer."
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.page3.title", "Glimmering Flowers");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page4.text",
            "Applying [Pigment](entry://general/pigment) to mushrooms will color them in the respective color."
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.page4.title", "Colored Mushrooms");
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page5.text",
            "Using [Pigment](entry://general/pigment) instead of [#](bb00bb)Dye[#]() when crafting [#](bb00bb)Floral " +
            "Fertilizer[#]() is quite a bit more yielding."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page6.text",
            "The [#](bb00bb)Black Lotus[#]() is a great source of Mana, no questions asked. However, it can be " +
            "improved with some [#](449900)Jade Petals[#]()."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page7.text",
            "Those elusive seeds I could only find in chests hidden across the world? Expensive - maybe not even " +
            "worth the hassle - but I finally found a way to reproduce them."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.botania.page8.text",
            "I can finally harvest Enchanted Soil! [Resonance](entry://enchanting/enchantments/resonance) is the key."
        );
        provider.add("book.pastel.guidebook.mod_integration.botania.page8.title", "Enchanted Soil");
        provider.add("book.pastel.guidebook.mod_integration.byg.name", "Oh The Biomes You'll Go");
        provider.add("book.pastel.guidebook.mod_integration.chalk.name", "Chalk");
        provider.add(
            "book.pastel.guidebook.mod_integration.chalk.page0.text",
            "Getting lost deep down time and time again has made me carry a bit of [#](bb00bb)Chalk[#]() at all " +
            "times, allowing me to mark the way back out. Unfortunately these little pieces of Calcite never last " +
            "long before they break."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.chalk.page1.text",
            "By using [Pigment](entry://general/pigment) instead of Dye, the [#](bb00bb)Chalk[#]() provides me with a" +
            " never-ending supply of markings."
        );
        provider.add("book.pastel.guidebook.mod_integration.chalk.page1.title", "Unbreakable Chalk");
        provider.add(
            "book.pastel.guidebook.mod_integration.chalk.page2.text",
            "Of course I was able to make [#](bb00bb)Glow Chalk[#]() unbreakable, too."
        );
        provider.add("book.pastel.guidebook.mod_integration.chalk.page2.title", "Unbr. Glow Chalk");
        provider.add(
            "book.pastel.guidebook.mod_integration.chalk.page3.text",
            "Oh yeah, *colored* chalk! Of course I haven't forgotten you."
        );
        provider.add("book.pastel.guidebook.mod_integration.chalk.page3.title", "Chalk Colorful Addon");
        provider.add("book.pastel.guidebook.mod_integration.conjuring.name", "Conjuring");
        provider.add(
            "book.pastel.guidebook.mod_integration.conjuring.page0.text",
            "*Souls, Spirits, Cages*\\\nNow if that isn't a work of shrewd occultism I don't know what is."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.conjuring.page1.text",
            "Distilled Spirits can be...\\\numm... distilled?\\\n*distilled further?*\\\ninto long-lasting [#]" +
            "(449900)Resistance[#]() Potions."
        );
        provider.add("book.pastel.guidebook.mod_integration.conjuring.page1.title", "Resistance Potions");
        provider.add(
            "book.pastel.guidebook.mod_integration.conjuring.page2.text",
            "I'm not even sure how I came up with this recipe anymore.\\\nMaybe I inhaled a little too much [#]" +
            "(bb00bb)Quitoxic Powder[#]() when combining various ingredients. But the result is interesting, no doubt."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.conjuring.page3.text",
            "Combining everything I learned as a Spawner expert and Pigment Tinkerer, I was finally able to create my" +
            " own [#](bb00bb)Mob Spawners[#]()!\\\nI only need to assign a creature to spawn using the [Spirit " +
            "Instiller](entry://creating_life/spirit_instiller)."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.name", "Create");
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page0.text",
            "Everywhere it rattles and fizzles, whistles and smokes. An ensemble of assemblage.\\\n\\\nSurely some of" +
            " these machines will come in handy."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page1.text",
            "[#](bb00bb)Gemstones[#]() can be crushed, yielding [#](bb00bb)Gemstone Powder[#]()."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page2.text",
            "[#](bb00bb)Colored Leaves[#]() can be crushed, yielding [Pigment](entry://general/pigment) and a higher " +
            "chance for [#](bb00bb)Colored Saplings[#]()."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.page2.title", "Milling Leaves");
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page3.text",
            "Crushing [#](449900)Colored Logs[#]() gives me [Pigment](entry://general/pigment)."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page4.text",
            "[Quitoxic Reeds](entry://general/quitoxic_reeds) can be milled into powder."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.page4.title", "Milling Quitoxic Reeds");
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page5.text",
            "[Amaranth](entry://cuisine/amaranth) can be milled into grains."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.page5.title", "Milling Amaranth");
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page6.text",
            "Milling [Frostbite Crystal](entry://general/crystallisation) will yield a nice amount of [#](bb00bb)" +
            "Frostbite Essence[#]()."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.page6.title", "Milling Frostbite Crystal");
        provider.add(
            "book.pastel.guidebook.mod_integration.create.page7.text",
            "Milling [Blazing Crystal](entry://general/crystallisation) will yield a nice amount of [#](bb00bb)" +
            "Incandescent Essence[#]()."
        );
        provider.add("book.pastel.guidebook.mod_integration.create.page7.title", "Milling Blazing Crystal");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_zinc.title", "Pure Zinc");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_zinc.text", "");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_zinc_growing.title", "Pure Zinc Growing");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_zinc_growing.text", "");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_brass_fusion.title", "Fusing Brass");
        provider.add("book.pastel.guidebook.mod_integration.create.pure_brass_fusion.text", "");
        provider.add("book.pastel.guidebook.mod_integration.dimdoors.name", "Dimensional Doors");
        provider.add(
            "book.pastel.guidebook.mod_integration.dimdoors.page0.text",
            "I was just wandering around, looking for geodes *again*, not having the greatest time. But then I " +
            "stumbled over a... star fissure... rift... whatever I will be calling it.\\\n\\\nYou know how the " +
            "saying goes: Of one door closes..."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.dimdoors.altered_fabric_resonance.title", "The Finest Touch");
        provider.add(
            "book.pastel.guidebook.mod_integration.dimdoors.altered_fabric_resonance.text",
            "Easily breakable, yet no matter how carefully I mine it, nothing remains? Now where have I seen this " +
            "before?\\\n As expected, resonance does the trick."
        );
        provider.add("book.pastel.guidebook.mod_integration.ecologics.name", "Ecologics");
        provider.add(
            "book.pastel.guidebook.mod_integration.ecologics.page0.text",
            "New biomes bring new opportunities. But which ones?\\\n*Time to find out!*"
        );
        provider.add("book.pastel.guidebook.mod_integration.ecologics.page1.title", "Slippery Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.name", "Extra Alchemy");
        provider.add(
            "book.pastel.guidebook.mod_integration.extraalchemy.page0.text",
            "To an ignoramus, an alchemist might well be mistaken for a magician. Time to get to know the differences" +
            " - but also the similarities."
        );
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page1.title", "Combustion Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page10.title", "Pacifism Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page11.title", "Photosynthesis Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page12.title", "Piper Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page13.title", "Recall Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page14.title", "Returning Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page15.title", "Sails Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page16.title", "Shrinking Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page2.title", "Concentration Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page3.title", "Crumbling Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page4.title", "Detection Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page5.title", "Fuse Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page6.title", "Gravity Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page7.title", "Growing Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page8.title", "Learning Potions");
        provider.add("book.pastel.guidebook.mod_integration.extraalchemy.page9.title", "Magnetism Potions");
        provider.add("book.pastel.guidebook.mod_integration.farmersdelight.name", "Farmer's Delight");
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.page0.text",
            "Once the work is done, it's relaxing to watch the plants grow. The chopping board is ready, the vinegar " +
            "has been prepared.\\\n\\\nSee you at the next Harvest Moon, we will have a grand dinner."
        );
        provider.add("book.pastel.guidebook.mod_integration.farmersdelight.page1.title", "Cutting Tools");
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.page1.text",
            "The multitool sure does live up to its name, huh. Despite its awkward shape, it is perfectly serviceable" +
            " as a knife, able to butcher and harvest with ease.\\\nAdditionally, it works *wonders* on a cutting " +
            "board, acting as... well. Any tool, able to hack or chop or slice whatever I throw at it."
        );
        provider.add("book.pastel.guidebook.mod_integration.farmersdelight.amaranth_cutting.title", "Cutting Amaranth");
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.amaranth_cutting.text",
            "Amaranth, that wonderful grain with its majestic hue. Why would I be so barbaric, as to smash it into " +
            "pieces? A gentler approach, as with rice, would do just fine.\\\nA slice with a knife will chop the " +
            "bushel up with ease, leaving me with straws as well."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.rice_crushing.text",
            "*SMASH SMASH SMASH CRUSH IT TO PIECES WHO CARES ABOUT BEING GENTLE*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.gemstone_cutting.title", "Cutting Gemstones");
        provider.add(
            "book.pastel.guidebook.mod_integration.farmersdelight.gemstone_cutting.text",
            "Geodes have so many gems, packed together into blocks... and I really can't break them out? Well, guess " +
            "I'll need to get a bit more inventive.\\\nCutting gemstone blocks on a cutting board with any pickaxe, " +
            "will give me the shards within."
        );
        provider.add("book.pastel.guidebook.mod_integration.geode_plus.name", "Geode+");
        provider.add("book.pastel.guidebook.mod_integration.gobber.name", "Gobber");
        provider.add(
            "book.pastel.guidebook.mod_integration.gobber.page0.text",
            "This material seems ridiculously powerful for how common it is. That's why I gave it such a funny name. " +
            "Let's see what I can do with it."
        );
        provider.add("book.pastel.guidebook.mod_integration.gobber.page1.text", "It grows!");
        provider.add("book.pastel.guidebook.mod_integration.gobber.page2.text", "It also grows!");
        provider.add(
            "book.pastel.guidebook.mod_integration.gobber.page3.text", "You are not going to believe this, but...");
        provider.add("book.pastel.guidebook.mod_integration.gofish.name", "Go Fish");
        provider.add("book.pastel.guidebook.mod_integration.gofish.page0.text", "Let's see what's biting today.");
        provider.add(
            "book.pastel.guidebook.mod_integration.gofish.page1.text",
            "My magical fishing rods allow me to fish lava and end dwelling fish, like the Go Fish fishing rods.\\\nI" +
            " can also fish Crates, as long as I am in the open."
        );
        provider.add("book.pastel.guidebook.mod_integration.gofish.page1.title", "Lava Fishing");
        provider.add(
            "book.pastel.guidebook.mod_integration.gofish.page2.text",
            "While the Deepfry Enchantment cooks fish as usual, I have not found a way to attach lures to rods made " +
            "with Pigment. However, I am sure I will find a way to enhance these rod later by other means" +
            ".\\\nDeepfry on Fishing Rods is mutually exclusive with Foundry."
        );
        provider.add("book.pastel.guidebook.mod_integration.gofish.page2.title", "Deepfry");
        provider.add("book.pastel.guidebook.mod_integration.hexcasting.name", "Hex Casting");
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page0.text",
            "Unlike my other gems, [#](bb00bb)Amethyst[#]() seems to have the ability to power spell casting wands. " +
            "While this ability has broken my brain on more than one occasion, the results are impressive.\\\nWhat " +
            "else is there?"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page1.text",
            "Hexcasters are seemingly unable to identify minerals other than Amethyst. *Clearly* these cyan-colored " +
            "leaves have the essence of [#](bb00bb)Topaz[#]()..."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page2.text",
            "By infusing [#](bb00bb)Leaves[#]() with [#](bb00bb)Amethyst[#](), [#](bb00bb)Citrine[#]() or [#](bb00bb)" +
            "Topaz[#](), I get out glistening, colorful [#](bb00bb)Gemstone Leaves[#](). Intriguingly different, yet" +
            " familiar to my [Colored Trees](entry://general/colored_trees)."
        );
        provider.add("book.pastel.guidebook.mod_integration.hexcasting.page2.title", "Edified Leaf Crafting");
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page3.text",
            "I can charge up [#](bb00bb)Amethyst Shards[#]() using the [Fusion Shrine](entry://general/fusion_shrine)."
        );
        provider.add("book.pastel.guidebook.mod_integration.hexcasting.page3.title", "Charging Amethyst");
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page4.text",
            "- +15-120s duration. Sometimes more, sometimes less\\\n\\\nAs I expected, [#](bb00bb)Charged Amethyst[#]" +
            "() serves as a more potent [#](bb00bb)Amethyst[#]() reagent in regards to prolonging durations, though " +
            "it's also more prone to fluctuation."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.hexcasting.page5.text",
            "Adding a Fermented Spider Eye will change the effect to **Clouding** instead."
        );
        provider.add("book.pastel.guidebook.mod_integration.immersive_weathering.name", "Immersive Weathering");
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.page0.text",
            "This really immerses my weathering."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.enchanted_golden_moss.text",
            "*Neither chaotic nor lawful to moss.*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.charred_wood_resonance.title", "Charred Wood");
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.charred_wood_resonance.text",
            "Mining flaming remnants of wood with a resonance-enchanted tool seems to keep them smoldering in my " +
            "inventory.\\\n\\\n*... This is fine.*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.sandy_stone_resonance.title", "Sandy Stones");
        provider.add(
            "book.pastel.guidebook.mod_integration.immersive_weathering.sandy_stone_resonance.text",
            "Like with flaming wood, it seems any extra sand comes with me. Niche, but convenient!"
        );
        provider.add("book.pastel.guidebook.mod_integration.little_ants.name", "Little Ants");
        provider.add(
            "book.pastel.guidebook.mod_integration.little_ants.page0.text",
            "These industrious little buggers continuously collect leaves from trees. The results of their work are " +
            "reflected in their products. While they mainly produce [#](449900)Clay[#](), there may be others.." +
            ".\\\n\\\nShout out to MastroCaleb for this great mod!"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.little_ants.page1.text",
            "The ants produce an almost silk-like material from [#](bb00bb)Jade Petals[#]()."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.little_ants.page2.text",
            "If I shovel a full anthill that has collected leaves from colored trees, I get [#](bb00bb)Dye[#]()."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.little_ants.page3.text",
            "Even better, if I bribe them with [#](449900)Vegetal[#](), I can get pure [#](449900)Pigment[#]() instead."
        );
        provider.add("book.pastel.guidebook.mod_integration.malum.name", "Malum");
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.page0.text",
            "I did not expect Arcana to be such a... grim field of study.\\\n\\\nLet's jump in, hoping I will make it" +
            " back sane."
        );
        provider.add("book.pastel.guidebook.mod_integration.malum.scythe_enchants.title", "Enchanting Scythes");
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.scythe_enchants.text",
            "Like with any weapon, the new enchantments I have devised can be bestowed upon a scythe. There are... a " +
            "few complications with some enchantments being *incompatible*, though."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.scythe_incompats.text",
            "- Even when magically imbued, it's hard to throw a scythe when I'm holding it so tightly\n- Spirit " +
            "Plunder is as expected, not compatible with anything incompatible with Looting\n- Similarly, anything " +
            "that doesn't play nicely with Sharpness, also won't like Haunted"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.void_salts_reagent.text", "- +200%% duration\n- -2 yield");
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.crystal_burning.text",
            "A flame that chars the very soul... Crystallized fragments are treated just the same, energies consumed " +
            "in embers."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.malum.silenced.text",
            "A potent anti-magic effect, seems that it prevents me from utilizing ink as well."
        );
        provider.add("book.pastel.guidebook.mod_integration.more_geodes.name", "More Geodes");
        provider.add("book.pastel.guidebook.mod_integration.mythicmetals.name", "Mythic Metals");
        provider.add(
            "book.pastel.guidebook.mod_integration.mythicmetals.page0.text",
            "The underground holds so many secrets, it's incredible! Every time I dive into my mining work, I emerge " +
            "with a whole bundle of treasures - each time more different ones than I've ever found.\\\nNot just " +
            "Copper, Iron and Gold - the subterranean has a lot to discover, still."
        );
        provider.add("book.pastel.guidebook.mod_integration.mythicupgrades.name", "Geode+");
        provider.add("book.pastel.guidebook.mod_integration.neepmeat.name", "NEEPMeat");
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.page0.text",
            "I didn't realise that you needed to be trained as a machinist to become a butcher."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.leaf_crushing.text",
            "While the [](item://neepmeat:large_crusher) does not yield me too much Pigment, I have a good chance for" +
            " Saplings!"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.amaranth_crushing.text",
            "Using the [](item://neepmeat:grinder) or [](item://neepmeat:large_crusher) I can get a lot more grains " +
            "out of Amaranth."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.grinding.text",
            "A few items handle grinding down pretty well.\\\nDefinitely superior to smashing them with an anvil."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.enlightening.text",
            "Did you know that Silverfish and Endermites are related?\\\nI sure did NOT."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.kindling_vivisection.title", "Getting more feathers.");
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.kindling_vivisection.text",
            "...\\\n\\\n\\\n\\\n*But at what cost?*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.whisper_brass_instilling.text",
            "I've had a lot of experience infusing life into materials... seems I can finally go about this more " +
            "efficiently"
        );
        provider.add("book.pastel.guidebook.mod_integration.neepmeat.sedatives.title", "Medicine of the Mind");
        provider.add(
            "book.pastel.guidebook.mod_integration.neepmeat.sedatives.text",
            "My studies have exposed me to... unfavorable horrors.\\\n\\\n When I take these, the visions go away and" +
            " I feel a bit more like myself."
        );
        provider.add("book.pastel.guidebook.mod_integration.paginatedadvancements.name", "Paginated Advancements");
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page0.text",
            "I am an advancement hunter with style!\\\n\\\nWith Paginated Advancements, Pastel's advancements use " +
            "new, unique frames."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page1.text",
            "Mark the start and end of an advancement tree: important milestones in my journey."
        );
        provider.add("book.pastel.guidebook.mod_integration.paginatedadvancements.page1.title", "Milestones");
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page2.text",
            "Advancements that use this slightly modified frame have some sort of unlock attached to them: new " +
            "recipes, a new revelation or something else (for all you completionists out there!)" +
            ".\\\n\\\nAdvancements without additional unlocks use the default frame instead."
        );
        provider.add("book.pastel.guidebook.mod_integration.paginatedadvancements.page2.title", "Additional Unlocks");
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page3.text",
            "Indicates that there is a new structure I have to build."
        );
        provider.add("book.pastel.guidebook.mod_integration.paginatedadvancements.page3.title", "Structure Building");
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page4.text",
            "For affairs of heart, which require an extraordinary eye for detail."
        );
        provider.add("book.pastel.guidebook.mod_integration.paginatedadvancements.page4.title", "Unique Advancements");
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page5.text",
            "Granted for doing something remarkably stupid.\\\nThese are purely optional meme advancements with no " +
            "unlocks."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.paginatedadvancements.page5.title", "Shitpost Advancements");
        provider.add("book.pastel.guidebook.mod_integration.sandwichable.name", "Sandwichable");
        provider.add(
            "book.pastel.guidebook.mod_integration.sandwichable.page0.text",
            "What's for breakfast today?\\\n\\\nHow about a toast topped with steak and steak and steak and steak and" +
            " steak and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and steak and" +
            " steak and steak and steak and steak and steak and steak and steak and steak and steak and steak " +
            "and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and steak " +
            "and steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak and" +
            " steak and steak and steak and steak and steak and steak and steak and steak and steak " +
            "and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and steak " +
            "and steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and " +
            "steak and steak and steak and steak and steak and steak and steak and steak and" +
            " steak and steak and steak and steak and steak and steak and steak and steak " +
            "and steak and steak and steak and steak and steak and a beetroot, I do not " +
            "want to get fat."
        );
        provider.add("book.pastel.guidebook.mod_integration.sandwichable.salty_resonance.title", "The Finest Touch");
        provider.add(
            "book.pastel.guidebook.mod_integration.sandwichable.salty_resonance.text",
            "Easily breakable, yet no matter how carefully I mine it, nothing remains? Now where have I seen this " +
            "before?\\\n As expected, resonance does the trick."
        );
        provider.add("book.pastel.guidebook.mod_integration.spelunkery.name", "Spelunkery");
        provider.add(
            "book.pastel.guidebook.mod_integration.spelunkery.page0.text",
            "What did I see sparkling and shining there with my spelunking eyes?\\\\\\nA shiny new thing!\\\n\\\nI " +
            "love things!"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.spelunkery.black_materia_sluice.title",
            "Washing Away Your Mistakes"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.spelunkery.black_materia_sluice.text",
            "Failure has wrought me with this... *substance*. It reeks of wrongness, of blight, but... maybe there's " +
            "a way to sift something out of it?\\\n\\\nSpiders. Spiders and spiders and more spiders I hate them I " +
            "HATE I HATE I HATE...\\\nThere has to be something else. Maybe if I sift something *through* it? " +
            "Something of a similar nature..."
        );
        provider.add("book.pastel.guidebook.mod_integration.starry_skies.name", "Starry Skies");
        provider.add(
            "book.pastel.guidebook.mod_integration.starry_skies.page0.text",
            "Above the hemisphere of the Overworld exists a very different kind of dimension: filled with numerous " +
            "spheres that float like small planets.\\\n\\\nI can reach them by building a portal from []" +
            "(item://minecraft:packed_ice) (if it hasn't been changed by the modpack)."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.starry_skies.page1.text",
            "There I can find numerous resources that are hard to come by in the Overworld: Geode Spheres, Pastel's " +
            "ores, and anything else my heart desires - unless I fall off a planet and plummet to my certain death."
        );
        provider.add("book.pastel.guidebook.mod_integration.supplementaries.name", "Supplementaries");
        provider.add(
            "book.pastel.guidebook.mod_integration.supplementaries.page0.text",
            "A supplementary addition to this world of color."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.supplementaries.page1.text",
            "*Still better than waiting for a trader.*"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.supplementaries.page2.text",
            "*An offering to appease the soap gods*"
        );
        provider.add("book.pastel.guidebook.mod_integration.supplementaries.page3.title", "Ash Flakes");
        provider.add(
            "book.pastel.guidebook.mod_integration.supplementaries.page3.text",
            "*It's ash.*\\\n\\\n\\\n\\\nUsable in all the other things you'd use ashes for."
        );
        provider.add("book.pastel.guidebook.mod_integration.tconstruct.name", "Tinkers / Hephaestus");
        provider.add(
            "book.pastel.guidebook.mod_integration.tconstruct.page0.text",
            "Modular tools were always a field I was interested in. Let's see what I can come up with to make my life" +
            " easier."
        );
        provider.add("book.pastel.guidebook.mod_integration.tech_reborn.name", "Tech Reborn");
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.page0.text",
            "There is this new thing, called *Electricity*. I should check that out.\\\n\\\nThe factory must grow."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.refined_iron_ingot.text",
            "The Cinderhearth is great at creating Refined Iron! What a little more heat can do."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.refined_iron_ingot.title", "Efficient Refined Iron");
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.advanced_alloy_ingot.text",
            "The same method also works great for Advanced Alloys."
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.advanced_alloy_ingot.title",
            "Efficient Advanced Alloys"
        );
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.page2.text",
            "I can process most of my magical ores in the Grinder and Industrial Grinder."
        );
        provider.add("book.pastel.guidebook.mod_integration.tech_reborn.page2.title", "Ore Processing");
        provider.add(
            "book.pastel.guidebook.mod_integration.tech_reborn.page3.text",
            "Of course I can also grind down Shards, too!\\\n\\\n*I hate grind in games*"
        );
        provider.add("book.pastel.guidebook.mod_integration.tech_reborn.page3.title", "Gem Grinding");
        provider.add("book.pastel.guidebook.mod_integration.the_bumblezone.name", "The Bumblezone");
        provider.add(
            "book.pastel.guidebook.mod_integration.the_bumblezone.page0.text",
            "I have now consumed too much honey to remember why I threw an ender pearl into a beehive.\\\n\\\nI ended" +
            " up in such a weird place, I shit you not."
        );
        provider.add("book.pastel.guidebook.mod_integration.the_bumblezone.essence_ink.title", "Colors and Mayhem");
        provider.add(
            "book.pastel.guidebook.mod_integration.the_bumblezone.essence_ink.text",
            "These essences... they're absolutely **brimming** with energy. Useful, yes, but they also act as " +
            "**troves** of ink... if I'm willing to sacrifice them.\\\nTry as I might though, the chaotic essence of" +
            " the bees won't stabilize itself enough to be converted to ink..."
        );
        provider.add("book.pastel.guidebook.mod_integration.vein_mining.name", "Vein Mining");
        provider.add(
            "book.pastel.guidebook.mod_integration.vein_mining.page0.text",
            "*Still mining each ore individually? Gravity might make it easier.*\\\n\\\nVein Mining rips out all " +
            "connected blocks.\\\n\\\nMax Level: 1\\\nApplicable to all tools."
        );
        provider.add("book.pastel.guidebook.mod_integration.victus.name", "Victus");
        provider.add(
            "book.pastel.guidebook.mod_integration.victus.page0.text",
            "I took heart... and another and another. Now I've got a whole bunch of them. Exciting, huh."
        );
        provider.add("book.pastel.guidebook.mod_integration.victus.page1.title", "Resurgence");
        provider.add("book.pastel.guidebook.mod_integration.victus.page2.title", "Heartbleed");
        provider.add("book.pastel.guidebook.mod_integration.waystones.name", "Waystones");
        provider.add(
            "book.pastel.guidebook.mod_integration.waystones.page0.text",
            "Sharing is caring... so then why do these get made without a pair?\\\nWith what I know, replacing the " +
            "central warp core with some Radiating Ender should be pretty simple. Now I can create tons of these " +
            "monoliths, with no hassle at all!"
        );
        provider.add(
            "book.pastel.guidebook.molten_rod.page0.text",
            "Orange, representing warmth, can be used to do the most interesting things.\\\n\\\nUnlike a normal []" +
            "(item://minecraft:fishing_rod), this one is a lot more sturdy and can fish where a normal rod fails."
        );
        provider.add(
            "book.pastel.guidebook.molten_rod.page1.text",
            "*Caution, hot!*\\\nThe flaming fishing hook can burn more than just my fingers..."
        );
        provider.add("book.pastel.guidebook.moonstone_cores.name", "Moonstone Cores");
        provider.add(
            "book.pastel.guidebook.moonstone_cores.page0.text",
            "This powerhouse of an item is capable of channeling huge amounts of [Ink](entry://ink/ink) with ease. " +
            "Can be used to enhance the capabilities of equipment and devices.\\\n\\\n*A relic of times long past*."
        );
        provider.add(
            "book.pastel.guidebook.aether_vestiges.page0.text",
            "Words leave me every time I look at this. I wish I could write more but...\\\n\\\nEvery time I look at " +
            "this I loose track of time and space; my head pounds as if my brain were a trapped rat, trying to " +
            "escape from certain doom. An overwhelming sense of dread creeps up from my heart and up my throat, it " +
            "strangles and chokes me until I tear up."
        );
        provider.add("book.pastel.guidebook.aether_vestiges.page1.title", "Remnants");
        provider.add(
            "book.pastel.guidebook.aether_vestiges.page1.text",
            "*These are but the barest dregs of something greater, something beyond time and thought.\\\n\\\nIt is " +
            "beyond mortal mind and yet I cannot help but dream of what it could be.*"
        );
        provider.add("book.pastel.guidebook.moonstone_geodes.name", "Moonstone Geodes");
        provider.add("book.pastel.guidebook.moonstone_geodes.page0.text", "*Purity*");
        provider.add(
            "book.pastel.guidebook.moonstone_geodes.page1.text",
            "Bright white shone towards me, almost dazzling down there. I knew right away where I was. Did fate bring" +
            " me here? It can hardly be coincidence, can it?\\\n\\\n[Moonstone](entry://general/moonstone_shards), " +
            "the last piece of my [big puzzle](entry://general/color_mixing_white)."
        );
        provider.add("book.pastel.guidebook.moonstone_shards.name", "Moonstone Shards");
        provider.add(
            "book.pastel.guidebook.moonstone_shards.page0.text",
            "I was quite simple-minded not so long ago, wasn't I? Thought I knew everything, but that everything was " +
            "always merely half the truth.\\\n\\\nI know better now. This white, pure gem in my hand, shimmering " +
            "with a soft, warm glow, is a monument to my personal growth."
        );
        provider.add(
            "book.pastel.guidebook.moonstone_shards.page1.text",
            "I have never been remotely omnipotent, never will be. Not with all the magic in the world. Nobody is. " +
            "But with a little humility, care and support, I can at least get a little closer.\\\n\\\n**[#](b9bebe)" +
            "Purity.**"
        );
        provider.add("book.pastel.guidebook.moving_budding_blocks", "Moving Budding Blocks");
        provider.add(
            "book.pastel.guidebook.humus.page0.text",
            "It is... something. I wanted to create a cool thing, failed and now ended up with this. Last but not " +
            "least I even forgot what I wanted to do originally, damn.\\\nNot particularly pretty or useful in " +
            "itself, what *is* useful is the collision with other liquids, such as [#](bb00bb)Water[#]() or [#]" +
            "(bb00bb)Lava[#](), creating [](item://minecraft:dirt) or [](item://minecraft:mud), respectively."
        );
        provider.add(
            "book.pastel.guidebook.humus.page1.text",
            "*While a humus bath sounds like wellness, it is not advised. Believe me, I tried.*"
        );
        provider.add(
            "book.pastel.guidebook.humus.page2.text",
            "Some items that come into contact with Humus will tan.\\\nFor example, [](item://minecraft:rotten_flesh)" +
            " will turn into [hide](item://minecraft:rabbit_hide)."
        );
        provider.add(
            "book.pastel.guidebook.humus.page3.text",
            "Others will instead cure.\\\n[](item://minecraft:wheat) just needs a bit of TLC to become []" +
            "(item://minecraft:string)."
        );
        provider.add(
            "book.pastel.guidebook.humus.page4.text",
            "I accidentally dropped a [Four Leaf Clover](entry://general/clover) into Humus.\\\nI tried to find it to" +
            " no avail, but in a stroke of luck I did spot a [verdant piece of shell!](item://minecraft:turtle_scute)"
        );
        provider.add(
            "book.pastel.guidebook.multitool.page0.text",
            "Whenever I leave my home, I carry half a tool shed with me. Considering the tons of stone I can carry " +
            "around with me, that's almost negligible. Nevertheless, a universal tool that combines the abilities of" +
            " a Pickaxe, Axe, Shovel and Hoe would suit me well."
        );
        provider.add(
            "book.pastel.guidebook.multitool.page1.text",
            "Not as efficient for individual tasks, but much better than having to change tools every three seconds."
        );
        provider.add(
            "book.pastel.guidebook.myceylon.page0.text",
            "Using an [#](bb00bb)Axe[#]() or [Multitool](entry://equipment/tools_and_armor/multitool) I was able to " +
            "peel small, but unexpectedly sturdy pieces of bark off a [Noxshroom]" +
            "(entry://dimension/noxshroom_forest). Both unexpectedly sturdy for a mushroom and... tasty" +
            ".\\\n\\\nThis Myceylon, as I called it, definitely adds a great flavor to baked goods and drinks."
        );
        provider.add("book.pastel.guidebook.mysterious_locket.name", "A Mysterious Locket");
        provider.add(
            "book.pastel.guidebook.mysterious_locket.page0.text",
            "I found this mysterious Locket in a Preservation Chest. It is locked tightly.\\\n\\\nIt has a strange " +
            "ornament that resembles a notch, softly glowing a pale white color, a shimmer reminiscent of the moon."
        );
        provider.add(
            "book.pastel.guidebook.mysterious_locket.page1.text",
            "There seems to be something inside. It also has an engraving on its back, but if it resembles a language" +
            " it's not one I've ever seen.\\\n\\\nWhat is it for?\\\nWho did it belong to?\\\nWhy was it " +
            "there?\\\n\\\nSo many questions."
        );
        provider.add(
            "book.pastel.guidebook.mysterious_locket.page2.text",
            "I noticed that the notch seems to fit perfectly with a [Moonstone Core]" +
            "(entry://dimension/moonstone_cores)."
        );
        provider.add("book.pastel.guidebook.mysterious_locket.page2.title", "Socketing a Core");
        provider.add(
            "book.pastel.guidebook.mysterious_locket.page3.text",
            "The locket contained a small crystal, bearing a dim, yet warm glow.\\\n\\\nWhile [below the Bedrock]" +
            "(entry://dimension/delving_deeper_down), it vibrates softly as I turn."
        );
        provider.add(
            "book.pastel.guidebook.natures_staff.page0.text",
            "Using the essence of [#](98ff37)Fertility[#](), I have come up with this stroke of genius.\\\nBone meal " +
            "is a joke in comparison - this staff works on a lot of blocks where [#](bb00bb)Bone meal[#]() failed me" +
            ".\\\n\\\nUsing it will also tempt all kinds of animals."
        );
        provider.add("book.pastel.guidebook.natures_staff.page1.text", "*Point at something you want to see blossom*");
        provider.add(
            "book.pastel.guidebook.natures_staff.page2.text",
            "Decreases the chance of [Vegetal](entry://general/vegetal) getting consumed."
        );
        provider.add("book.pastel.guidebook.neat_ring.page0.text", "*I just think it's neat.*");
        provider.add("book.pastel.guidebook.nectardew_burgeon.name", "Nectardew Burgeons");
        provider.add(
            "book.pastel.guidebook.nectardew_burgeon.page0.text",
            "It is natural enough that Nightdew can flower. I did not, however, expect its flower to be... like " +
            "*this*. The soothing essence of the plant's sprigs has blossomed into a bouquet of sleep magic, deep " +
            "alike a sea of which I may well be diving too deep. \\\n\\\n*...oh, that isn't a friend...*"
        );
        provider.add(
            "book.pastel.guidebook.nectardew_burgeon.page1.text",
            "The rarity of these burgeons has proved to be a problem. There is a solution to that though. The plants " +
            "are a lot more eager to bloom when sleeping creatures are near...\\\nThis is wrong right? Not the sleep" +
            " but... something like this *cannot* come by on its own. The roots of this magic run too deep, unto " +
            "things hidden beneath the water's surface."
        );
        provider.add("book.pastel.guidebook.nectardew_burgeon.page1.title", "Addendum - Fruits of Slumber");
        provider.add(
            "book.pastel.guidebook.neolith.page0.text",
            "The Obsidian was literally pulverized. Now that's power!\\\n\\\nThe result was this sturdy reagent" +
            ".\\\n\\\nVery powerful.\\\nGreat success.\\\nBut I am not at my limit yet."
        );
        provider.add("book.pastel.guidebook.nephrite.name", "Nephrite Blossoms");
        provider.add(
            "book.pastel.guidebook.nephrite.page0.text",
            "Little trees, as big as they get down here. Actually more like a big bush... or giant shrub" +
            ".\\\n\\\n*Eeeeh, details.*"
        );
        provider.add(
            "book.pastel.guidebook.nephrite.page1.text",
            "Their fruit isn't made of glass, but it shimmers very much as if it were. They are very tasty " +
            "too!\\\nEating one may give me a short burst of [Toughness](entry://brewing/effects/toughness)" +
            ".\\\n\\\nThey can also be [fermented](entry://cuisine/infused_beverages) and [used to brew potions]" +
            "(entry://brewing/potion_workshop_brewing)."
        );
        provider.add(
            "book.pastel.guidebook.night_salts.page0.text",
            "As much as I would like to work day and night, sleep is ultimately a necessity, and one I have done a " +
            "poor job of managing. The long nights that accompany discovery and exploration can be really hard on " +
            "the mind.\\\n\\\n\\\n*Phantoms make sure that it is also rough on the body, too.*"
        );
        provider.add(
            "book.pastel.guidebook.night_salts.page1.text",
            "These vials should solve all my problems. One good whiff of the salts inside should knock me out in 10 " +
            "seconds flat.\\\n\\\n*Does this smell like chloroform to you?~*"
        );
        provider.add("book.pastel.guidebook.night_salts.page1.title", "Titration Synthesis");
        provider.add(
            "book.pastel.guidebook.nightdew.page0.text",
            "Well then, I guess all things do come around eventually. The mother of all nightdew reveals itself to " +
            "me, hidden just beneath the bedrock - a fan-leafed vine with silvery wood and a tea-like fragrance.." +
            ".\\\n\\\n*...wait, where are its flowers?*"
        );
        provider.add(
            "book.pastel.guidebook.nightdew.page1.text",
            "*Every time I get near these I just feel like laying down and taking a long nap.\\\nEvery time I do so, " +
            "I have strange dreams of barren waters.\\\n\\\n...I swear buds appear on the vine when I do so, but " +
            "they always vanish.*"
        );
        provider.add("book.pastel.guidebook.nightdew.page1.title", "Dream Vine");
        provider.add("book.pastel.guidebook.nightdew_sprout.name", "Nightdew Sprouts");
        provider.add(
            "book.pastel.guidebook.nightdew_sprout.page0.text",
            "A curious little sprig reminiscent of tea leaves! Its extracts are pleasantly sweet and ripe with " +
            "calming qualities. Only thing is that I just can't seem to figure out where to plant it on.\\\n\\\n*~ A" +
            " fragrant little friend ~*"
        );
        provider.add(
            "book.pastel.guidebook.nightdew_sprout.page1.text",
            "Ahhh. After a lot of careful observation, the way to cultivate these has finally revealed itself to me. " +
            "These vines are picky, and will only grow on certain natural blocks endemic to the deep."
        );
        provider.add("book.pastel.guidebook.nightdew_sprout.page1.title", "Addendum - Cultivation");
        provider.add(
            "book.pastel.guidebook.nightfalls_blade.page0.text",
            "This small blade is too fine to inflict serious wounds, but has many sharp thorns that will bore into my" +
            " opponent's flesh.\\\n\\\nWhen infused in the [Potion Workshop](entry://brewing/potion_workshop), a " +
            "struck opponent will be afflicted with the effect - provided I have enough [Ink](entry://ink/ink) on me."
        );
        provider.add("book.pastel.guidebook.nightfalls_blade.page1.text", "*Cruel, really. But effective.*");
        provider.add(
            "book.pastel.guidebook.no_milk_pls",
            "Note to self:\\\n*Don't even think about drinking tea with [milk](item://minecraft:milk_bucket)*"
        );
        provider.add(
            "book.pastel.guidebook.noxshroom_forest.page0.text",
            "A strange mixture of tree and fungus towers over this biome."
        );
        provider.add(
            "book.pastel.guidebook.noxshroom_forest.page1.text",
            "Blackslag, covered with a thin layer of a mycelial fungus."
        );
        provider.add("book.pastel.guidebook.noxwood.name", "Noxwood");
        provider.add(
            "book.pastel.guidebook.noxwood.page0.text",
            "A type of mushroom - or is it more a tree? - which can be found all over the [Noxshroom Forest]" +
            "(entry://dimension/noxshroom_forest). They come in a variety of colors.\\\n\\\nThe trunks are as firm " +
            "as wood, while the caps are almost soft and squishy. The bioluminescent gills give off a pleasant " +
            "glow, which makes them excellent light sources."
        );
        provider.add("book.pastel.guidebook.noxwood.page1.text", "So good, every bite makes me giddy with joy.");
        provider.add("book.pastel.guidebook.noxwood.page2.title", "So much room");
        provider.add("book.pastel.guidebook.noxwood.page3.title", "for activities");
        provider.add("book.pastel.guidebook.noxwood.page4.text", "Both stripped and non-stripped.");
        provider.add("book.pastel.guidebook.noxwood.page4.title", "Hyphae");
        provider.add("book.pastel.guidebook.noxwood.page5.text", "Lights up when powered by [#](bb00bb)Redstone[#]().");
        provider.add("book.pastel.guidebook.noxwood.page5.title", "Lamps");
        provider.add(
            "book.pastel.guidebook.noxwood.page6.text",
            "Sort of like [#](bb00bb)Barrels[#](), but with twice the storage space."
        );
        provider.add("book.pastel.guidebook.noxwood.page6.title", "Amphoras");
        provider.add("book.pastel.guidebook.noxwood.page8.title", "Beams");
        provider.add(
            "book.pastel.guidebook.noxwood.page7.text",
            "Can be placed standing or hanging. If I [#](449900)Sneak[#]() I will place an alternate variant."
        );
        provider.add("book.pastel.guidebook.noxwood.page7.title", "Lanterns");
        provider.add(
            "book.pastel.guidebook.omni_accelerator.page0.text",
            "When I came up with the name for this toy, I really meant it.\\\n\\\nThe Omni-Accelerator is loaded with" +
            " items or blocks and can shoot them from a distance - all it needed was a powerful energy source in the" +
            " form of a [Moonstone Core](entry://dimension/moonstone_cores).\\\nBlocks are placed and the poor " +
            "thing hit by flying items receives its effects."
        );
        provider.add(
            "book.pastel.guidebook.omni_accelerator.page1.text",
            "Sharp Dripstone is not the only thing I found useful as a projectile. There are some... *fun*... things " +
            "I can do with the right ammo."
        );
        provider.add("book.pastel.guidebook.only_works_when_owner_online", "Only works while its owner is online.");
        provider.add("book.pastel.guidebook.onyx_shards.name", "Creating Onyx Shards");
        provider.add(
            "book.pastel.guidebook.onyx_shards.page0.text",
            "For Brown Pigment I need to darken Orange.\\\n**DARK!**\\\n\\\nIt's so logical now that I think about " +
            "it! The three gems I found correspond to the three basic colors of color theory!\\\nBy mixing all " +
            "three, I can create a shard that is so dark it looks almost unreal."
        );
        provider.add(
            "book.pastel.guidebook.onyx_shards.page1.text",
            "I will have to create the 'blackest of blacks' in the [Fusion Shrine](entry://general/fusion_shrine) in " +
            "a way that absolutely no unregulated light can contaminate the crystal. *So midnight on a new moon it " +
            "is*!\\\n\\\nBest to bring a [](item://minecraft:clock) with me."
        );
        provider.add(
            "book.pastel.guidebook.onyx_shards.page2.text",
            "Depending on the position of the sun and moon, the moon reflects more or less light."
        );
        provider.add("book.pastel.guidebook.onyx_shards.page2.title", "Moon Phases");
        provider.add(
            "book.pastel.guidebook.onyx_shards.page3.text",
            "These are known as [#](449900)Moon Phases[#]().\\\n\\\nWhen the moon is at its brightest, it is called a" +
            " [#](449900)Full Moon[#](). When at its darkest it is called a [#](449900)New Moon[#]().\\\n\\\nAn " +
            "entire lunar phase cycle from one new moon to the next is also called a [#](449900)lunation[#]()."
        );
        provider.add("book.pastel.guidebook.overchanting.name", "Overchanting");
        provider.add(
            "book.pastel.guidebook.overchanting.page0.text",
            "My experience with both magic and the [Enchanter](entry://enchanting/enchanter) has led me to yet " +
            "another new discovery:\\\n[#](449900)Overchanting[#]().\\\n\\\nPacking so much magical energy into a " +
            "single [#](bb00bb)Enchanted Book[#]() will be expensive. *Very expensive*."
        );
        provider.add(
            "book.pastel.guidebook.overchanting.page1.text",
            "- Clovers' Favor: 3 → 6\n- Disarming: 2 → 4\n- Exuberance: 5 → 10\n- First Strike: 2 → 5\n- Improved " +
            "Critical: 2 → 4\n- Inertia: 2 → 5\n- Tight Grip: 2 → 4\n- Treasure Hunter: 3 → 5\n- Sniping: 2 → 4"
        );
        provider.add("book.pastel.guidebook.overchanting.page1.title", "Pastel Enchantments");
        provider.add(
            "book.pastel.guidebook.overchanting.page2.text",
            "- Bane of Arthrop.: 5 → 8\n- Blast Protection: 4 → 8\n- Depth Strider: 3 → 3\n- Efficiency: 5 → 8\n- " +
            "Feather Falling: 4 → 6\n- Fire Aspect: 2 → 4\n- Fire Protection: 4 → 8\n- Fortune: 3 → 5\n- Frost " +
            "Walker: 2 → 4\n- Impaling: 5 → 8\n- Knockback: 2 → 5\n- Looting: 3 → 6\n- Loyalty: 3 → 4"
        );
        provider.add(
            "book.pastel.guidebook.overchanting.page3.text",
            "- Luck of the Sea: 3 → 5\n- Lure: 3 → 5\n- Piercing: 4 → 8\n- Power: 5 → 8\n- Proj. Protection: 4 → 8\n-" +
            " Protection: 4 → 8\n- Punch: 2 → 5\n- Quick Charge: 3 → 5\n- Respiration: 3 → 6\n- Riptide: 3 → 4\n- " +
            "Sharpness: 5 → 8\n- Smite: 5 → 8\n- Soul Speed: 3 → 4\n- Sweeping Edge: 3 → 7\n- Thorns: 3 → 6\n- " +
            "Unbreaking: 3 → 6"
        );
        provider.add(
            "book.pastel.guidebook.paintbrush.page0.text",
            "Why a *brush* of all things?\\\n\\\nGood question, I wondered that myself, after I came up with it. It " +
            "was mostly intuition, really. There is something about the colorful Pedestal and the bright colors of " +
            "the crystals that awakened something I now call my inner artist."
        );
        provider.add(
            "book.pastel.guidebook.paintbrush.page1.text",
            "Giving the [Pigment Pedestal](entry://general/pedestal) a good whack with it will make it start crafting."
        );
        provider.add("book.pastel.guidebook.paintbrush.page1.title", "Crafting Recipe");
        provider.add(
            "book.pastel.guidebook.paintbrush.page2.text",
            "What better use is there for [Pigment](entry://general/pigment) than to color with it?\\\n\\\nIf I [#]" +
            "(449900)crouch with my Paintbrush equipped I can bring up the color selection menu[#]().\\\n\\\nAfter " +
            "choosing a color all I have to do is slightly touch a colorable block I want to color and the " +
            "[Pigment](entry://general/pigment) will flow into it and change it to that new color."
        );
        provider.add("book.pastel.guidebook.paintbrush.page2.title", "Block Recoloring");
        provider.add(
            "book.pastel.guidebook.paintbrush.page3.text",
            "I can use my brush to bundle up Ink and sling it as a projectile.\\\n\\\nThe surface (or creature!) the " +
            "projectile hits will be painted as long as it can be recolored, plus dealing a good amount of knockback."
        );
        provider.add("book.pastel.guidebook.paintbrush.page3.title", "Paint Slinging");
        provider.add("book.pastel.guidebook.paltaeria.name", "Paltaeria");
        provider.add(
            "book.pastel.guidebook.paltaeria.page0.text",
            "The pale blue color is the hallmark of this ore, found exclusively in small clusters in the End" +
            ".\\\n\\\nLike the End itself, the curious properties of this material are not to be overlooked."
        );
        provider.add(
            "book.pastel.guidebook.paltaeria.page2.text",
            "From my previous experience with Paltaeria, I can already guess that it would not be a good idea to " +
            "place this block outdoors - my future self will thank me."
        );
        provider.add("book.pastel.guidebook.paltaeria.page3.text", "\\\n       *~ Fly far away ~*");
        provider.add(
            "book.pastel.guidebook.particle_spawner.page0.text",
            "The [Shooting Star](entry://general/stargazing) I saw left a beautiful shower of particles on its way. " +
            "Fascinated by this spectacle, I created the highly configurable Particle Spawner.[#]()\\\nA chimney? " +
            "Rocket launching particles? Atmospheric particle rain for my Pedestal? The Particle Spawner has it all" +
            ".\\\n*Maybe I can even be inspired by more particles as I progress!*"
        );
        provider.add(
            "book.pastel.guidebook.particle_spawner.page1.text",
            "I can use its interface to configure the particles to my liking and apply a [#](449900)redstone " +
            "signal[#]() to start the fantastic display."
        );
        provider.add("book.pastel.guidebook.pastel_network.name", "The Pastel Network");
        provider.add(
            "book.pastel.guidebook.pastel_network.page0.text",
            "[#](449900)Hoppers, Minecarts, Pipes[#](), and other such mundane methods of transport are nice, but " +
            "*lacking*. These Azurite-powered nodes - which I have named the [#](449900)Pastel Network[#]() - are a " +
            "more elegant and much superior solution to the challenges of logistics.\\\n\\\nDue to reasons, the " +
            "nodes are able to transfer items without line of sight. Another indicator of my natural genius!"
        );
        provider.add(
            "book.pastel.guidebook.pastel_network.page2.text",
            "While I may be terribly clever, my nodes sadly are not. In fact they are quite stupid, which is an issue" +
            " when the need for more flexible behaviour arises.\\\nLuckily, I can harness the fact that these " +
            "crystals have exactly 0 braincells. By writing an [#](449900)Item Tag[#]() on a strip of vellum, I can" +
            " trick the nodes into accepting anything within that tag!"
        );
        provider.add("book.pastel.guidebook.pastel_network.page2.title", "Tag Filtering");
        provider.add(
            "book.pastel.guidebook.pedestal.page0.text",
            "I got inspired by the [gem I found](entry://general/shards). Look at this beautiful thing! The design " +
            "goes great with every gem of choice.\\\n\\\nIt resembles a [](item://minecraft:crafting_table), so I " +
            "can craft normal recipes in it, but this enhanced design might also allow me to create entirely new " +
            "blocks never seen before!"
        );
        provider.add("book.pastel.guidebook.pedestal.topaz_pedestal.text", "Vivid cyan looks very noble.");
        provider.add(
            "book.pastel.guidebook.pedestal.amethyst_pedestal.text",
            "The magenta makes a beautiful contrast to the wood."
        );
        provider.add("book.pastel.guidebook.pedestal.citrine_pedestal.text", "Vibrant yellow looks so full of life.");
        provider.add("book.pastel.guidebook.pedestal.page2.title", "Crafting Requirements");
        provider.add(
            "book.pastel.guidebook.pedestal.page2.text",
            "I placed it down and it did... nothing much.\\\n\\\nBut I quickly figured out what I was missing: " +
            "[Gemstone Powder](entry://general/gemstone_powder) for some oomph as well, a trigger to make it start " +
            "crafting, like a [Paintbrush](entry://general/paintbrush) or a [#](449900)redstone signal[#]() and air" +
            " or an inventory above it."
        );
        provider.add("book.pastel.guidebook.pedestal.automation.title", "Pedestal Automation");
        provider.add(
            "book.pastel.guidebook.pedestal.automation.text",
            "I can automate the Pigment Pedestal using a [Crafting Tablet](entry://equipment/crafting_tablet)" +
            ".\\\nWhen I set a recipe in the tablet and put it into the designated slot of the Pedestal, it will put" +
            " items hoppered into it directly into the correct spots."
        );
        provider.add(
            "book.pastel.guidebook.pedestal_customisation.text",
            "I can exchange the basalt blocks with calcite and choose the gemstone blocks as I like it best" +
            ".\\\n\\\nBy mixing [#](bb00bb)Calcite[#]() and [#](bb00bb)Basalt[#]() I can give the structure my own " +
            "personal touch."
        );
        provider.add("book.pastel.guidebook.pedestal_customisation.title", "Individualize!");
        provider.add("book.pastel.guidebook.pedestal_upgrade_cmy.name", "Pedestal CMY Upgrade");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_cmy.page0.text",
            "I now have three gems. *And an idea!* I could upgrade my [Pedestal](entry://general/pedestal) with all " +
            "three types I found! This will make it both prettier and more versatile."
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_cmy.page0.title", "CMY Variant");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_cmy.page1.text",
            "In order to use the advanced abilities of the enhanced [Pigment Pedestal](entry://general/pedestal) I " +
            "will need a structure to focus energy into it.\\\n\\\nI call it the **pastel Focus**."
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_cmy.page1.title", "Pedestal Structure");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_cmy.page2.text",
            "Dimensions: 11x11x4 blocks. But best to leave a few extra blocks of space around, just in case."
        );
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_cmy.page3.text",
            "- 1 Pigment Pedestal\n- 4 Polished Gemstone Blocks\n- 4 Chiseled Polished Blocks\n- 4 Notched Polished " +
            "Blocks\n- 8 Polished Pillars\n- 68 Polished Blocks"
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_moonstone.dimensions", "Dimensions: 13x13x7 blocks");
        provider.add("book.pastel.guidebook.pedestal_upgrade_moonstone.name", "Moonstone Pedestal");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_moonstone.page0.text",
            "I can upgrade my [Pigment Pedestal](entry://general/pedestal) by using a [Moonstone Shard]" +
            "(entry://general/shards@moonstone)."
        );
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_moonstone.page2.text",
            "- 1 Pigment Pedestal\n- 4 Onyx Chiseled Blocks\n- 4 Notched Polished Blocks\n- 8 Gemstone Lights\n- 4 " +
            "Gemstone Chiseled Blocks\n- 12 Polished Gemstone Blocks\n- 16 CMYK Chiseled Blocks\n- 36 Polished " +
            "Pillars\n- 52 Polished Crests\n- 172 Polished Blocks"
        );
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_moonstone.page3.text",
            "- 4 Onyx Chiseled Blocks\n- 4 Polished Gemstone Blocks\n- 36 Polished Crests\n- 12 Polished Blocks"
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_moonstone_2.name", "Moonstone Pedestal (2)");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_moonstone_2.page0.text",
            "My latest structure feels... lacking. And now I know exactly why: more [#](b9bebe)Moonstone[#]()! The " +
            "tricky part: for me being able to create [#](bb00bb)Moonstone Chiseled Blocks[#]() would require me to " +
            "use the full capabilities of my [#](bb00bb)Moonstone Pedestal[#]() already, but without the finished " +
            "structure I can't use Moonstone Powder yet.\\\n*Could there be a way around this? A kickstart, if you" +
            " will?*"
        );
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_moonstone_2.page2.text",
            "- 1 Pigment Pedestal\n- 4 Onyx Chiseled Blocks\n- 4 Notched Polished Blocks\n- 8 Gemstone Lights\n- 4 " +
            "Gemstone Chiseled Blocks\n- 12 Polished Gemstone Blocks\n- 16 CMY Gemstone Chiseled Bl.\n- 28 Moonstone" +
            " Chiseled Bl.\n- 36 Polished Pillars\n- 52 Polished Crests\n- 144 Polished Blocks"
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_moonstone_2.page3.text", "- 28 Moonstone Chiseled Bl.");
        provider.add("book.pastel.guidebook.pedestal_upgrade_onyx.name", "Pedestal Onyx Upgrade");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_onyx.page0.text",
            "I can upgrade my [Pigment Pedestal](entry://general/pedestal) by using an [Onyx Shard]" +
            "(entry://general/shards@onyx) to further increase its magical power."
        );
        provider.add("book.pastel.guidebook.pedestal_upgrade_onyx.page0.title", "Onyx Variant");
        provider.add("book.pastel.guidebook.pedestal_upgrade_onyx.page1.text", "Dimensions: 13x13x6 blocks");
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_onyx.page2.text",
            "- 1 Pigment Pedestal\n- 8 Polished Gemstone Blocks\n- 8 Gemstone Lights\n- 4 Chiseled Polished Blocks\n-" +
            " 16 Gemstone Chiseled Blocks\n- 16 Polished Crests\n- 4 Notched Polished Blocks\n- 36 Polished " +
            "Pillars\n- 160 Polished Blocks"
        );
        provider.add(
            "book.pastel.guidebook.pedestal_upgrade_onyx.page3.text",
            "- 4 Polished Gemstone Blocks\n- 8 Gemstone Lights\n- 16 Gemstone Chiseled Blocks\n- 16 Polished " +
            "Crests\n- 28 Polished Pillars\n- 92 Polished Blocks"
        );
        provider.add("book.pastel.guidebook.perturbed_eye.name", "End Portal Relocation");
        provider.add(
            "book.pastel.guidebook.perturbed_eye.page0.text",
            "Every time I want to enter the realm of the Endermen, I have to travel half a world. Whoever created the" +
            " portals to the End... I'm so much more knowledgeable than they are now.\\\n\\\nWell, almost.\\\nI " +
            "still haven't figured out how to create such portals myself, but packing them up and taking them home?" +
            " *No problem.*"
        );
        provider.add("book.pastel.guidebook.perturbed_eye.page1.text", "The End Portal, like found in Strongholds");
        provider.add(
            "book.pastel.guidebook.perturbed_eye.page2.text",
            "Due to the extremely sturdy portal frames, these have to be quite destructive. Best to keep a bit of " +
            "distance after socketing."
        );
        provider.add(
            "book.pastel.guidebook.perturbed_eye.page3.text",
            "All I have to do is put the portal back together the way it was, re-add Eyes of Ender, and done!"
        );
        provider.add(
            "book.pastel.guidebook.pest_control.page0.text",
            "On my way to the End I came across a huge underground structure that looked like the fortress of a " +
            "civilisation that lived far before me.\\\n\\\nAlthough they seemed to have technology that allowed them" +
            " to open a portal to another world, they definitely should have done something about their vermin " +
            "problem."
        );
        provider.add(
            "book.pastel.guidebook.pest_control.page1.text",
            "Gets rid of Silverfish when breaking [#](bb00bb)Infested Blocks[#](), dropping double XP.\\\n\\\nMax " +
            "Level: 1\\\nApplicable to mining tools.\\\nMutually exclusive with Resonance."
        );
        provider.add(
            "book.pastel.guidebook.phantom_frame.page0.text",
            "I wanted to display my most precious possessions on my walls and so far, I've always used item frames to" +
            " do this.\\\n\\\nBut some of my exhibitions looked better if you don't see the frame, so here we are!"
        );
        provider.add("book.pastel.guidebook.phantom_frame.page0.title", "Phantom Frames");
        provider.add(
            "book.pastel.guidebook.phantom_frame.page1.text",
            "A Phantom Frame becomes invisible as soon as an item is in it."
        );
        provider.add(
            "book.pastel.guidebook.phantom_frame.page2.text",
            "This one has another nice touch: the item it holds is bathed in bright light, making it look even more " +
            "impressive."
        );
        provider.add("book.pastel.guidebook.pigment.name", "Pigments");
        provider.add("book.pastel.guidebook.pigment.description", "My Color Theory checklist");
        provider.add(
            "book.pastel.guidebook.pigment.page0.text",
            "Finally! I was able to obtain absolutely pure Pigment! I harvested it from the leaves of a [Colored " +
            "Tree](entry://general/colored_trees), today.\\\nAnd by using a hoe the harvest is pretty fast, too" +
            ".\\\nThese Pigments have a magical feel to them.\\\n\\\nI'm still not fully convinced that [all " +
            "colors](entry://general/color_mixing_cmy) even exist in this form. How many can I find?"
        );
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry0", "[#](302951)Black");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry1", "[#](2432ff)Blue");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry10", "[#](f97b2d)Orange");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry11", "[#](ff9fc6)Pink");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry12", "[#](802bc4)Purple");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry13", "[#](f12a34)Red");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry14", "[#](b9bebe)White");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry15", "[#](eded00)Yellow");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry2", "[#](70400d)Brown");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry3", "[#](5bffed)Cyan");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry4", "[#](464646)Gray");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry5", "[#](526b0f)Green");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry6", "[#](7a9eff)Light Blue");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry7", "[#](adadad)Light Gray");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry8", "[#](98ff37)Lime");
        provider.add("book.pastel.guidebook.pigment.page1.checklist.entry9", "[#](ff4ff6)Magenta");
        provider.add("book.pastel.guidebook.pigment.page1.text", "A hypothetical list.");
        provider.add(
            "book.pastel.guidebook.pigment.page10.text",
            "This juicy lime almost smells like a warm spring morning. Or is it just my imagination?\\\n\\\n[#]" +
            "(98ff37)Lime[#]() represents *Happiness* and *Fertility*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page11.text",
            "Soft magenta always puts me in a calm and contented, almost serene mood.\\\n\\\n[#](ff4ff6)Magenta[#]() " +
            "represents *Time*, *Kindness* and *Tolerance*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page12.text",
            "This orange color reminds me of autumn. Makes me feel a bit like sitting in a comfy armchair in front of" +
            " a fireplace.\\\n\\\n[#](f97b2d)Orange[#]() represents *Warmth* and *Comfort*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page13.text",
            "This bright, vibrant cotton candy pink makes me beam with joy.\\\n\\\n[#](ff9fc6)Pink[#]() represents " +
            "*Health* and *Admiration*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page14.text",
            "This sight gets my mind going. It not only stimulates my thirst for knowledge, but also sparks creative " +
            "ideas.\\\n\\\n[#](802bc4)Purple[#]() represents *Wisdom* and *Creativity*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page15.text",
            "I feel the urge and desire to create something beautiful.\\\n\\\n[#](f12a34)Red[#]() represents " +
            "*Passion* and *Willpower*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page16.text",
            "I cannot put it into words exactly. Staggering, overwhelming, but in a good way. There is something " +
            "unspeakably wonderful about this Pigment.\\\n\\\n[#](b9bebe)White[#]() represents *LIFE*, *Light* and " +
            "*Purity*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page17.text",
            "The vibrant yellow is almost bursting with energy.\\\n\\\n[#](eded00)Yellow[#]() represents *Energy* and" +
            " *Joy*."
        );
        provider.add("book.pastel.guidebook.pigment.page18.text", "I can always craft them back into Pigment.");
        provider.add("book.pastel.guidebook.pigment.page18.title", "Pigment Blocks");
        provider.add(
            "book.pastel.guidebook.pigment.page2.text",
            "The darkest material I have ever held in my hands. It looks almost surreal.\\\n\\\n[#](302951)Black[#]()" +
            " represents the nothingness of the *Void*, *Power* and *Mystery*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page3.text",
            "Holding it in my hand gives me a sense of security. All nonsense of course, after all, it is only a " +
            "color. But still...\\\n\\\n[#](2432ff)Blue[#]() represents *Safety* and *Permanence*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page4.text",
            "This rich brown makes me long for mother nature.\\\n\\\n[#](70400d)Brown[#]() represents *Nature* and " +
            "*Stability*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page5.text",
            "Makes me feel like I am sitting on the top of a mountain, taking in the infinite vastness of this world" +
            ".\\\n\\\n[#](5bffed)Cyan[#]() represents *Matter* and *Integrity*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page6.text",
            "This color looks to me like the defeated older brother of light gray. Looking at it makes me a little " +
            "sad, but I am not sure why exactly.\\\n\\\n[#](464646)Gray[#]() represents *Evanescence*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page7.text",
            "This Pigment gently radiates inner peace.\\\n\\\n[#](526b0f)Green[#]() represents *Balance* and *Harmony*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page8.text",
            "I feel a sense of optimism, but also of departure.\\\n\\\n[#](7a9eff)Light Blue[#]() represents *Luck* " +
            "and *Peace*."
        );
        provider.add(
            "book.pastel.guidebook.pigment.page9.text",
            "Do you know the feeling of sitting serenely, looking at the landscape, feeling life pass you by, and yet" +
            " everything is okay?\\\n\\\n[#](adadad)Light Gray[#]() represents *Change*, but also *Quiet*."
        );
        provider.add(
            "book.pastel.guidebook.pigment_palette.page0.text",
            "Carrying enough [Ink](entry://ink/ink) to maintain my magical equipment has become both a chore and a " +
            "space hog in my inventory.\\\nIt's time for a new creation: the Pigment Palette.\\\n\\\n*Thematically " +
            "fitting, isn't it? Now I feel like a real Artist.*"
        );
        provider.add(
            "book.pastel.guidebook.pigment_palette.page1.text",
            "Capable of storing sizable amounts of [Ink](entry://ink/ink), perfect for powering all my magical " +
            "equipment. Unable to power machines, though."
        );
        provider.add(
            "book.pastel.guidebook.pipe_bomb.page0.text",
            "[Moonstone Cores](entry://dimension/moonstone_cores) burst with energy. It sounds like a very bad idea " +
            "to discharge one in milliseconds.\\\n\\\n*...but sometimes the worst ideas are the best, aren't " +
            "they?*\\\n\\\nTheir explosion does not damage blocks, but causes [enormously aggressive fire]" +
            "(entry://dimension/primordial_fire)."
        );
        provider.add("book.pastel.guidebook.pipe_bomb.page1.text", "*They make for great gifts!*");
        provider.add(
            "book.pastel.guidebook.player_detector.page0.text",
            "I know people who build gigantic constructions out of [#](bb00bb)Redstone[#]() just to open an oversized" +
            " door. And then they trigger it with an unsightly [#](bb00bb)Pressure Plate[#]().\\\nThe Player " +
            "Detector, on the other hand, is able to sense my presence - or that of other players - from a distance" +
            " and sends out an appropriate [#](449900)redstone signal[#]().\\\n\\\n*Much prettier*."
        );
        provider.add(
            "book.pastel.guidebook.player_detector.page1.text",
            "Radius of 10 blocks.\\\nEmits a full strength signal, if the player who placed it is detected, otherwise" +
            " 8."
        );
        provider.add("book.pastel.guidebook.polishing", "Polishing");
        provider.add("book.pastel.guidebook.potion_reagent", "New Potion Reagent");
        provider.add(
            "book.pastel.guidebook.potion_workshop.page0.text",
            "The Potion Workshop is so much more than a [#](bb00bb)Brewing Stand[#](): my biggest change was to use " +
            "the liquid I found in [Mermaid's Gems](entry://general/mermaids_brush) instead of [#](bb00bb)Blaze " +
            "Powder[#](), which enabled me to [use magic items as additional reagents]" +
            "(entry://brewing/potion_workshop_reagents).\\\n\\\nAnother great side effect is that I do not have to" +
            " fill the bottles with water beforehand."
        );
        provider.add("book.pastel.guidebook.potion_workshop.page1.text", "");
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.low_yield",
            "*In spite of everything I've tried, this brew has a naturally low yield.*"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.low_potency_mod",
            "*This brew doesn't take well to potency reagents, and requires more than the usual amount to achieve the" +
            " same increase in strength.*"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.fillable_only",
            "*This brew is too concentrated to function as a potion or tipped arrow, and will only be useful for more" +
            " complex items that can be filled with a potion effect.*"
        );
        provider.add("book.pastel.guidebook.potion_workshop_brewing.name", "Brewing Potions");
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page0.text",
            "I was able to replicate all the potions I could do with the Brewing Stand and more! (though some of them" +
            " are easier or harder to get enhanced effects from)\\\n\\\nI can use [Reagents]" +
            "(entry://brewing/potion_workshop_reagents) to tinker with their effects."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page1.text",
            "I can make any vanilla potion using the same ingredients as I would in the [#](bb00bb)Brewing Stand[#]()."
        );
        provider.add("book.pastel.guidebook.potion_workshop_brewing.page1.title", "Previously Known Potions");
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page2.strong.text",
            "Using Milky Resin yields a stronger blend at the cost of duration."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page4.text",
            "Adding a Fermented Spider Eye will change the effect to **Mining Fatigue** instead."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page5.text",
            "Adding a Fermented Spider Eye will change the effect to **Hunger** instead."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page7.text",
            "Adding a Fermented Spider Eye will change the effect to **Bad Luck** instead."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_brewing.page19.text",
            "*Taken from the notes in the [Poisoner's Handbook](entry://dimension/poisoners_handbook).\\\n\\\nThis " +
            "brew also has a naturally low yield.*"
        );
        provider.add("book.pastel.guidebook.potion_workshop_crafting", "Workshop Crafting");
        provider.add(
            "book.pastel.guidebook.potion_workshop_crafting.page0.text",
            "As the name implies, I designed the [Potion Workshop](entry://brewing/potion_workshop) around the " +
            "creation of powerful potions.\\\nBut with the help of all of the filigree and granular adjustable " +
            "switches and valves I found great utility in it for creating other things with it, as well!\\\n\\\nAll" +
            " of those recipes do not require [Reagents](entry://brewing/potion_workshop_reagents)."
        );
        provider.add("book.pastel.guidebook.potion_workshop_crafting.page1.title", "Water");
        provider.add(
            "book.pastel.guidebook.potion_workshop_crafting.page10.text",
            "Will consume 100 XP from the [#](bb00bb)Knowledge Gem[#]()."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_crafting.page2.text",
            "The [Lava Sponge](entry://magical_blocks/lava_sponge) will not be consumed."
        );
        provider.add("book.pastel.guidebook.potion_workshop_crafting.page2.title", "Lava");
        provider.add("book.pastel.guidebook.potion_workshop_crafting.page7.title", "Liquefying Honey");
        provider.add("book.pastel.guidebook.potion_workshop_crafting.page8.title", "Powdering Snow");
        provider.add(
            "book.pastel.guidebook.potion_workshop_crafting.page9.text",
            "Will consume 10 XP from the [#](bb00bb)Knowledge Gem[#]()."
        );
        provider.add("book.pastel.guidebook.potion_workshop_crafting.page9.title", "Bottles o' Enchanting");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.name", "Using Reagents");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.bitter_oils.text",
            "- makes effects (near) incurable\n- -4 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.nectardew_burgeon.text",
            "- +100%% potency\n- +100%% duration\n- -3 yield\n- infused the drink with soporific qualities"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.nightdew_sprout.text",
            "- +1 potency\n- +50%% duration\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.fissure_plum.text",
            "- +30s duration\n- 50%% chance for +1 potency\n- 50%% chance for +1 yield\n- Stat modifiers are inverted" +
            " for negative effects"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.echo_shard.text",
            "- +50%% chance to add the main effect of the potion that was brewed before"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.lapis_lazuli.text", "- 50%% chance to add +1 yield");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.ash_flakes.text", "- -120s duration for negative effects");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_redstone.text",
            "- +200%% duration\n- -50%% potency\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_glowstone.text",
            "- +2 potency\n- -50%% duration\n- -1 yield"
        );
        provider.add("book.pastel.guidebook.potion_workshop_reagents.pure_lapis.text", "- +1 yield");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_echo.text",
            "- always adds the main effect of the previously brewed potion"
        );
        provider.add("book.pastel.guidebook.potion_workshop_reagents.page0.name", "Reagents");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.page0.text",
            "Instead of adding ingredients to the potion bit by bit, as in the [#](bb00bb)Brewing Stand[#](), I " +
            "experimented with dissolving all the ingredients in the liquid contained in [Mermaid's Gems]" +
        "(entry://general/mermaids_brush) all at once and adding some of my magical collectibles as reagents" +
            ".\\\n**Breakthrough!**\\\n\\\nEach reagent will have an unique effect on the [#](bb00bb)Potion[#]()."
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.page1.text",
            "- the order in which I arrange the reagents will not matter\n- flat bonuses get applied first, " +
            "percentage-based bonuses modify that value afterwards\n- the same reagent cannot be stacked"
        );
        provider.add("book.pastel.guidebook.potion_workshop_reagents.page1.title", "Rules of Application");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.redstone.text", "- +100%% duration");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_redstone.text",
            "- +200%% duration\n- -50%% potency\n- -1 yield"
        );
        provider.add("book.pastel.guidebook.potion_workshop_reagents.glowstone_dust.text", "- +1 potency");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_glowstone.text",
            "- +2 potency\n- -50%% duration\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.lapis_lazuli.text", "- 50%% chance to add +1 yield");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.pure_lapis.text", "- +1 yield");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.gunpowder.text", "- creates Splash Potions");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.dragon_breath.text",
            "- creates Lingering Potions - also requires Gunpowder as a reagent\n- allows the creation of Tipped " +
            "Arrows, if I supply Arrows instead of Bottles"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.echo_shard.text",
            "- +50%% chance to add the main effect of the potion that was brewed before"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.pure_echo.text",
            "- always adds the main effect of the previously brewed potion"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.topaz_powder.text",
            "- makes effects not show any particles"
        );
        provider.add("book.pastel.guidebook.potion_workshop_reagents.amethyst_powder.text", "- +60s duration");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.citrine_powder.text", "- +25%% potency");
        provider.add("book.pastel.guidebook.potion_workshop_reagents.onyx_powder.text", "- +2 yield");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.moonstone_powder.text",
            "- converts negative effects to equivalent positive ones"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.shimmerstone_gem.text",
            "- +20%% potency\n- +20%% duration"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.quitoxic_powder.text", "- +1 potency for negative effects");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.stratine_fragments.text",
            "- +1 potency\n- +1 negative effect\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.paltaeria_fragments.text", "- +1 random positive effect");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.stardust.text",
            "- +50%% potency & +50%% duration to the main effect of the previous potion, if inherited"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.star_fragment.text",
            "- +50%% chance to add the main effect of the previously brewed potion\n- +100%% potency & -33%% duration" +
            " to the main effect of the previous potion, if inherited"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.storm_stone.text",
            "- dramatically increases potency at the beginning, but makes potency wear off over time quick - will not" +
            " work for instant effects"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.raw_azurite.text",
            "- negates the duration penalty for Lingering Potions as well as for Tipped Arrows"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.four_leaf_clover.text", "- large boost to a random stat");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.vegetal.text", "- +200%% duration\n- -25%% potency");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.neolith.text",
            "- adds a very weird taste and smell to the potion, making it unidentifiable. Also colors it completely " +
            "black"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.midnight_chip.text",
            "- +1 potency\n- +30s duration\n- -2 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.moonstruck_nectar.text",
            "- makes the potion much smoother, making it much quicker to drink"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.bedrock_dust.text",
            "- +50%% potency\n- -75%% duration\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.bismuth_flake.text",
            "- +1 potency for positive effects\n- colors the potion in a random color"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.raw_malachite.text",
            "- +100%% duration\n- -1 yield\n- makes the potion much slower to drink"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.raw_bloodstone.text",
            "- +100%% potency\n- -2 yield\n- makes the potion much slower to drink"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.prickly_bayleaf.text", "- -2 potency for negative effects");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.jadeite_petals.text",
            "- +120s duration for positive effects"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.fissure_plum.text",
            "- 50%% chance for +1 duration\n- 50%% chance for +1 potency\n- 50%% chance for +1 yield\n- Stat " +
            "modifiers are inverted for negative effects"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.bone_ash.text",
            "- +100%% potency and duration to the main effect of the previous potion, if inherited"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.ash_flakes.text", "- -120s duration for negative effects");
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.bitter_oils.text",
            "- makes effects very hard to cure\n- -4 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.nightdew_sprout.text",
            "- +1 potency\n- +50%% duration\n- -1 yield"
        );
        provider.add(
            "book.pastel.guidebook.potion_workshop_reagents.nectardew_burgeon.text",
            "- +100%% potency\n- +100%% duration\n- -3 yield\n- may infuse the potion with soporific qualities"
        );
        provider.add("book.pastel.guidebook.preenchanted_tools.name", "Pre-Enchanted Tools");
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page0.text",
            "That stupid obsidian table is being stubborn again when it comes to giving me the enchantments I am " +
            "looking for. *Yes, I am salty.*\\\n\\\nBesides that, my options are to slaughter a whole herd of cows " +
            "or rob the books of a dozen villages (no wonder the inhabitants there are so stupid and only too happy" +
            " to be eaten by Zombies)."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page1.text",
            "The advantage of knowing exactly what I want gives me the ability to shape the tools so that they " +
            "inherently have certain qualities. Color magic makes it possible.\\\n\\\nUnfortunately, these features " +
            "make most of these tools very fragile."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page2.text",
            "This pickaxe is studded with Topaz to cut even the most delicate material from stone.\\\nPre-enchanted " +
            "with **[#](5bffed)Silk Touch[#]()**."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page3.text",
            "Built with Citrine, it allows me to carve out every last bit of ore from every vein.\\\nPre-enchanted " +
            "with **[#](eded00)Fortune III[#]()**."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page4.text",
            "The short, razor-sharp gemstone blade makes it a deadly weapon.\\\nPre-enchanted with **[#](ff4ff6)" +
            "Looting III[#]()**."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page5.text",
            "An outlier in the group, the Oblivion Pickaxe has great durability and mining speed. However, all mined " +
            "blocks [are destroyed](entry://enchanting/enchantments/curse_of_the_void)."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page6.text",
            "[Allows me to keep blocks intact](entry://enchanting/enchantments/resonance) that would otherwise be " +
            "irreparably destroyed using gentle vibrations."
        );
        provider.add(
            "book.pastel.guidebook.preenchanted_tools.page7.text",
            "A real powerhouse of a Pickaxe for when I want to break hard blocks.\\\nComes pre-enchanted with [Razing" +
            " III](entry://enchanting/enchantments/razing)."
        );
        provider.add(
            "book.pastel.guidebook.present.page0.text",
            "The people around me have helped me through some tough situations. It's about time I give something back" +
            ". A dash of [Shimmerstone](entry://general/shimmerstone) causes the package to explode in a colorful " +
            "shower of particles.\\\n\\\nAfter I click the Present onto the items I want to gift, I have to wrap it" +
            " and then set it down so the recipient can open it and I can watch them jump for joy."
        );
        provider.add(
            "book.pastel.guidebook.present.page1.text",
            "*(Or, you know, I can always gift my future self!)*\\\n\\\nSome items have special behavior when " +
            "unwrapped."
        );
        provider.add(
            "book.pastel.guidebook.present.page2.text",
            "- Put filled Present in crafting grid to wrap\n- Optional: add [Pigment](entry://general/pigment) for a " +
            "colorful particle shower\n- Optional: add a special item to choose a wrapping paper (right)"
        );
        provider.add("book.pastel.guidebook.present.page2.title", "Wrapping & Customizing");
        provider.add(
            "book.pastel.guidebook.present.page3.text",
            "- Red Dye: Red\n- Blue Dye: Blue\n- Cyan Dye: Cyan\n- Green Dye: Green\n- Purple Dye: Purple\n- Cake: " +
            "Cake\n- Flower: Stripes\n- Firework Star: Starry\n- Snowball: Winter\n- Spore Blossom: Rainbow"
        );
        provider.add("book.pastel.guidebook.present.page3.title", "Wrapping Papers");
        provider.add("book.pastel.guidebook.preservation_ruins.name", "Preservation Ruins");
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page0.text",
            "Deep underground I found this outlandish structure, which seems to be made of immensely sturdy stone. " +
            "Whoever built it seems to have knowledge far beyond my understanding.\\\nThere must be a way to get in " +
            "there! If not now, then later... better keep the location in mind."
        );
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page1.text",
            "Until now, I thought I was alone in my creative endeavours. It seems I was wrong. So very, very wrong" +
            ".\\\nWhoever built these structures obviously followed a similar path to mine, but was miles ahead" +
            ".\\\nStill, anyways. I accept the challenge, of course. I have one huge advantage:\\\n*I am still " +
            "alive.*"
        );
        provider.add("book.pastel.guidebook.preservation_ruins.page1.title", "A Challenge?");
        provider.add("book.pastel.guidebook.preservation_ruins.page2.checklist.entry0", "Preservation Ruin #1");
        provider.add("book.pastel.guidebook.preservation_ruins.page2.checklist.entry1", "Preservation Ruin #2");
        provider.add("book.pastel.guidebook.preservation_ruins.page2.checklist.entry2", "Preservation Ruin #3");
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page2.text",
            "These structures seem to come in different variations. In each one I seem to encounter a different " +
            "challenge."
        );
        provider.add("book.pastel.guidebook.preservation_ruins.page2.title", "How many are there?");
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page3.text",
            "A powerful, magical force field. Wearing [Azure Dike equipment]" +
            "(entry://equipment/trinkets/azure_dike_equipment) allowed me to enter."
        );
        provider.add("book.pastel.guidebook.preservation_ruins.page3.title", "A Protected Entrance");
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page4.text",
            "It was all so clear in the end! I had it [all figured out already](entry://general/color_mixing_cmy)."
        );
        provider.add("book.pastel.guidebook.preservation_ruins.page4.title", "Color Combinations");
        provider.add(
            "book.pastel.guidebook.preservation_ruins.page5.text",
            "A really weird one. Having some colors on hand helped a lot."
        );
        provider.add("book.pastel.guidebook.preservation_turrets.name", "Preservation Turrets");
        provider.add(
            "book.pastel.guidebook.preservation_turrets.page0.text",
            "*True engineering excellence. But, boy, does that excellence hurt.*"
        );
        provider.add(
            "book.pastel.guidebook.preservation_turrets.page1.text",
            "High-tech machines, consisting of a reinforced shell of Basalt and Calcite, powered by an unknown source" +
            " of energy that pulsates gently in the heart of these contraptions.\\\n\\\nReady to poke holes in me as" +
            " soon as I make my presence known."
        );
        provider.add(
            "book.pastel.guidebook.primordial_fire.page0.text",
            "Much more aggressive than the usual [#](bb00bb)Fire[#]() ignited by [#](bb00bb)Flint & Steel[#](), the " +
            "[#](bb00bb)Primordial Fire[#]() unleashed by Doomblooms seems to burn with an insatiable, searing heat." +
            " Almost as if it consumes matter and soul alike. Terrifying."
        );
        provider.add(
            "book.pastel.guidebook.primordial_fire.page1.text",
            "Primordial Fire does not seem to draw its energy primarily from matter, but rather burns the soul."
        );
        provider.add(
            "book.pastel.guidebook.primordial_fire.primordial_torch.text", "*A purple light in the darkness.*");
        provider.add(
            "book.pastel.guidebook.projectile_rebound.page0.text",
            "Each level gave me a small chance of [#](449900)bouncing off incoming projectiles[#]()."
        );
        provider.add("book.pastel.guidebook.provider_node.name", "Provider Node");
        provider.add(
            "book.pastel.guidebook.provider_node.page0.text",
            "Make the items in the connected inventory available in their [Pastel Network]" +
        "(entry://pastel_network/pastel_network).\\\n\\\nItems are not pushed, but can be requested from [Gather" +
            " Nodes](entry://pastel_network/gather_node) and [Buffer Nodes](entry://pastel_network/buffer_node)."
        );
        provider.add(
            "book.pastel.guidebook.puff_circlet.page0.text",
            "This glistening hoop creates a protective film of air around me.\\\n\\\nGrants [#](495b24)4[#]() units " +
            "of [#](2c2e8e)Azure Dike[#](). Will protects me from projectiles and can cushion a long fall, using " +
            "some of those charges.\\\nThe Puff Circlet also prevents [#](bb00bb)Farmland[#]() from being trampled."
        );
        provider.add(
            "book.pastel.guidebook.puff_circlet.page1.text",
            "*Gone are the days of being sniped at from behind by Skeletons.*"
        );
        provider.add(
            "book.pastel.guidebook.pure_alcohol.page0.text",
            "My memory doesn't always work, it seems. Somehow I ended up with this bottle. Definitely got a *little* " +
            "stronger than planned..."
        );
        provider.add("book.pastel.guidebook.pure_resources.name", "Pure Resources");
        provider.add(
            "book.pastel.guidebook.pure_resources.page0.text",
            "Growing materials in the [Crystallarieum](entry://ink/crystallarieum) has yielded this: a much purer, " +
            "crystalline variant compared to [#](bb00bb)Raw Ore[#]().\\\n\\\nOn closer inspection they almost appear" +
            " to be surrounded by an almost invisible sheen, gently protecting them from the elements. This shroud " +
            "seems to be what protects [#](bb00bb)Pure Copper[#]() from oxidation."
        );
        provider.add(
            "book.pastel.guidebook.pure_resources.page1.text",
            "Ironically, I found that this same sheen also seems to make them withstand the heat of [Furnaces]" +
            "(item://minecraft:furnace). A [](item://minecraft:blast_furnace) did the job (poorly, but it did!)."
        );
        provider.add("book.pastel.guidebook.pure_resources.page1.title", "Blasting");
        provider.add(
            "book.pastel.guidebook.pure_resources.page2.text",
            "Smelting these in the [Cinderhearth](entry://ink/cinderhearth) will give me a much more decent output."
        );
        provider.add("book.pastel.guidebook.pure_resources.page2.title", "Cinderhearth Smelting");
        provider.add(
            "book.pastel.guidebook.pure_resources.page3.text",
            "Can be crafted back into the corresponding [#](bb00bb)Pure Resource[#]()."
        );
        provider.add("book.pastel.guidebook.pure_resources.page3.title", "Compacting");
        provider.add(
            "book.pastel.guidebook.pure_resources.page4.text",
            "It doesn't get much more efficient or risk-free than that."
        );
        provider.add("book.pastel.guidebook.pure_resources.page4.title", "Creating Netherite");
        provider.add(
            "book.pastel.guidebook.pyrite.page0.text",
            "Hard, sharp and yet surprisingly brittle. I found Pyrite all over the [Razor Edge]" +
            "(entry://dimension/razor_edge)."
        );
        provider.add(
            "book.pastel.guidebook.pyrite.page1.text",
            "Unless [#](449900)silk touched[#](), Pyrite shatters into items, requiring me to combine it again."
        );
        provider.add("book.pastel.guidebook.pyrite.page1.title", "Slabs & Stairs");
        provider.add(
            "book.pastel.guidebook.pyrite.page2.text",
            "Inspired by their properties, I designed many decorational blocks. I can [#](bb00bb)craft[#]() them or " +
            "use the [#](bb00bb)Stonecutter[#]()."
        );
        provider.add(
            "book.pastel.guidebook.pyrite.page3.text",
            "*Those sharp things are tearing me apart.*\\\n\\\nWell, my clothes, mostly. But still, point stands."
        );
        provider.add("book.pastel.guidebook.pyrite.page3.title", "Pyrite Rippers");
        provider.add(
            "book.pastel.guidebook.quitoxic_reeds.page0.text",
            "This alien-looking plant was growing in a swampy biome.\\\n[#](bb00bb)Seems to devour Soil[#]() as a " +
            "form of nutrient."
        );
        provider.add(
            "book.pastel.guidebook.quitoxic_reeds.page1.text",
            "I was able to extract a purple glittering powder from the stems by [crushing it]" +
            "(entry://general/item_crushing)!\\\n\\\nThe smell and consistency are very unusual when rubbed between " +
            "my fingers.\\\n*...wait a moment, what are fingers?*"
        );
        provider.add(
            "book.pastel.guidebook.radiance_pin.page0.text",
            "I didn't name this pin after the [Radiance Staff](entry://equipment/radiance_staff) by accident - " +
            "they're quite similar, in a way.\\\n\\\nIn a dark area, the pin automatically creates invisible lights." +
            " However, unlike the lights of the [Radiance Staff](entry://equipment/radiance_staff) they are free, " +
            "but slowly fade over time."
        );
        provider.add(
            "book.pastel.guidebook.radiance_pin.page1.text",
            "It's fascinating to see the paths I've already taken when exploring caves."
        );
        provider.add(
            "book.pastel.guidebook.radiance_staff.page0.text",
            "Torches have one crucial weakness: I have to get into the dark, before placing them.\\\n\\\nIn contrast," +
            " the Radiance Staff's Light Flood ability can place lights far away and in the air, illuminating large " +
            "caverns from afar.\\\nAs a final goodie, these lights are invisible, making them great for lighting my" +
            " builds atmospherically."
        );
        provider.add(
            "book.pastel.guidebook.radiance_staff.page1.text",
            "Interacting with placed lights using the staff to adjust the light level.\\\nThey can even be summoned " +
            "underwater."
        );
        provider.add(
            "book.pastel.guidebook.radiant_glass.page0.text",
            "I need a way to efficiently light my shelter and other structures. Pretty much the opposite of [#]" +
            "(bb00bb)Tinted Glass[#]()?\\\n\\\nWhat could be better than using the luminescent properties of " +
            "[Shimmerstone](entry://general/shimmerstone)? The [Shimmerstone](entry://general/shimmerstone) used in" +
            " its manufacture ensures that the glass glows from within."
        );
        provider.add(
            "book.pastel.guidebook.radiating_ender.page0.text",
            "Those pesky Endermen!\\\n\\\nThey always come out at night and steal blocks off the ground right in " +
            "front of my house. I have a feeling this whole area will be nothing but a crater in a month."
        );
        provider.add(
            "book.pastel.guidebook.radiating_ender.page1.text",
            "The Endermen come to this world to place down these blocks. *What is this stuff*? And *WHY* are they " +
            "leaving them here?\\\n\\\nNow that I hold one in my hands... they are everywhere! How didn't I notice " +
            "earlier? Anyway, I'm sure that I can make use of this interesting material somehow."
        );
        provider.add(
            "book.pastel.guidebook.rare_intact_gem",
            "Rarely, I find an intact gem, usable in recipes for which fragments are too small. With some effort, " +
            "these fragments can also be made whole again."
        );
        provider.add(
            "book.pastel.guidebook.razing.page0.text",
            "Even with a list of enchantments that I can barely read anymore due to its length, there are still a few" +
            " blocks that escape my gaze of superiority.\\\n\\\n[#](bb00bb)Obsidian[#](), you will be getting " +
            "cancelled today."
        );
        provider.add(
            "book.pastel.guidebook.razing.page1.text",
            "Higher mining speed the harder a block is to break.\\\n\\\nMax Level: 3\\\nApplicable to mining tools" +
            ".\\\nMutually exclusive with Fortune."
        );
        provider.add(
            "book.pastel.guidebook.razor_edge.page0.text",
            "Everything here seems to thrive on stabbing me. Not the most welcoming place to be."
        );
        provider.add(
            "book.pastel.guidebook.razor_edge.page1.text",
            "Even the ground: Parched and razor-sharp from lack of light and water - hence the name."
        );
        provider.add(
            "book.pastel.guidebook.razor_edge.page2.text",
            "Small mean plants that sting immensely when I make contact with them."
        );
        provider.add(
            "book.pastel.guidebook.redstone_calculator.page0.text",
            "Using the red math dust from underground, I've built gigantic constructions, just to emulate a parrot's " +
            "ability to calculate. When I look at them, my breath literally stops (*and the rest of the world, too, " +
            "several times a second*). The energy-laden [Citrine](entry://general/shards@citrine) seems perfect for" +
            " cramming basic arithmetic logic into a very small space."
        );
        provider.add(
            "book.pastel.guidebook.redstone_calculator.page1.text",
            "Modes: Addition, Subtraction, Multiplication, Division, Modulo, Min and Max. First input is the back, " +
            "second is the highest signal on the sides."
        );
        provider.add("book.pastel.guidebook.redstone_interaction.name", "Redstone Interactions");
        provider.add(
            "book.pastel.guidebook.redstone_interaction.page0.text",
            "When I expose a [#](bb00bb)Pastel Node[#]() to a [#](449900)redstone signal[#](), it loses the link to " +
            "its attached inventory."
        );
        provider.add(
            "book.pastel.guidebook.redstone_interaction.page1.text",
            "- [Gather Nodes](entry://pastel_network/gather_node) will stop requesting items\n- [Provider Nodes]" +
            "(entry://pastel_network/provider_node) will be unable to offer their items\n- [Sender Nodes]" +
            "(entry://pastel_network/sender_node) will stop emptying their inventory\n- [Storage Nodes]" +
            "(entry://pastel_network/storage_node) will be unable to accept and offer their items\n- [Buffer " +
            "Nodes](entry://pastel_network/buffer_node) will stop requesting and offering items"
        );
        provider.add(
            "book.pastel.guidebook.redstone_interaction.page2.text",
            "While the built-in redstone functionality of [#](bb00bb)Pastel NodeS[#]() is nice, certain situations " +
            "have proven to require specialized control. The pure resources I recently learned about seem to have " +
            "qualities suitable to such a task."
        );
        provider.add(
            "book.pastel.guidebook.redstone_sand.page0.text",
            "Thinking back to the good old days when I would set little traps for my friends: if they touched the " +
            "wrong block, they would be completely buried in sand. Today my friends are not so easily fooled anymore" +
            ".\\\n\\\nModern problems require modern solutions."
        );
        provider.add(
            "book.pastel.guidebook.redstone_sand.page1.text",
            "Behaves like a solid block until it receives a [#](449900)redstone signal[#](). The [#](449900)redstone " +
            "pulse[#]() propagates through connected blocks, making them fall."
        );
        provider.add(
            "book.pastel.guidebook.redstone_timer.page0.text",
            "While there are many ways to calculate time, most of them seem relatively... rustic.\\\n\\\nThey are no " +
        "match for this new trick up my sleeve: the time affinity of [Amethyst Shards]" +
            "(entry://general/shards@amethyst)."
        );
        provider.add(
            "book.pastel.guidebook.redstone_timer.page1.text",
            "I can toggle the duration of both the active time (interacting) and the inactive time (sneak-interacting" +
            " with empty hands)."
        );
        provider.add(
            "book.pastel.guidebook.redstone_transceiver.page0.text",
            "Gentle resonances are amplified by [Onyx](entry://general/shards@onyx) to such an extent that they can " +
            "be measured even through walls, given a suitable receiver.\\\nBased on my previous experiments with " +
            "[Gemstone Shards](entry://general/shards), it was easy for me to devise such transmitter and receiver " +
            "systems.\\\nRange: 16 blocks."
        );
        provider.add(
            "book.pastel.guidebook.redstone_transceiver.page1.text",
            "Interacting with empty hands toggles between sending and receiving. In receive mode the output is " +
            "directional. The frequency can be changed with Dye/Pigment/Paintbrush."
        );
        provider.add("book.pastel.guidebook.remembering", "Remembering");
        provider.add(
            "book.pastel.guidebook.reprise.page0.text",
            "This drink, brewed from the [#](bb00bb)Chorus Fruit[#](), inherits - and amplifies - not only the " +
            "plant's special taste, but also its unique properties.\\\n\\\nWhen consumed, this drink will randomly " +
            "teleport me over great distances. The higher the alcohol content, the further."
        );
        provider.add(
            "book.pastel.guidebook.reprise.page1.text", "*Tastes like raspberry, but there are none. Strange.*");
        provider.add(
            "book.pastel.guidebook.resonance.page0.text",
            "There have always been blocks that I have been very interested in, but I have never been able to carve " +
            "out of the ground carefully enough to retrieve them flawlessly. I've noticed, however, that these " +
            "blocks vibrate in a similar way to the gems I've been so concerned with lately.\\\nIf I can find the " +
            "right frequency, I may finally be able to hold some of those blocks in my hands."
        );
        provider.add(
            "book.pastel.guidebook.resonance.page1.text",
            "Uses gentle vibrations to drop some blocks as-is, preserve special properties, or turns them into " +
            "something else entirely.\\\n\\\nMax Level: 1\\\nApplicable to mining tools.\\\nMutually exclusive with " +
            "Silk Touch, Fortune and Pest Control."
        );
        provider.add("book.pastel.guidebook.resonance.page10.text", "Respawn Anchors retain their charges.");
        provider.add("book.pastel.guidebook.resonance.page11.text", "Signs keep their text & color.");
        provider.add("book.pastel.guidebook.resonance.page11.title", "Signs");
        provider.add(
            "book.pastel.guidebook.resonance.page12.text",
            "The gentle vibrations lull the silverfish hiding in the blocks.\\\n\\\nI can pack up the blocks " +
            "including the Silverfish and take them with me, without them knowing what is happening to them" +
            ".\\\nSweet, sweet revenge."
        );
        provider.add("book.pastel.guidebook.resonance.page12.title", "Infested Blocks");
        provider.add(
            "book.pastel.guidebook.resonance.page3.text",
            "The smaller gemstone buds are usually too fragile to be broken.\\\n\\\nHowever, with the right " +
            "frequency, the small buds will break off the stone almost by themselves, as if I were using [#](449900)" +
            "Silk Touch[#]()."
        );
        provider.add("book.pastel.guidebook.resonance.page3.title", "Gemstone Buds");
        provider.add(
            "book.pastel.guidebook.resonance.page4.text",
            "Breaking [#](bb00bb)Ores[#]() with Resonance drops [Pure Resources](entry://ink/pure_resources) instead " +
            "of Raw Ores."
        );
        provider.add(
            "book.pastel.guidebook.resonance.page5.text",
            "Colored Leaves are stimulated to release many more [#](bb00bb)Saplings[#]().\\\n\\\nApplied to a hoe " +
            "this will finally be my key to getting [Colored Saplings](entry://general/colored_trees) renewable."
        );
        provider.add("book.pastel.guidebook.resonance.page5.title", "Colored Leaves");
        provider.add(
            "book.pastel.guidebook.resonance.page6.text",
            "In the depths, I have come across cages that seem to spit out an endless number of enemies. What madman " +
            "put them there, what purpose they serve, and whether it was worth it with the poor loot is a mystery to" +
            " me. But I can certainly find some use for them. Hopefully their creator won't miss me taking a few."
        );
        provider.add(
            "book.pastel.guidebook.resonance.page7.text",
            "This immensely sturdy stone found in underground cities can be harvested."
        );
        provider.add(
            "book.pastel.guidebook.resonance.page8.text", "Sculk Shriekers retain their ability to summon the Warden.");
        provider.add(
            "book.pastel.guidebook.resonance.page9.text",
            "Brushable blocks retain their loot. I can brush them at home later."
        );
        provider.add("book.pastel.guidebook.resonance.page9.title", "Brushable Blocks");
        provider.add(
            "book.pastel.guidebook.resonance_harvesting",
            "Tools enchanted with [Resonance](entry://enchanting/enchantments/resonance) are able to harvest [#]" +
            "(bb00bb)Budding Blocks[#]()."
        );
        provider.add(
            "book.pastel.guidebook.resonance_shards.page0.text",
            "It turns out that the beautiful sounds of [Hummingstones](entry://dimension/hummingstone) can build on " +
            "each other until they shatter in a final anthem.\\\n\\\nThe shattered remains never seem to stop " +
            "vibrating, even in my hands, as if they retained some form of inherent energy."
        );
        provider.add(
            "book.pastel.guidebook.resonant_lily.page0.text",
            "This is an interesting one. When [#](bb00bb)flowers[#]() absorb [Liquid Crystal]" +
            "(entry://general/liquid_crystal) through their roots, they turn into those elusive plants."
        );
        provider.add(
            "book.pastel.guidebook.restoration_tea.page0.text",
            "Is there anything more cozy than sitting by the fire on a rainy evening, sipping a cup of tea?\\\nSure: " +
            "killing a boss beforehand.\\\n\\\nThis tea, brewed from the petals of the [Jade Vine]" +
            "(entry://general/jade_vines) is good for both relaxation and protection from the deadly effects of the" +
            " Wither. *Convenient*"
        );
        provider.add(
            "book.pastel.guidebook.ring_of_aerial_grace.page0.text",
            "I know myself well enough now to be the one having one's head in the clouds.\\\n\\\n*Literally*, this " +
            "time around, though!"
        );
        provider.add("book.pastel.guidebook.ring_of_aerial_grace.page1.text", "*I'm in a light mood today*");
        provider.add(
            "book.pastel.guidebook.ring_of_denser_steps.page0.text",
            "You know, I always wondered where all that Ink goes, when I infuse my small trinkets with it. Does it " +
            "soak into the material like a good wine into a bunch of grapes?\\\nI actually wanted to build a scale. " +
            "Didn't quite work out. But of course I won't let my findings go to waste.\\\n\\\nBehold: *this ring*!"
        );
        provider.add("book.pastel.guidebook.ring_of_denser_steps.page1.text", "*probably my densest idea yet*");
        provider.add(
            "book.pastel.guidebook.ring_of_pursuit.page0.text",
            "Mining is my game.\\\nIt's almost a miracle that it's only now that I've come up with the idea of " +
            "upgrading not only my tools, but my mining proficiency in general. This ring will even grow with my " +
            "abilities."
        );
        provider.add(
            "book.pastel.guidebook.ring_of_pursuit.page1.text",
            "Can be infused with [Magenta Ink](entry://ink/ink) in a [Color Picker](entry://ink/color_picker) to " +
            "increase mining speed."
        );
        provider.add(
            "book.pastel.guidebook.rock_crystal.page0.text",
            "Giant clusters of quartz crystals can be found dotting the [Razor Edge](entry://dimension/razor_edge)" +
            ".\\\n\\\nI will entirely admit that, given how nether quartz is found in loose crystals, I had " +
            "forgotten just how tough quartz is when fused together like this. This stuff is **tough**."
        );
        provider.add(
            "book.pastel.guidebook.rock_crystal.page1.text",
            "Honestly I am a little worried the Anvil will break before the crystals do."
        );
        provider.add("book.pastel.guidebook.ruin.name", "Experiment #3: Ruin");
        provider.add(
            "book.pastel.guidebook.ruin.page0.text",
            "This is it: the perfection of my formula. One small failure definitely could not stop me.\\\nThis may be" +
            " the one thing aggressive enough to destroy even some materials I had previously deemed unbreakable" +
            ".\\\nI won't even make it subtle. This stuff is [#](ff0000)NASTY[#]() by design, I didn't call it that" +
            " for the fun of it."
        );
        provider.add(
            "book.pastel.guidebook.ruin.page1.text",
            "Something tells me that if I'm not careful, I could ruin this world.\\\nA necessary sacrifice, really."
        );
        provider.add("book.pastel.guidebook.sawblade_holly.name", "Sawblade Holly");
        provider.add(
            "book.pastel.guidebook.sawblade_holly.page0.text",
            "These berries remind me of [#](bb00bb)Sweet Berries[#](). Unlike those, however, these are rather dry" +
            ".\\\n\\\nCan be eaten, but have an unpleasant consistency. Better than nothing, when the going gets " +
            "tough."
        );
        provider.add(
            "book.pastel.guidebook.sawblade_holly.page1.text",
            "Harvested by shearing a Sawblade Holly Bush. Can be used as a [Potion Reagent]" +
            "(entry://brewing/potion_workshop_reagents@prickly_bayleaf) and in cooking.\\\n\\\n*Clearly easier to " +
            "digest cooked than raw...*"
        );
        provider.add(
            "book.pastel.guidebook.scarred.page0.text",
            "Prevented me from regenerating health by natural means while also preventing me from sprinting" +
            ".\\\n\\\n*A vicious cycle, should something attack me*"
        );
        provider.add(
            "book.pastel.guidebook.semi_permeable_glass.page0.text",
            "Those pesky monsters that appear at night have long since ceased to be a threat to me, now merely " +
            "serving as a resource supplier, if anything. But that doesn't stop them from stalking and harassing me" +
            ".\\\nI've spent more time keeping those pesky monsters out of my base than I care to admit."
        );
        provider.add(
            "book.pastel.guidebook.semi_permeable_glass.page1.text",
            "Then I remembered my [Gemstone Glass recipe](entry://decoration/gemstone_glass) that I had created " +
            "earlier.\\\n\\\nWith a bit of magical energy, it was no problem to make it not only transparent, but " +
            "also passable for me (but not for them!).\\\n\\\nBonus: I made it look exactly like regular glass in " +
            "case I want to fool my competitors."
        );
        provider.add(
            "book.pastel.guidebook.semi_permeable_glass.page2.text",
            "Looks exactly like its mundane counterpart, but only players can pass through it. All other creatures " +
            "will bounce off it like a fly off a window."
        );
        provider.add("book.pastel.guidebook.semi_permeable_glass.page2.title", "Simple Variant");
        provider.add(
            "book.pastel.guidebook.semi_permeable_glass.page3.text", "Comes in all gemstone colors and a few more.");
        provider.add("book.pastel.guidebook.semi_permeable_glass.page3.title", "Gemstone Variant");
        provider.add("book.pastel.guidebook.semi_permeable_glass.page4.title", "Tinted Variant");
        provider.add("book.pastel.guidebook.semi_permeable_glass.page5.title", "Radiant Variant");
        provider.add("book.pastel.guidebook.sender_node.name", "Sender Node");
        provider.add(
            "book.pastel.guidebook.sender_node.page0.text",
            "The Sender Node will actively try to keep the connected inventory empty.\\\n\\\nThe order, in which it " +
            "will push items, is as follows:\n1. [Gather Nodes](entry://pastel_network/gather_node)\n2. [Buffer " +
            "Nodes](entry://pastel_network/buffer_node)\n3. [Storage Nodes](entry://pastel_network/storage_node)"
        );
        provider.add("book.pastel.guidebook.serendipity_reel.name", "Serendipity Reel");
        provider.add(
            "book.pastel.guidebook.serendipity_reel.page0.text",
            "To be honest, I no longer have to go fishing to feed myself. It is still a guilty pleasure of mine. " +
            "Sitting by my pond and watching the gentle waves makes me feel calm.\\\n\\\nDoesn't mean I don't " +
            "appreciate the occasional catch. Or two. Or three. Or..."
        );
        provider.add(
            "book.pastel.guidebook.serendipity_reel.page1.text",
            "Chance to reel in double the loot. Or more!\\\n\\\nMax Level: 2\\\nApplicable to Pastel's Fishing Rods."
        );
        provider.add("book.pastel.guidebook.seven_league_boots.name", "Seven League Boots");
        provider.add(
            "book.pastel.guidebook.seven_league_boots.page0.text",
            "Getting from A to B is tedious and my travel time only seems to increase, especially with [Geodes]" +
            "(entry://general/geodes) scattered across the land as they are.\\\n\\\nTo solve this problem, I " +
            "designed the Seven League Boots, which make me much more mobile than before."
        );
        provider.add(
            "book.pastel.guidebook.seven_league_boots.page1.text", "Increases both movement speed and step height.");
        provider.add(
            "book.pastel.guidebook.seven_league_boots.page2.text", "Further increases the movement speed bonus.");
        provider.add(
            "book.pastel.guidebook.shale_clay.page0.text",
            "A sedimentary rock consisting of, well, layered shale and clay. Pretty unspectacular, apart from being " +
            "pretty to look at."
        );
        provider.add(
            "book.pastel.guidebook.shale_clay.page1.text",
            "I can shape Shale Clay into many decorative blocks using [#](bb00bb)Crafting[#]() or the [#](bb00bb)" +
            "Stonecutter[#]()."
        );
        provider.add(
            "book.pastel.guidebook.shale_clay.page2.text",
            "Polishing Shale Clay brings out a nice, grayish color.\\\nThough it seems to [#](449900)weather over " +
            "time[#](), when exposed to the elements (direct sunlight, rain), returning its natural brownish tint."
        );
        provider.add(
            "book.pastel.guidebook.shale_clay.page4.text",
            "Looks like farmland, tastes like farmland, but is poorly suited for use as such. I can plant crops on " +
            "it, but they will never grow an inch."
        );
        provider.add("book.pastel.guidebook.shards.illustration.amethyst.text", "*The Flow of Time*");
        provider.add("book.pastel.guidebook.shards.illustration.citrine.text", "*The Fervor of Life*");
        provider.add("book.pastel.guidebook.shards.illustration.moonstone.text", "*The Melancholy of Eternity*");
        provider.add("book.pastel.guidebook.shards.illustration.onyx.text", "*The Endlessness of Absolutes*");
        provider.add("book.pastel.guidebook.shards.illustration.topaz.text", "*The Weight of the World*");
        provider.add("book.pastel.guidebook.shards.name", "Gemstone Shards");
        provider.add(
            "book.pastel.guidebook.shards.page0.text",
            "In a [geode](entry://general/geodes) I found this interesting gemstone. Not an item like every other for" +
            " sure. This one (and other ones?) are special.\\\n\\\nEach type of gem represents both an elemental " +
            "color and a natural force."
        );
        provider.add(
            "book.pastel.guidebook.shards.page1.text",
            "Topaz Shards are surprisingly heavy in my hand. This gemstone quickly proved to be one of the most " +
            "robust materials I've ever handled - perhaps only surpassed by diamond. I found Topaz in geodes at the " +
            "very tops of steep hills and on the summits of sky-high mountains.\\\nTopaz represents **[#](5bffed)" +
            "MATTER.[#]()**"
        );
        provider.add("book.pastel.guidebook.shards.page1.title", "Topaz Shards");
        provider.add(
            "book.pastel.guidebook.shards.page2.text",
            "Magenta light is refracted in this gemstone.\\\nFormed over eons in the geodes, this gem radiates awe. I" +
            " found this symbol of permanence in the deepest layers of the world.\\\n\\\nAmethyst represents **[#]" +
            "(ff4ff6)TIME[#]()**."
        );
        provider.add("book.pastel.guidebook.shards.page2.title", "Amethyst Shards");
        provider.add(
            "book.pastel.guidebook.shards.page3.text",
            "I stumbled upon this yellow gemstone near the surface level where the sun's light dissipates into warmth" +
            ".\\\n\\\nIts bright yellow luster radiates pure **[#](eded00)ENERGY[#]()** and makes it slightly warm " +
            "to the touch at all times."
        );
        provider.add("book.pastel.guidebook.shards.page3.title", "Citrine Shards");
        provider.add(
            "book.pastel.guidebook.shards.page4.text",
            "Onyx is near pitch black. It almost seems to sap the light from its surroundings.\\\n\\\nOnyx, the " +
            "combination of energy, matter, and time, serves great as a focus and **[#](302951)CATALYST[#]()** for " +
            "my magical tools and devices."
        );
        provider.add("book.pastel.guidebook.shards.page4.title", "Onyx Shards");
        provider.add(
            "book.pastel.guidebook.shards.page5.text",
            "Its white glow reminds me of the soothing light of the moon on a cool summer night. The tranquillity it " +
            "exudes leaves a calming yet significant impression, like a sleeping cat - balm for the soul and yet a " +
            "predator, always on guard.\\\n\\\nMoonstone embodies **[#](b9bebe)PURITY[#]()**."
        );
        provider.add("book.pastel.guidebook.shimmerstone.name", "Shimmerstone");
        provider.add(
            "book.pastel.guidebook.shimmerstone.page0.text",
            "A vibrant amber-tinted ore that not only emits energy in the form of light, but can also manipulate it" +
            ".\\\n\\\nI found Shimmerstone Ore mainly in high caves and above sea level, where the sun's light gives" +
            " way to a cozy warmth."
        );
        provider.add(
            "book.pastel.guidebook.shimmerstone.page1.text",
            "Full blocks of Shimmerstone emit glowing bright amber particles."
        );
        provider.add("book.pastel.guidebook.shimmerstone_lights.name", "Shimmerstone Lights");
        provider.add(
            "book.pastel.guidebook.shimmerstone_lights.page0.text",
            "On my first nights in this wonderful world, I used to light my improvised hut with torches. As " +
            "atmospheric as that was, it was also primitive.\\\nTo get away from my dark, torch-lit past, I created " +
            "lamps based on [Shimmerstone](entry://general/shimmerstone)."
        );
        provider.add(
            "book.pastel.guidebook.shimmerstone_lights.page1.text",
            "There are several variants, depending on which polished block I feel like using as the base."
        );
        provider.add(
            "book.pastel.guidebook.shimmerstone_lights.page2.text",
            "Blackslag can be used, too, resulting in an especially dark variant."
        );
        provider.add("book.pastel.guidebook.shimmerstone_lights.page2.title", "Blackslag Variant");
        provider.add("book.pastel.guidebook.sleep.name", "Soporific Alchemy");
        provider.add(
            "book.pastel.guidebook.sleep.page0.text",
            "Reflecting upon these night potions, it has quickly become evident that a variety of things can affect " +
            "how vulnerable I am to them. As for others... the main factor is a blend of their mental constitution " +
            "and biology. Arthropods are fairly resistant due to not really sleeping, whereas the restless Undead " +
            "seem terribly vulnerable to it. Beings of pure will would probably be near-immune."
        );
        provider.add("book.pastel.guidebook.sleep.page0.title", "Sleep and Willpower");
        provider.add(
            "book.pastel.guidebook.sleep.page1.text",
            "As I've learned more about this branch of alchemy, I've become concerned; I feel as if the tides of " +
            "slumber threaten to swallow me whole. It was a bit odd seeing multiple effects being of one essence, " +
            "but I brushed it off as nothing special. Now I am not so sure. These Burgeons and their Nectar, and " +
            "[Fatal Slumber](entry://brewing/effects/fatal_slumber) and its traces of light... there is an air to " +
            "it, one concerningly reminiscent of [Divinity](entry://brewing/effects/divinity)."
        );
        provider.add("book.pastel.guidebook.sleep.page1.title", "Velvet and Silver");
        provider.add(
            "book.pastel.guidebook.sleep_resistance",
            "This brew is a work of elemental night alchemy and works off of velvet magic. It is thus affected by the" +
            " mental constitution of the afflicted, and in my own case, sleep resistance."
        );
        provider.add("book.pastel.guidebook.slush.page0.text", "Incredibly soft, moist soil. Smells like earthworm.");
        provider.add(
            "book.pastel.guidebook.slush.page1.text",
            "Ever-moist farmland, with lots of nutrients. Plants thrive on it."
        );
        provider.add("book.pastel.guidebook.smelting_back", "Smelting them back");
        provider.add(
            "book.pastel.guidebook.sniping.page0.text",
            "Compared to the [#](bb00bb)Bow[#](), the [#](bb00bb)Crossbow[#]() leads a rather inconspicuous existence" +
            ".\\\n\\\nWith the Sniping Enchantment however, the crossbow becomes a deadly ranged weapon."
        );
        provider.add(
            "book.pastel.guidebook.sniping.page1.text",
            "Increases damage, accuracy and projectile speed.\\\n\\\nMax Level: 2\\\nApplicable to Crossbows" +
            ".\\\nMutually exclusive with Multishot."
        );
        provider.add(
            "book.pastel.guidebook.somnolence.page0.text",
            "A [#](449900)strong, stupefying effect that scales with level[#](). This works on anything, *myself " +
            "included*.\\\n\\\nOn that note, this made me drowsy enough to [#](449900)sleep regardless of time or " +
            "conditions,[#]() which could be very useful!"
        );
        provider.add(
            "book.pastel.guidebook.soothing_bouquet.page0.text",
            "Night Salts were a stunning success in improving my sleep and worsening my back pain. As I've become " +
            "more educated in night alchemy, however, I feel like I can execute the concept a bit better now" +
            ".\\\n\\\n\\\n*Elegance is the name of the game, and why huff salts when I can enjoy the flowers?*"
        );
        provider.add(
            "book.pastel.guidebook.soothing_bouquet.page1.text",
            "As was is as will be - nuzzle that bodacious blossom and take a deep breath.\\\n\\\n*Copium? No, Opium!*"
        );
        provider.add("book.pastel.guidebook.soporific", "Soporific (Resistances)");
        provider.add("book.pastel.guidebook.spawner_creature_change.name", "Changing Spawner Creatures");
        provider.add(
            "book.pastel.guidebook.spawner_creature_change.page0.text",
            "I found out how to assign a new type of creature to mob spawners, making it spew out other creatures " +
            "altogether!\\\nA somewhat terrifying ability, I must admit.\\\n\\\nWill I become the person to create " +
            "life for the sake of the gift of life, or only to tear it away again immediately?"
        );
        provider.add(
            "book.pastel.guidebook.spawner_creature_change.page1.text",
            "What sort of person am I? In this case, my morals must serve as a guide."
        );
        provider.add("book.pastel.guidebook.spawner_creature_change.page1.title", "Associating a Creature");
        provider.add("book.pastel.guidebook.spawner_manipulation.name", "Spawner Manipulation");
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.intro.text",
            "My new [Resonance](entry://enchanting/enchantments/resonance) enchantment finally allowed me to get " +
            "Spawners to drop. Look what I got here!\\\nWhile I haven't yet figured out how to make these constructs" +
            " myself, I'm starting to feel comfortable altering their properties in my favor, thanks to the [Spirit" +
            " Instiller](entry://creating_life/spirit_instiller).\\\n*This gon be gud.*"
        );
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.spawn_count_change.text",
            "Increases the number of creatures summoned with each spawn cycle."
        );
        provider.add("book.pastel.guidebook.spawner_manipulation.spawn_count_change.title", "Spawn Amount");
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.spawn_delay_change.text",
            "Lowers both min and max spawn delay."
        );
        provider.add("book.pastel.guidebook.spawner_manipulation.spawn_delay_change.title", "Spawn Delay");
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.max_nearby_entities_change.text",
            "Spawners seem to naturally stop spawning creatures when there are a lot of them around. Almost as if " +
            "they want to give me a chance. *Pathetic, isn't it? As if I needed that.*\\\nThis modification " +
            "increases the number of creatures that are allowed to be near the Spawner."
        );
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.max_nearby_entities_change.title", "Summoning Criteria");
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.required_player_range_change.text",
            "Increases the distance I can be away from a spawner and it still works."
        );
        provider.add(
            "book.pastel.guidebook.spawner_manipulation.required_player_range_change.title", "Activation Range");
        provider.add(
            "book.pastel.guidebook.spirit_instiller.page0.text",
            "With all the knowledge I gathered, I created the **Spirit Instiller**. I specifically designed it to " +
            "combine the energies of two items, with the help of a third object to bind them.\\\nLike the others, " +
            "the Spirit Instiller needs a focus structure to work. To rotate the structure hologram in the " +
            "direction I want it to go, I am able click on the Spirit Instiller when it is placed."
        );
        provider.add(
            "book.pastel.guidebook.spirit_instiller.page1.text", "An almost spiritual process, hence the name.");
        provider.add(
            "book.pastel.guidebook.spirit_instiller.page2.text",
            "Dimensions: 8x9x5 blocks\\\nIt can be enhanced by placing [Upgrades](entry://magical_blocks/upgrades) on" +
            " the two [#](bb00bb)Onyx Chiseled Blocks[#]()."
        );
        provider.add(
            "book.pastel.guidebook.spirit_instiller.page3.text",
            "- 1 Spirit Instiller\n- 2 Item Bowls\n- 2 Notched Polished Blocks\n- 2 Chiseled Polished Blocks\n- 2 " +
            "Onyx Chiseled Blocks\n- 6 Polished Pillars\n- 17 Polished Slabs\n- 41 Polished Blocks\n- 2 Gemstone " +
            "Chimes"
        );
        provider.add("book.pastel.guidebook.spirit_instiller_recipe", "Spirit Inst. Recipe");
        provider.add("book.pastel.guidebook.stacking_effect", "Stacking Effect");
        provider.add(
            "book.pastel.guidebook.staff_of_remembrance.page0.text",
            "*One to rule them all*\\\n...well, politely, of course.\\\n\\\nThe Staff of Remembrance allows me to " +
            "move around my animals with ease, over both short and long distances."
        );
        provider.add(
            "book.pastel.guidebook.staff_of_remembrance.page1.text",
            "Tapping animals recollects them into a [Memory](entry://creating_life/memories)."
        );
        provider.add(
            "book.pastel.guidebook.star_candy.page0.text",
            "Baked [Stardust](entry://general/stargazing@stardust) tastes strangely refreshing - the magic made my " +
            "tongue tingle as the heaven-sent candy dissolved in my mouth, and I felt strangely healthier afterwards" +
            ". Its hard, golden flesh has a few purple flecks that shimmer like shards of stars.\\\n\\\n*I have " +
            "long since stopped asking myself why I taste everything I come across.*"
        );
        provider.add(
            "book.pastel.guidebook.star_candy.page1.text",
            "Perhaps the speckles are the source of its restorative properties? I wonder if it is possible to create " +
            "a completely purple one."
        );
        provider.add(
            "book.pastel.guidebook.star_candy.page2.text",
            "Now THAT's a tasty one!\\\nJust touching those star-strudded strips gave me the same tingling sensation " +
            "as eating the whole thing before."
        );
        provider.add("book.pastel.guidebook.star_candy.page2.title", "A rare Find");
        provider.add("book.pastel.guidebook.stargazing.name", "Stargazing");
        provider.add(
            "book.pastel.guidebook.stargazing.page0.text",
            "The calmness of the night often invites me to lie in the grass and watch the stars."
        );
        provider.add("book.pastel.guidebook.stargazing.page0.title", "Wishing upon a Star");
        provider.add(
            "book.pastel.guidebook.stargazing.page1.text",
            "The small Shooting Stars are made of a material unknown to me thus far.\\\n\\\nCan I catch one right out" +
            " of the sky?\\\n\\\n*I am sure they are even easier to spot when I am using a Telescope or Night Vision.*"
        );
        provider.add("book.pastel.guidebook.stargazing.page1.title", "Shooting Stars");
        provider.add(
            "book.pastel.guidebook.stargazing.page2.text",
            "Now that I've collected all variants, it's time to unwind! Hardened with a Diamond, stars won't break " +
            "anymore when hit.\\\n\\\n*Fancy a Starball tournament with friends?*"
        );
        provider.add("book.pastel.guidebook.stargazing.page2.title", "Star Hardening");
        provider.add(
            "book.pastel.guidebook.stargazing.page3.text",
            "Shooting Stars yield valuable resources: a Star Fragment, Stardust and a variety of other rare materials" +
            ".\\\n\\\nPicking up a Shooting Star by crouching and [crushing it with an Anvil]" +
            "(entry://general/item_crushing) will yield double the Star Fragments, albeit at the cost of the other " +
            "loot."
        );
        provider.add("book.pastel.guidebook.stargazing.page3.title", "Star Fragments");
        provider.add(
            "book.pastel.guidebook.stargazing.page4.text",
            "A powder of unknown origin blessed with the soul of the stars.\\\n\\\n*Bears coy, yet latent power.*"
        );
        provider.add(
            "book.pastel.guidebook.steadfast.page0.text",
            "Knowing me, I will create the perfect tool, only to have it fall into Lava five minutes later in a " +
            "moment of derangement. And then there is the dimension of the Endermen, which dramatically punishes any" +
            " mistakes.\\\n\\\nThis new enchantment will protect my favorite tools in case of brainfart (including " +
            "being thrown against a cactus)."
        );
        provider.add(
            "book.pastel.guidebook.steadfast.page1.text",
            "Protects tools from damage when on the ground, even from Lava or falling into the Void.\\\n\\\nMax " +
            "Level: 1\\\nApplicable to all tools."
        );
        provider.add(
            "book.pastel.guidebook.stiffness.page0.text",
            "[#](449900)Decreases my attack speed[#]() with every level."
        );
        provider.add("book.pastel.guidebook.storage_node.name", "Storage Node");
        provider.add(
            "book.pastel.guidebook.storage_node.page0.text",
            "The Storage Node shows its greatest use in combination with [Sender Nodes]" +
            "(entry://pastel_network/sender_node) (will push to it), [Gather Nodes]" +
            "(entry://pastel_network/gather_node), and [Buffer Nodes](entry://pastel_network/buffer_node) (will " +
            "pull from it).\\\n\\\nIts [#](449900)filter[#]() allows me to specify which items it will receive & " +
            "provide. An empty filter makes the connected inventory act as a general store for all types of items."
        );
        provider.add("book.pastel.guidebook.storm_stones.name", "Storm Stones");
        provider.add(
            "book.pastel.guidebook.storm_stones.page0.text",
            "Storms are a powerful manifestation of Mother Nature.\\\nUsing the [Fusion Shrine]" +
            "(entry://general/fusion_shrine) I even started one while I was crafting [some powerful resources]" +
            "(entry://general/onyx_shards).\\\n\\\nThere is no doubt that I will find something related to them " +
            "that can help me on my journey."
        );
        provider.add("book.pastel.guidebook.storm_stones.page0.title", "Thunderstorms");
        provider.add(
            "book.pastel.guidebook.storm_stones.page1.text",
            "Dug into the ground by lightning strikes, I found these stones, vibrating in my hand with barely " +
            "contained energy.\\\nUsed in the [Fusion Shrine](entry://general/fusion_shrine), I can summon another " +
            "thunderstorm with ease.\\\n\\\n*Because of their volatile nature, they don't react too well to " +
            "explosions...*"
        );
        provider.add("book.pastel.guidebook.stratine.name", "Stratine");
        provider.add(
            "book.pastel.guidebook.stratine.page0.text",
            "This very heavy ore is scattered throughout the depths of the Nether.\\\nIt is probably not the best " +
            "idea to carry large amounts of it home at once."
        );
        provider.add(
            "book.pastel.guidebook.stratine.page2.text",
            "Stratine - as I already discovered - is an exceptionally heavy material. And difficult to shape. Even " +
            "the blazing heat of the Nether did it no harm.\\\n\\\nHowever, shaping it with my [Pedestal]" +
            "(entry://general/pedestal) should be no problem at all."
        );
        provider.add("book.pastel.guidebook.stratine.page3.text", "*Heavy Metal*");
        provider.add(
            "book.pastel.guidebook.suspicious_brew.page0.text",
            "Curiously, the combination of mushrooms and water is a perfect receptacle for all sorts of other floral " +
            "notes - either rounding out the taste, or creating... very peculiar ones.\\\n\\\nEach flower has a " +
            "specific effect, as if I were feeding it to a [#](449900)Brown Mooshroom[#]()."
        );
        provider.add(
            "book.pastel.guidebook.suspicious_brew.page1.text",
            "The fermentation process in colored wood makes the effect last quite a bit longer compared to []" +
            "(item://minecraft:suspicious_stew)."
        );
        provider.add(
            "book.pastel.guidebook.swiftness.page0.text",
            "[#](449900)Increases my attack speed[#]() with every level."
        );
        provider.add(
            "book.pastel.guidebook.take_off_belt.page0.text",
            "Climbing mountains or misshapen caves is time consuming. If I don't see a way to scramble up an uneven " +
            "ledge, I've had no choice but to carve a path into the rock - until now!\\\nWith my new belt here I'm " +
            "able to put great vertical distances behind me, sparing me time and the beautiful nature from " +
            "destruction."
        );
        provider.add(
            "book.pastel.guidebook.take_off_belt.page1.text",
            "Sneak to charge a high jump, getting more powerful the longer I charge.\\\n\\\n*Even if the name implies" +
            " it, please don't take it off.*"
        );
        provider.add("book.pastel.guidebook.take_off_belt.page2.text", "Increases the jump height even further.");
        provider.add(
            "book.pastel.guidebook.take_off_belt.page3.text",
            "Will give me a short slow fall effect, allowing to better navigate where to land. A high level of " +
            "Feather Falling may be a viable way to get back down those cliffs again safely, actually."
        );
        provider.add("book.pastel.guidebook.tarts.name", "Tarts");
        provider.add(
            "book.pastel.guidebook.tarts.page0.text",
            "Although I am not the most skilled chef, even this rudimentary one tastes great!\\\n\\\nI can " +
            "additionally garnish it with various toppings to grant me [#](449900)defensive abilities[#]() for a " +
            "short duration."
        );
        provider.add(
            "book.pastel.guidebook.tarts.page3.text",
            "Makes me able to see and swim in Lava as if it were Water.\\\nHowever, does NOT make me immune to fire."
        );
        provider.add(
            "book.pastel.guidebook.tarts.page4.text",
            "Allows me to swim at light speed and greatly increases my underwater mining rate."
        );
        provider.add(
            "book.pastel.guidebook.tarts.page5.text",
            "Makes me feel well rested, like after a good night's sleep. Chases away the creatures of nightmares."
        );
        provider.add(
            "book.pastel.guidebook.tarts.page6.text",
            "Gives me a small chance that projectiles will simply deflect off of me."
        );
        provider.add("book.pastel.guidebook.the_art_of_brewing.drinking_age.button_text", "I confirm");
        provider.add("book.pastel.guidebook.the_art_of_brewing.drinking_age.button_text_confirmed", "Confirmed ✔");
        provider.add(
            "book.pastel.guidebook.the_art_of_brewing.drinking_age.text",
            "The [Titration Barrel](entry://cuisine/titration_barrel) is capable of brewing alcoholic beverages. If " +
            "you are of legal drinking age in your country and want to engage with recipes mentioning alcohol, you " +
            "can press the button below to unlock these recipes.\\\nIf not don't worry - you won't miss out on " +
            "anything important."
        );
        provider.add("book.pastel.guidebook.the_art_of_brewing.drinking_age.title", "Safety Question");
        provider.add("book.pastel.guidebook.the_art_of_brewing.name", "The Art of Brewing");
        provider.add(
            "book.pastel.guidebook.the_art_of_brewing.page0.text",
            "Fermentation is a very natural process - things take time and care. As there is never a completely " +
            "controlled environment, there are a lot of variables.\\\nI can follow the recipe to the letter, or play" +
            " around a bit. Fermentation is an Art!"
        );
        provider.add(
            "book.pastel.guidebook.the_art_of_brewing.page1.text",
            "- Time: It takes time for the barrel to influence the contents. Most drinks will develop more intense " +
            "and even additional effects if given more time than strictly necessary\n- Temperature: The hotter it " +
            "is, the more of the precious contents will simply evaporate over time. This is called the angel's share"
        );
        provider.add("book.pastel.guidebook.the_art_of_brewing.page1.title", "Outside Influences");
        provider.add(
            "book.pastel.guidebook.the_art_of_brewing.page2.text",
            "- Humidity: The more humid the air, the more water will evaporate compared to the alcohol, making the " +
            "drink stronger\n- Water Share: A higher ratio of ingredients to water is a fine balance, but one to be " +
            "played with. A higher thickness makes the drink ferment faster, albeit at the cost of shorter duration" +
            " status effects"
        );
        provider.add("book.pastel.guidebook.the_perfect_compound.description", "My final masterpiece");
        provider.add("book.pastel.guidebook.the_perfect_compound.name", "The Perfect Compound?");
        provider.add(
            "book.pastel.guidebook.the_perfect_compound.page0.text",
            "The results of my [last experiment](entry://general/failing) make me long for more: how much power can I" +
            " squeeze out of these gemstones?\\\nI am sure there's more, and [Neolith](entry://general/neolith) must" +
            " will be my entry gate! With such coherence, it may allow me to unite the powers of all the gems into " +
            "one. This relic shall be the capstone to my creation, my personal Philosopher's stone, making me a " +
            "living god!"
        );
        provider.add(
            "book.pastel.guidebook.the_perfect_compound.page1.text",
            "Requires daytime and a clear sky.\\\n\\\nThe fusion of these magical energies will stress my Fusion " +
            "Shrine like nothing before - with a display to match. Best to make sure it and the blocks around it are" +
            " fortified and isolated."
        );
        provider.add(
            "book.pastel.guidebook.tight_grip.page0.text",
            "It almost seems like a fever dream when I remember being able to strike with weapons faster than I can " +
            "think. Nowadays, each blow costs me so much energy that I have to pause for a moment.\\\n*Maybe I'm " +
            "getting old.*\\\n\\\nWith a few adjustments to my weapon, I can reduce this downtime somewhat."
        );
        provider.add(
            "book.pastel.guidebook.tight_grip.page1.text",
            "Decreases attack cooldown.\\\n\\\nMax Level: 2\\\nApplicable to melee weapons."
        );
        provider.add("book.pastel.guidebook.titration_barrel.le_fishe_au_chocolat.text", "*It's certainly something.*");
        provider.add(
            "book.pastel.guidebook.titration_barrel.page0.text",
            "The idea of fermenting [food](entry://cuisine/titration_barrel@kimchi) and [drinks]" +
            "(entry://cuisine/infused_beverages) in [Colored Wood](entry://general/colored_trees@colored_wood) was " +
            "not far to seek.\\\nOver time, the properties of the wood affect the contents. The results are " +
            "sometimes more delicious, sometimes less delicious (though the latter could be due to my cooking " +
            "skills), but always interesting.\\\n\\\nThe barrel holds up to a stack of items and one bucket of " +
            "liquid."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page1.text",
            "*Sometimes it feels like that when I blink the world has ceased to exist? Each time the barrel " +
            "fermentation process seems to have progressed.*"
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page2.text",
            "Fermentation is not just for drinks! Made from 2 different vegetables, Kimchi is a hearty dish, best " +
            "served as a side."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page3.text",
            "Takes a little time, but more efficient than just throwing the ingredients together."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page4.text",
            "Slightly fermented, it still retains the properties of [Milk](item://minecraft:milk_bucket). Eating it " +
            "will remove any status effects currently active."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page5.text",
            "A great snack. Biting off a piece is quick and even makes me feel reasonably full.\\\nPleasantly sweet " +
            "and fruity."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page6.text",
            "An elaborate feast of flavors that makes my mouth water just thinking about it."
        );
        provider.add(
            "book.pastel.guidebook.titration_barrel.page7.text",
            "Perfect for relaxing, and refreshing in the cold season."
        );
        provider.add("book.pastel.guidebook.titration_recipe", "Titration Recipe");
        provider.add(
            "book.pastel.guidebook.totem_pendant.page0.text",
            "[#](bb00bb)Totems of Undying[#](), while powerful, have the significant disadvantage of requiring me to " +
            "hold them in my hand at all times.\\\n\\\nUsing the protective powers of [Blue Pigment]" +
            "(entry://general/pigment@blue) as a focus I can keep the totem's life-saving effect active even when " +
            "worn around the neck."
        );
        provider.add(
            "book.pastel.guidebook.totem_pendant.page1.text",
            "One-time protection from death. Disintegrates into dust once triggered."
        );
        provider.add(
            "book.pastel.guidebook.toughness.page0.text",
            "[#](449900)Weakened powerful attacks[#]() that hit me.\\\nWhile great against single, deadly blows, it " +
            "did little against many small attacks."
        );
        provider.add(
            "book.pastel.guidebook.treasure_hunter.page0.text",
            "I recently completed a painting, showing a fantastic creature that has appeared in my dreams: apparently" +
            " made of [#](bb00bb)Soul Sand[#]() and [#](bb00bb)Wither Skeleton Skulls[#](). I waited in a Nether " +
            "Fortress for hours, trying to recreate it, only to nearly lose my own head while searching for a " +
            "Wither Skeleton with a spine loose enough to drop its skull. Heads up, I never were the one to bury " +
            "my head in the sand."
        );
        provider.add(
            "book.pastel.guidebook.treasure_hunter.page1.text",
            "Then I remembered the Creepers! After being struck by lightning, they explode with such force that they " +
            "blow their enemies' heads right off their necks (worst case: mine).\\\nTo replicate this, I came up " +
            "with an enchantment using [Storm Stones](entry://general/storm_stones).\\\nAnd so Treasure Hunter was " +
            "born, allowing me to collect [all kinds of Mob Heads](entry://creating_life/mob_heads)."
        );
        provider.add("book.pastel.guidebook.treasure_hunter.page1.title", "Getting Mob Heads");
        provider.add(
            "book.pastel.guidebook.treasure_hunter.page2.text",
            "Occasionally drops Mob Heads on kill.\\\n\\\nMax Level: 3\\\nApplicable to axes and melee weapons" +
            ".\\\nMutually exclusive with Looting."
        );
        provider.add("book.pastel.guidebook.trifles.name", "Trifles");
        provider.add(
            "book.pastel.guidebook.trifles.page0.text",
            "Sweet delicacies, guaranteed to give me more than just a sugar rush - depending on the toppings.\\\nMade" +
            " from [Jaramel](entry://general/jade_vines@jaramel), [#](449900)Gelatin[#]() & [Amaranth]" +
            "(entry://cuisine/amaranth).\\\n\\\n*Even the simple one tastes great!*"
        );
        provider.add("book.pastel.guidebook.trifles.page3.text", "Gives random effects. Do I fancy a gamble?");
        provider.add("book.pastel.guidebook.tuning_stamp.name", "Tuning Stamp");
        provider.add(
            "book.pastel.guidebook.tuning_stamp.page0.text",
            "An essential part of network management is being able to fine-tune where and how things go around. This " +
            "crystal stamp allows me to manually add and remove pastel nodes from networks.\\\n\\\n[#](449900)" +
            "Redo[#]() a preexisting connection to unlink it.\\\n[#](449900)Shift-right-click[#]() to remove all " +
            "connections."
        );
        provider.add(
            "book.pastel.guidebook.tuning_stamp.page1.text",
            "*How else would I connect them? They aren't just going to automatically hook up into a mess on their " +
            "own, that'd be silly!*"
        );
        provider.add("book.pastel.guidebook.pastel_upgrades.name", "Pastel Node Upgrades");
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.about.text",
            "Oh, how cruel, how terribly cruel - that my creation is *not good enough!* Such a lacking system is " +
            "below me, this cannot stand.\\\n\\\nAfter thinking about it a while, the solution is evident. I can use" +
            " the rings of light surrounding the nodes to enhance them (which, of course, was part of my designs), " +
            "all it takes is the right material..."
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.enhancing.text",
            "Every node that can provide items has two ring-slots for upgrades. These rings can have upgrades applied" +
            " by interacting with them, and removed via sneak-interaction. Upgrades of the same nature will stack " +
            "with each other, though often not linearly.\\\n\\\n*The upgrades always apply on the source node.*"
        );
        provider.add("book.pastel.guidebook.pastel_upgrades.enhancing.title", "Enhancing Nodes");
        provider.add("book.pastel.guidebook.pastel_upgrades.transfer.name", "Transfer Upgrades");
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.raw_malachite.text",
            "Slightly reduces [#](449900)travel time[#]().\\\n\\\n*Latency can be a problem sometimes.*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.pure_malachite.text",
            "Significantly reduces [#](449900)travel time[#]().\\\n\\\n*Travel time? Never heard of it.*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.raw_azurite.text",
            "+1 row of [#](449900)filter slots[#]()\\\n[Gather Nodes](entry://pastel_network/gather_node) gain twice " +
            "as many rows.\\\n\\\n*Filter? I barely know her!*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.pure_azurite.text",
            "+2 rows of [#](449900)filter slots[#]()\\\n[Gather Nodes](entry://pastel_network/gather_node) gain twice" +
            " as many rows.\\\n\\\n*...not that I would mind it, though.*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.raw_bloodstone.text",
            "Increases the [#](449900)amount of items transferred[#]() per batch.\\\n\\\n*Are dragons this stacked?*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.pure_bloodstone.text",
            "Significantly increases the [#](449900)amount of items transferred[#]() per batch.\\\n\\\n*All the " +
            "things, all at once!*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.transfer.resonance_shard.text",
            "Significantly boosts [#](449900)transfer rate[#]().\\\n\\\n*Steady? No. Slow? Also no!*"
        );
        provider.add("book.pastel.guidebook.pastel_upgrades.decorative.name", "Decorative Upgrades");
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.decorative.page0.text",
            "It's not always about being efficient. Sometimes I just want by creations to look cool. Decorative " +
            "upgrades have no practical use but are pretty."
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.decorative.shimmerstone_gem.text",
            "Makes the node [#](449900)glow brightly[#]()."
        );
        provider.add("book.pastel.guidebook.pastel_upgrades.redstone.name", "Redstone Upgrades");
        provider.add("book.pastel.guidebook.pastel_upgrades.redstone.about.title", "Redstone Integration Upgrades");
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_redstone.text",
            "Pure Redstone is, rather predictably, an excellent way to power things. Applying this to a node will " +
            "force it to always be on.\\\n\\\n*Cinnabar Dream*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_coal.text",
            "Sometimes I just need to invert signaling but there is not enough space to flip things around. Pure Coal" +
            " will do that without any additional space or mess.\\\n\\\n*Black is the new Red*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_echo.text",
            "Echo is a really curious thing, and one I've honestly had trouble finding a use for. It seems its sonar " +
            "qualities are excellent for detecting items passing by a node, producing an ephemeral redstone pulse" +
            ".\\\n\\\n*Resonance Cascade*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_lapis.text",
            "There are cases where I want to have a node be just permanently disabled, Lapis does just that. It is " +
            "great for, well\\\nI can go ahead and\\\nWell it could be the case that\\\n\\\n*Why did I make this?*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_quartz.text",
            "Fine control over the flow of transmissions bears some utility. Through the use of Pure Quartz I can " +
            "make it so the node will only activate when pulsed by redstone, where it will send one packet" +
            ".\\\n\\\n*One Step at a Time*"
        );
        provider.add(
            "book.pastel.guidebook.pastel_upgrades.redstone.pure_glowstone.text",
            "Making these things glow is quite nice, but if I ever want to use one as a bedside lamp I need it to be " +
            "able to turn off. Pure Glowstone achieves that, turning off when powered with redstone" +
            ".\\\n\\\n*Comparatively Overpriced*"
        );
        provider.add("book.pastel.guidebook.pastel_network_coloring.name", "Network Coloring");
        provider.add(
            "book.pastel.guidebook.pastel_network_coloring.page0.text",
            "The more I got to grips with my Pastel Network, the more limitations I realised - especially when I " +
            "wanted to use lots of nodes in a small space.\\\n\\\nThe fact that each node always has a random color " +
            "was one of my... more interesting design decisions."
        );
        provider.add("book.pastel.guidebook.pastel_network_coloring.page1.title", "The Solution?");
        provider.add(
            "book.pastel.guidebook.pastel_network_coloring.page1.text",
            "**The Paintbrush!**\\\n\\\nWith a clean flick of the wrist, I can recolor a network to any ink color I " +
            "desire.\\\nNow I can keep my networks well organized."
        );

        provider.add(
            "book.pastel.guidebook.turn_back_to_polished",
            "By applying heat, all blocks can be returned to their polished state."
        );
        provider.add("book.pastel.guidebook.two_upgrade_slots", "2 upgrade slots");
        provider.add(
            "book.pastel.guidebook.universe_spyhole.page0.text",
            "The creations that [Radiating Ender](entry://general/radiating_ender) allow me to create never cease to " +
            "amaze me.\\\n\\\nPlaced directly on a wall or on the ground, this strange block allows me to glimpse " +
            "the other side, allowing me to discover cave systems and structures... or see the sky if I am " +
            "underground!"
        );
        provider.add("book.pastel.guidebook.universe_spyhole.page1.text", "*I now see what you did there*");
        provider.add("book.pastel.guidebook.upgrades.name", "Structure Upgrades");
        provider.add(
            "book.pastel.guidebook.upgrades.page0.text",
            "The Pigment Pedestal and Fusion Shrine have already proven their worth. But there is always room for " +
            "improvement. That's why I've created these upgrades. Each one improves the properties of my structures " +
            "in a different way.\\\n\\\nAdditional upgrades of the same type have a reduced effect."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page1.text",
            "Crafting times have skyrocketed recently, mostly due to the more complex components. This will help me " +
            "bring the times back to an acceptable level."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page2.text",
            "The Pedestal Accelerator T2 improves on its predecessor. Making crafting even more fast."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page3.text",
            "Tier 3 leaves nothing to be desired - at least in terms of crafting speed."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page4.text",
            "The amount of experience I get from crafting is negligible most of the time. But with this Focus I can " +
            "dramatically increase it."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page5.text",
            "This improved Knowledge Focus increases crafting XP even more."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page6.text",
            "Allows me to cushion the consumption of my structures a little."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page7.text",
            "This 'upgrade of the upgrade' further reduces the use use of input materials."
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page8.text",
            "Although the chance is very small, I can increase the results from crafting!\\\n*More bang for my buck!*"
        );
        provider.add(
            "book.pastel.guidebook.upgrades.page9.text",
            "This upgraded version is much more powerful and has an even higher chance of increasing crafting output."
        );
        provider.add(
            "book.pastel.guidebook.upgrading.text",
            "Upgrading from level I to level II is fairly cheap at first.\\\nThis price will quickly increase to more" +
            " and more [Pigment](entry://general/pigment) and experience for each additional level."
        );
        provider.add("book.pastel.guidebook.upgrading_enchanted_books.name", "Upgrading Enchanted Books");
        provider.add(
            "book.pastel.guidebook.upgrading_enchanted_books.page0.text",
            "Enchantments and Color Magic have a lot in common. So I wasn't surprised when my first attempt to " +
            "combine [#](bb00bb)Enchanted Books[#]() with [Pigment](entry://general/pigment) was an instant success" +
            ".[#]()\\\n\\\nPlacing an [#](bb00bb)Enchanted Book[#]() on the [Enchanter]" +
            "(entry://enchanting/enchanter), surrounding it with matching [Pigment](entry://general/pigment) and " +
            "providing a steady stream of experience will raise the level of the book."
        );
        provider.add(
            "book.pastel.guidebook.upgrading_enchanted_books.page1.text",
            "Interrupting said process will stop it entirely."
        );
        provider.add(
            "book.pastel.guidebook.use_in_potion_workshop_bottle_slot",
            "Use the [Potion Workshop](entry://brewing/potion_workshop) to infuse it, by placing it where the [#]" +
            "(bb00bb)Bottle[#]() would normally go.\\\n\\\nTo clear its effect, put it in a crafting grid.\\\nThe " +
            "stored effect gets reapplied every 15 seconds."
        );
        provider.add("book.pastel.guidebook.mundane_items.name", "Mundane Items");
        provider.add(
            "book.pastel.guidebook.mundane_items.page0.text",
            "There are a few items that have always been difficult or even impossible to craft. My new skills make " +
            "that *much* easier."
        );
        provider.add("book.pastel.guidebook.mundane_items.page4.text", "Explodes when punched.");
        provider.add("book.pastel.guidebook.mundane_items.page4.title", "Unstable TNT");
        provider.add("book.pastel.guidebook.mundane_items.bundle.text", "Shouldn't have taken this long");
        provider.add("book.pastel.guidebook.mundane_items.cobweb.text", "How is string only sticky in web-form?");
        provider.add("book.pastel.guidebook.mundane_items.writeable_book.text", "Self-explanatory");
        provider.add("book.pastel.guidebook.mundane_items.spectral_arrow.text", "Prettier in amber");
        provider.add("book.pastel.guidebook.mundane_items.bell.text", "Alluring to foxes");
        provider.add("book.pastel.guidebook.mundane_items.name_tag.text", "I have no idea where the clover goes");
        provider.add(
            "book.pastel.guidebook.mundane_items.elytra.text",
            "According to all known laws of aviation, these aren't wings."
        );
        provider.add(
            "book.pastel.guidebook.mundane_items.trident.text",
            "I heard something about bedrock and finding these, but I just got swarmed by bugs"
        );
        provider.add("book.pastel.guidebook.mundane_items.heavy_core.text", "Breach me,,,");

        provider.add("book.pastel.guidebook.vanilla_enchantments.name", "Vanilla Enchantments");
        provider.add(
            "book.pastel.guidebook.vanilla_enchantments.page0.text",
            "The Enchanter is also able to create most enchantments I'm already familiar with.\\\n\\\nThose " +
            "Enchantments can be upgraded to higher levels, too - using the same [Pigment](entry://general/pigment) " +
            "used for creating it."
        );
        provider.add(
            "book.pastel.guidebook.vegetal.page0.text",
            "The answer seemed to be organics! Easily digestible indeed. Quite of obvious in retrospect...\\\nWhen " +
            "digested by the organism, they created an interesting byproduct which I called Vegetal, representing " +
            "the **raw energy of nature**.\\\n\\\nI am sure it will be very useful to me down the line."
        );
        provider.add(
            "book.pastel.guidebook.vulnerability.page0.text",
            "[#](449900)Increased incoming damage[#]() with each additional level."
        );
        provider.add(
            "book.pastel.guidebook.weather_detector.page0.text",
            "Citrine is very sensitive to the energies released during a storm.\\\n\\\nWhen exposed to rain or a " +
            "thunderstorm, it emits a [#](449900)redstone signal[#]()."
        );
        provider.add(
            "book.pastel.guidebook.weather_detector.page1.text",
            "Rain will give a strength 8 signal, thunderstorms a full 15."
        );
        provider.add("book.pastel.guidebook.weather_manipulation.name", "Weather Manipulation");
        provider.add(
            "book.pastel.guidebook.weather_manipulation.page0.text",
            "I would like to note one observation:\\\nNot only does the environment have an influence on the [Fusion " +
            "Shrine](entry://general/fusion_shrine), I have also noticed that the [Fusion Shrine]" +
            "(entry://general/fusion_shrine) has an influence on its surroundings!\\\n\\\nWith the right " +
            "combination of materials, I can influence the weather."
        );
        provider.add(
            "book.pastel.guidebook.weather_manipulation.page1.text",
            "*It's a brand new day\\\nAnd the sun is high\\\nAll the birds are singing\\\nThat you're gonna die*"
        );
        provider.add("book.pastel.guidebook.weather_manipulation.page1.title", "Sunny Weather");
        provider.add(
            "book.pastel.guidebook.weather_manipulation.page2.text",
            "*Knock Knock\\\nWho's there?\\\nAccordion\\\nAccordion who?\\\nAccordion to the forecast, it's going to " +
            "rain tonight.*"
        );
        provider.add("book.pastel.guidebook.weather_manipulation.page2.title", "Rainy Weather");
        provider.add(
            "book.pastel.guidebook.weather_manipulation.page3.text",
            "*Why did the god of thunder drink water?\\\n\\\nBecause he was thorsty.*"
        );
        provider.add("book.pastel.guidebook.weather_manipulation.page3.title", "Thunderstorms");
        provider.add(
            "book.pastel.guidebook.weeping_circlet.page0.text",
            "These hostile underwater temples are hell to maneuver in. Coincidentally, I stumbled upon a [#](bb00bb)" +
            "Heart of The Sea[#]().\\\nThis circlet I built with it allows me to live underwater as if it were the " +
            "most natural thing in the world. I mine and swim faster, require no air and can see better.\\\n\\\nIt " +
            "also heals my little close by Axolotl friends. ♥"
        );
        provider.add(
            "book.pastel.guidebook.weeping_circlet.page1.text",
            "*Have I ever wanted to live underwater?\\\nNo? Whatever, now I can! Time to build an underwater base!*"
        );
        provider.add("book.pastel.guidebook.weeping_gala.amphora.text", "Holds twice as much as a Barrel");
        provider.add("book.pastel.guidebook.weeping_gala.barrel.text", "Compact item storage");
        provider.add("book.pastel.guidebook.weeping_gala.lamp.text", "Emits light if it receives a Redstone signal");
        provider.add(
            "book.pastel.guidebook.weeping_gala.lantern.text",
            "I made two variants. I can switch between then by sneaking while placing it."
        );
        provider.add("book.pastel.guidebook.weeping_gala.light.text", "Bright as can be");
        provider.add("book.pastel.guidebook.weeping_gala.name", "Weeping Galas");
        provider.add(
            "book.pastel.guidebook.weeping_gala.page0.text",
            "Imposing willows adorned with pale leaves. The sprigs weep with a sticky, sweet resin that can be used " +
            "as a [Milk](item://minecraft:milk_bucket) substitute. The wood is incredibly dense, making it much " +
            "slower to burn than most other woods.\\\n\\\nI wonder how they grow so large when their leaves don't " +
            "even have chlorophyll?"
        );
        provider.add("book.pastel.guidebook.weeping_gala.page1.text", "*Gala... milk tree... wait - GALACTOSE!*");
        provider.add("book.pastel.guidebook.weeping_gala.pillar.text", "*dainty*");
        provider.add("book.pastel.guidebook.what_happened.name", "What happened down there?");
        provider.add(
            "book.pastel.guidebook.what_happened.page0.text",
            "*Tracing the history of Imbrifer*.\\\n\\\nThere is no doubt that, despite the lack of light, there must " +
            "once have been a highly advanced civilisation down here. But all I have found are ruins.\\\nWhat " +
            "happened? Surely I can find clues to their whereabouts. Demise? Legacy?"
        );
        provider.add(
            "book.pastel.guidebook.what_happened.page1.checklist.entry0", "Is there a place I have not searched yet?");
        provider.add(
            "book.pastel.guidebook.what_happened.page1.checklist.entry1",
            "Now that Bedrock is no longer the bottom, *what* is there?"
        );
        provider.add(
            "book.pastel.guidebook.what_happened.page1.checklist.entry2",
            "How were the ruins I found in the Overworld created?"
        );
        provider.add(
            "book.pastel.guidebook.what_happened.page2.checklist.entry0", "How did the Black Langast come about?");
        provider.add(
            "book.pastel.guidebook.what_happened.page2.checklist.entry1",
            "Those bones in the Dragonrot Swamps... can they be broken?"
        );
        provider.add(
            "book.pastel.guidebook.what_happened.page2.checklist.entry2",
            "What about those strange Crystals in the Crystal Gardens?"
        );
        provider.add(
            "book.pastel.guidebook.what_happened.page2.checklist.entry3", "Can I find Geodes around here, too?");
        provider.add(
            "book.pastel.guidebook.what_happened.page3.text",
            "I searched far and wide for a place that I might could have missed. But no matter where I looked, there " +
            "was not a single soul in sight."
        );
        provider.add("book.pastel.guidebook.what_happened.page3.title", "Clue: Biomes");
        provider.add(
            "book.pastel.guidebook.what_happened.page4.text",
            "It's like turtles all the way down, isn't it? Until a moment ago I thought Bedrock was indestructible, " +
            "yet here I am. Unbreakable? Possibly. For now, at least."
        );
        provider.add("book.pastel.guidebook.what_happened.page4.title", "Clue: Dimension Floor");
        provider.add(
            "book.pastel.guidebook.what_happened.page5.text",
            "Apparently Downstone was not completely indestructible to the previous inhabitants? It took immense, " +
            "high-tech constructs, but they were able to process the stone and refine it into what I call " +
            "\"Preservation Stone\"."
        );
        provider.add("book.pastel.guidebook.what_happened.page5.title", "Clue: Excavation Sites");
        provider.add(
            "book.pastel.guidebook.what_happened.page6.text",
            "The remains growing in [Black Langast](entry://dimension/black_langast) were actually Resonant Lilies, " +
            "once. What happened here? Does this mean..."
        );
        provider.add("book.pastel.guidebook.what_happened.page6.title", "Clue: Black Langast");
        provider.add(
            "book.pastel.guidebook.what_happened.page7.text",
            "I keep coming across gigantic skeletons. Whether they were really dragons is still written in the stars," +
            " but whatever they were, they were certainly powerful. Did they wipe out the inhabitants and then " +
            "somehow meet their own end?"
        );
        provider.add("book.pastel.guidebook.what_happened.page7.title", "Clue: Dragonbone");
        provider.add(
            "book.pastel.guidebook.what_happened.page8.text",
            "Literally humming stones with a lot of indwelling energy. When interacted with, they shake each other " +
            "until they shatter without any further external influence. Usable as energy source?"
        );
        provider.add("book.pastel.guidebook.what_happened.page8.title", "Clue: Hummingstone");
        provider.add(
            "book.pastel.guidebook.what_happened.page9.text",
            "The dazzling white geodes down here are unlike any I have seen before, and hold immense magical power. " +
            "But why do they only exist here? More questions..."
        );
        provider.add("book.pastel.guidebook.what_happened.page9.title", "Clue: Moonstone");
        provider.add(
            "book.pastel.guidebook.whispy_circlet.page0.text",
            "The bags under my eyes aren't the only evidence of my recent sleep deprivation. There are these " +
            "creatures that emerged straight from the nightmares I skipped - almost as if they feel cheated" +
            ".\\\n\\\nA countersolution: This manifestation of relaxation, no sleep necessary."
        );
        provider.add(
            "book.pastel.guidebook.whispy_circlet.page1.text",
            "After just a few minutes of waring it, I feel physically and mentally refreshed and recover more quickly" +
            " from any negative effects.\\\n\\\n*The pleasures of a good night's sleep.*"
        );

    }
}
