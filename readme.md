Minecraft Development IntelliJ Plugin [![forthebadge](http://forthebadge.com/images/badges/made-with-crayons.svg)](http://forthebadge.com)
==========================================================================================================================================
[![GitHub Stars](https://img.shields.io/github/stars/DemonWav/MinecraftDevIntelliJ.svg)](https://github.com/DemonWav/MinecraftDevIntelliJ/stargazers) [![GitHub Issues](https://img.shields.io/github/issues/DemonWav/MinecraftDevIntelliJ.svg)](https://github.com/DemonWav/MinecraftDevIntelliJ/issues) [![TeamCity Build Status](https://img.shields.io/teamcity/http/ci.demonwav.com/s/MinecraftDevIntelliJ_Build.svg)](https://ci.demonwav.com/viewType.html?buildTypeId=MinecraftDevIntelliJ_Build) [![Current Release](https://img.shields.io/badge/release-alpha--0.1.1-lightgrey.svg)](https://plugins.jetbrains.com/plugin/8327)

Installation
------------

This plugin is available on the [Jetbrains IntelliJ plugin repository](https://plugins.jetbrains.com/plugin/8327).

Because of this, you can install the plugin through IntelliJ's internal plugin browser. Navigate to
`File -> Settings -> Plugins` and click the `Browser Repositories...` button at the bottom of the window. In the search
box, simply search for `Minecraft` and this plugin will be the only result it shows. You can install it from there and
restart IntelliJ to activate the plugin.

Building
--------

Make sure you have Java 8 installed.

Build the plugin with:

`./gradlew buildPlugin`

The output .zip file for the plugin will be in `build/distributions`.

Test the plugin in IntelliJ with:

`./gradlew runIdea`

The [Gradle IntelliJ Plugin](https://github.com/JetBrains/gradle-intellij-plugin)
will handle downloading the IntelliJ dependencies and packaging the
plugin.

Style Guide
-----------

This project will follow DemonWav's Java style guidelines (lol, Google's
style slightly modified). Link [here](http://www.demonwav.com/style).

Developers
----------

[**@DemonWav** - Kyle Wood](https://github.com/DemonWav)

#### **Contributors**

- [**@gabizou** - Gabriel Harris-Rouquette](https://github.com/gabizou)
- [**@kashike**](https://github.com/kashike)

License
-------

This project is licensed under [MIT](license.txt).

Supported Platforms
-------------------

- [![Bukkit Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/Bukkit.png) **Bukkit**](https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/browse)
- [![Sponge Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/Sponge.png) **Sponge**](https://www.spongepowered.org/)
- [![Forge Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/Forge.png) **Minecraft Forge**](http://minecraftforge.net/forum)
- [![LiteLoader Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/LiteLoader.png) **LiteLoader**](http://www.liteloader.com/)
- [![BungeeCord Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/BungeeCord.png) **BungeeCord**](https://www.spigotmc.org/wiki/bungeecord/)
- Misc Bukkit Forks
  * [![Spigot Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/Spigot.png) Spigot](https://spigotmc.org/)
  * [![Paper Icon](https://github.com/DemonWav/MinecraftDevIntelliJ/raw/master/src/main/resources/assets/platform/icons/Paper.png) Paper](https://paper.emc.gs)
