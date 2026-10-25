# RGC for JetBrains IDEs (IntelliJ IDEA, PyCharm, CLion, ...)

[![JetBrains Marketplace Version](https://img.shields.io/jetbrains/plugin/v/35470?color=00A060&label=Marketplace%20Version)](https://plugins.jetbrains.com/plugin/35470-rgc-language-support)
[![JetBrains Marketplace Downloads](https://img.shields.io/jetbrains/plugin/d/35470?color=00A060&label=Marketplace%20Downloads)](https://plugins.jetbrains.com/plugin/35470-rgc-language-support)
[![JetBrains Marketplace Rating](https://img.shields.io/jetbrains/plugin/r/rating/35470?color=F0D010&label=Marketplace%20Rating)](https://plugins.jetbrains.com/plugin/35470-rgc-language-support)
[![License](https://img.shields.io/badge/license-Apache--2.0-F0D010?style=flat-square&labelColor=333333&color=00A060)](LICENSE)

**RGC Language Support** is published on the
[JetBrains Marketplace](https://plugins.jetbrains.com/plugin/35470-rgc-language-support)
(plugin ID `35470`, XML ID `org.rgc.jetbrains`).

Two ways to use RGC in JetBrains IDEs:

## Option 1: Install from Marketplace (recommended)

1. Open **Settings → Plugins → Marketplace**
2. Search for **RGC Language Support**
3. Click **Install** and restart the IDE

Or open the [marketplace page](https://plugins.jetbrains.com/plugin/35470-rgc-language-support) and click **Install to IDE**.

## Option 2: Build from source

[`plugin/`](plugin) is the IntelliJ Platform plugin source (Java, Gradle,
[IntelliJ Platform Gradle Plugin 2.x](https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html)).

Requires JDK 17 and Gradle 9 (the wrapper `./gradlew` handles this).

```sh
cd plugin
./gradlew buildPlugin
# install build/distributions/jetbrains-rgc-*.zip via Settings → Plugins → ⚙ → Install Plugin from Disk
```

See [PUBLISHING.md](PUBLISHING.md) for release and Marketplace upload steps.

## Option 3: TextMate bundle (zero-build, syntax highlighting)

Import the bundled TextMate grammar:

1. `Settings → Editor → TextMate Bundles`
2. Click **+** and select the [`textmate/RGC.tmBundle`](textmate/RGC.tmBundle) directory
3. Apply — `.rg` files get RGC syntax highlighting automatically

## Embedding the Marketplace widget on a website

JetBrains provides an interactive plugin card widget. It requires JavaScript, so it
only works on a real webpage (not in a GitHub README):

```html
<script src="https://plugins.jetbrains.com/assets/scripts/mp-widget.js"></script>
<script>
  MarketplaceWidget.setupMarketplaceWidget('card', 35470, "#yourelement");
</script>
```

Replace `#yourelement` with the `id` of an element on your page, for example:

```html
<div id="yourelement"></div>
```

The RGC language server protocol is documented in
[vscode-rgc](https://github.com/rgc-lang/vscode-rgc/blob/main/docs/lsp-server-contract.md):
the server is started as `rgc lsp --stdio`.

## License

Apache-2.0. See [LICENSE](LICENSE).