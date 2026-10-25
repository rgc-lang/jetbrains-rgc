package org.rgc.jetbrains

import com.intellij.lang.Language

/**
 * The RGC programming language.
 *
 * Language IDs are referenced from `plugin.xml` and the IntelliJ platform
 * registry. A Language subclass is the root object of every PSI-based feature.
 */
class RgcLanguage private constructor() : Language("RGC") {
    companion object {
        @JvmStatic
        val INSTANCE: RgcLanguage = RgcLanguage()
    }
}