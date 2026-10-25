# Publishing RGC to JetBrains Marketplace

This document describes how to publish the `jetbrains-rgc` plugin to the
[JetBrains Marketplace](https://plugins.jetbrains.com).

## 1. Build the plugin

```sh
cd plugin
./gradlew buildPlugin
```

The installable plugin archive is produced at:

```
plugin/build/distributions/jetbrains-rgc-0.1.0.zip
```

## 2. Create a GitHub Release (optional but recommended)

Tag the repository (`v0.1.0`), then create a Release and attach the zip:

```sh
gh release create v0.1.0 \
  plugin/build/distributions/jetbrains-rgc-0.1.0.zip \
  --title "jetbrains-rgc 0.1.0" \
  --notes "Initial release: RGC file type + TextMate grammar for JetBrains IDEs."
```

This gives users a distribution channel independent of the Marketplace.

## 3. Upload to JetBrains Marketplace

1. Sign in at <https://plugins.jetbrains.com> with a JetBrains account.
2. Go to **Your plugins → Create new plugin** and fill in:
   - **Name**: `jetbrains-rgc`
   - **Description**: RGC language support for JetBrains IDEs
   - **License**: Apache-2.0
   - **Tags**: `rgc`, `language`, `syntax highlighting`
3. Upload the zip from `plugin/build/libs/jetbrains-rgc-0.1.0.zip`.
4. JetBrains runs an automatic verification; the plugin becomes visible after
   approval. Updates are uploaded the same way (the version number in
   `build.gradle.kts` must be bumped for each release).

## 4. Notes

- The current plugin registers the RGC file type/language and ships the
  TextMate grammar for syntax highlighting. A future version should add an LSP
  client (`rgc lsp --stdio`), completion, and build/run/test actions.
- IntelliJ Platform and Kotlin versions in `plugin/build.gradle.kts` must be
  updated periodically; see the [IntelliJ Platform Gradle Plugin docs](https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html).