plugins {
    id("earth.terrarium.cloche") version "0.10.7"
}

sourceSets.main {
    resources.srcDir("src/main/generated")
}

repositories {
    cloche.librariesMinecraft()

    mavenCentral()

    cloche {
        mavenNeoforgedMeta()
        mavenNeoforged()
    }

    maven(url = "https://maven.shedaniel.me/") // Cloth config, REI

    maven(url = "https://api.modrinth.com/maven") // Additional Entity Attributes, Jade

    maven(url = "https://maven.terraformersmc.com/") // EMI

    // Curios
    maven(url = "https://maven.theillusivec4.top/") {
        name = "Illusive Soulworks maven"
    }

    // modonomicon
    maven(url = "https://dl.cloudsmith.io/public/klikli-dev/mods/maven/") {
        content {
            includeGroup("com.klikli_dev")
        }
    }

    maven(url = "https://repo.unascribed.com") // Ears API

    maven(url = "https://maven2.bai.lol") // wthit

    // Datagen dependencies
    maven(url = "https://maven.createmod.net") // Create
    maven(url = "https://mvn.devos.one/snapshots") // Registrate

    maven(url = "https://cursemaven.com") // (sigh) Gobber
}

cloche {
    minecraftVersion = "1.21.1"

    metadata {
        modId = "pastel"
        name = "Pastel"

        description = "Do flowers dream of the moon?"

        license = "lGPL3"

        url = "https://www.curseforge.com/minecraft/mc-mods/pastel"
        sources = "https://github.com/terrarium-earth/Pastel"
        issues = "https://github.com/terrarium-earth/Pastel/issues"

        icon = "assets/pastel/icon.png"

        dependency {
            modId = "modonomicon"
        }

        author("Azzyypaaras", "azzy@terrarium.earth")
        author("Dafuqs")

        contributor("Salad Cat (OST)")
        contributor("MsRandom", "ashley@terrarium.earth")
        contributor("Robotgiggle")
        contributor("pizzacalz0ne")
        contributor("Lily")
        contributor("HoneyHive (Illustrations)")
        contributor("Electro_593")
        contributor("800020h")
        contributor("Quarx_")
        contributor("Athebyne")
        contributor("Noaaaaaaaaan")
    }

    singleTarget {
        neoforge {
            loaderVersion = "21.1.172"

            accessWideners.from(
                "src/main/pastel.accessWidener",
                "src/main/pastel.data.accessWidener",
                "src/main/pastel.todo.accessWidener",
            )

            mixins.from(
                "src/main/mixins/pastel.mixins.json",
                "src/main/mixins/pastel.client.mixins.json",
            )

            // TODO Remove these
            mixins.from(
                "src/main/mixins/revelationary.mixins.json",
            )

            val additionalEntityAttributes =
                module(group = "maven.modrinth", name = "additionalentityattributes", version = "2.0.0+1.21.1-neoforge")
            val jgrapht = module(group = "org.jgrapht", name = "jgrapht-core", version = "1.5.2")
            val jheaps = module(group = "org.jheaps", name = "jheaps", version = "0.14")

            include(additionalEntityAttributes)
            include(jgrapht)
            include(jheaps)

            include(module(group = "org.apfloat", name = "apfloat", version = "1.10.1"))

            dependencies {
                compileOnly(module(group = "maven.modrinth", name = "jade", version = "15.10.0+neoforge"))

                modApi(module(group = "me.shedaniel.cloth", name = "cloth-config-neoforge", version = "15.0.140"))

                modImplementation(
                    module(
                        group = "com.klikli_dev",
                        name = "modonomicon-1.21.1-neoforge",
                        version = "1.114.3"
                    )
                ) {
                    exclude(group = "com.klikli_dev")
                    exclude(group = "mezz.jei")
                }

                modCompileOnly(
                    module(
                        group = "me.shedaniel",
                        name = "RoughlyEnoughItems-neoforge",
                        version = "16.0.788"
                    )
                )

                modImplementation(additionalEntityAttributes)
                implementation(jgrapht)
                implementation(jheaps)

                modCompileOnly(module(group = "mcp.mobius.waila", name = "wthit-api", version = "neo-12.4.1"))

                modImplementation("dev.emi:emi-neoforge:1.1.19+1.21.1")

                modCompileOnly("maven.modrinth:colorful-hearts:10.3.8") { isTransitive = false }
                modCompileOnly("maven.modrinth:sodium:mc1.21.1-0.6.5-neoforge") { isTransitive = false }
                modCompileOnly("com.unascribed:ears-api:1.4.6")
                modCompileOnly("maven.modrinth:create:1.21.1-6.0.4") { isTransitive = false }
                modCompileOnly("maven.modrinth:lodestonelib:1.7.0") { isTransitive = false }
                modCompileOnly("maven.modrinth:malum:1.20.1-1.6.5") { isTransitive = false }
                modCompileOnly("maven.modrinth:travelersbackpack:1.21.1-10.1.20")
                modCompileOnly("maven.modrinth:botania:1.20.1-448-forge")
                modCompileOnly("maven.modrinth:vanity:xWfEA0yC")
            }

            dependencies {
                val curios =
                    module(group = "top.theillusivec4.curios", name = "curios-neoforge", version = "9.5.1+1.21.1")

                modCompileOnly(curios.copy()) {
                    artifact {
                        classifier = "api"
                    }
                }

                modRuntimeOnly(curios)
            }

            data {
                dependencies {
                    modImplementation(
                        module(
                            group = "org.appliedenergistics",
                            name = "appliedenergistics2",
                            version = "19.2.12"
                        )
                    )
                    modImplementation(
                        "com.simibubi.create:create-1.21.1:6.0.6-99"
                    ) { isTransitive = false }
                    modImplementation("com.tterrag.registrate:Registrate:MC1.21-1.3.0+62")
                    modImplementation("maven.modrinth:vein-mining:bAYRag9u") // todo: is this needed?
                    modImplementation("maven.modrinth:waystones:21.1.19+neoforge-1.21.1")
                    modImplementation("maven.modrinth:the-bumblezone:7.10.0+1.21.1-neoforge")
                    modImplementation("maven.modrinth:farmers-delight:1.21.1-1.2.8")
                    modImplementation("maven.modrinth:supplementaries:neoforge_1.21-3.3.0")
                    modImplementation("maven.modrinth:malum:1.7.3.1")
                    modImplementation("maven.modrinth:chalk-mod:1.6.10")
//                    modImplementation("curse.maven:gobber-301700:5788529")
                    modImplementation("maven.modrinth:forgedpaginatedadvancements:0.0.1+1.21.1")
                    modImplementation("maven.modrinth:moonlight:1.21-2.19.5-neoforge")
                    modImplementation("maven.modrinth:balm:21.0.46+neoforge-1.21.1")
                    modImplementation("maven.modrinth:lodestonelib:1.7.1")
                }
            }
            test()

            runs {
                server()
                client {
                    client()
                    arguments.addAll("--username", "KatTheFox", "--uuid", "85e987e5-bb15-4e17-ba2b-cc6d3adfc539");
                }

                data()
            }
        }
    }

    mappings {
        official()
        parchment("2024.11.17")
    }
}

