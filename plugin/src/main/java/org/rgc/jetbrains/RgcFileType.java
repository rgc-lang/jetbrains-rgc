package org.rgc.jetbrains;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * File type for {@code *.rg} files.
 *
 * Referenced from {@code plugin.xml} via {@code fieldName = "INSTANCE"}.
 */
public final class RgcFileType extends LanguageFileType {

    public static final RgcFileType INSTANCE = new RgcFileType();

    private RgcFileType() {
        super(RgcLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "RGC";
    }

    @Override
    public @NotNull String getDescription() {
        return "RGC source file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "rg";
    }

    @Override
    public @Nullable Icon getIcon() {
        return null;
    }
}