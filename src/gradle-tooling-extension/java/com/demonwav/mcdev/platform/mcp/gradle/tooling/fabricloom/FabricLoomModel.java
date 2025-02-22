/*
 * Minecraft Dev for IntelliJ
 *
 * https://minecraftdev.org
 *
 * Copyright (c) 2023 minecraft-dev
 *
 * MIT License
 */

package com.demonwav.mcdev.platform.mcp.gradle.tooling.fabricloom;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface FabricLoomModel {

    File getTinyMappings();

    Map<String, List<DecompilerModel>> getDecompilers();

    boolean getSplitMinecraftJar();

    Map<String, List<String>> getModSourceSets();

    interface DecompilerModel {

        String getName();

        String getTaskName();

        String getSourcesPath();
    }
}
