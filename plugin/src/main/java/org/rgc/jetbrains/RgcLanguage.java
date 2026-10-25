package org.rgc.jetbrains;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * The RGC programming language.
 *
 * Language IDs are referenced from {@code plugin.xml} and the IntelliJ
 * platform registry. A Language subclass is the root object of every
 * PSI-based feature.
 */
public final class RgcLanguage extends Language {

    public static final RgcLanguage INSTANCE = new RgcLanguage();

    private RgcLanguage() {
        super("RGC");
    }

    @Override
    public @NotNull String getDisplayName() {
        return "RGC";
    }
}