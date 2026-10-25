# RGC for JetBrains IDEs (IntelliJ IDEA, PyCharm, CLion, ...)

Two ways to use RGC in JetBrains IDEs:

## Option 1: TextMate bundle (zero-build, syntax highlighting)

Import the bundled TextMate grammar:

1. `Settings → Editor → TextMate Bundles`
2. Click **+** and select the [`textmate/RGC.tmBundle`](textmate/RGC.tmBundle) directory
3. Apply — `.rg` files get RGC syntax highlighting automatically

This works in every JetBrains IDE with no compilation.

## Option 2: IntelliJ Platform plugin (build from source)

[`plugin/`](plugin) contains a minimal IntelliJ Platform plugin skeleton
(Gradle, Kotlin) that registers the RGC language and file type. It is a
starting point for a full LSP-based plugin (hover, completion, diagnostics,
build/run actions).

```sh
cd plugin
./gradlew buildPlugin
# install build/libs/*.zip via Settings → Plugins → ⚙ → Install Plugin from Disk
```

The language server protocol is documented in
[vscode-rgc](https://github.com/rgc-lang/vscode-rgc/blob/main/docs/lsp-server-contract.md):
the server is started as `rgc lsp --stdio`.

## License

Apache-2.0. See [LICENSE](LICENSE).