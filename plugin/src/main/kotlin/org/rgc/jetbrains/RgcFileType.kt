package org.rgc.jetbrains

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

/**
 * File type for `*.rg` files.
 *
 * Referenced from `plugin.xml` via `fieldName = "INSTANCE"`.
 */
class RgcFileType private constructor() : LanguageFileType(RgcLanguage.INSTANCE) {

    override fun getName(): String = "RGC"

    override fun getDescription(): String = "RGC source file"

    override fun getDefaultExtension(): String = "rg"

    override fun getIcon(): Icon? = null

    companion object {
        @JvmStatic
        val INSTANCE: RgcFileType = RgcFileType()
    }
}