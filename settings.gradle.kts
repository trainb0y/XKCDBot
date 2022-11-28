pluginManagement {
    plugins {
        // Update this in libs.version.toml when you change it here
        kotlin("jvm") version "1.7.21"
        kotlin("plugin.serialization") version "1.7.21"

        id("com.github.johnrengelman.shadow") version "7.1.2"
    }
}

rootProject.name = "XKCDBot"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}
