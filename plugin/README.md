# jetbrains-rgc plugin (skeleton)

A minimal IntelliJ Platform plugin for RGC, written in Java and built with the
IntelliJ Platform Gradle Plugin 2.x.

## What works

- Registers the `RGC` language and `*.rg` file type (visible in the project
  tree and editor tab).

## What it is a starting point for

A full-featured plugin would add:

- A syntax highlighter (or load the bundled TextMate grammar programmatically)
- An LSP client connecting to `rgc lsp --stdio` (hover, completion,
  diagnostics, formatting)
- Build / run / test actions (`rgc`, `rgc run`, `rgc test`)

For syntax highlighting *today* without compiling anything, import the
TextMate bundle in `../textmate/RGC.tmBundle` (Settings → Editor → TextMate
Bundles).

## Build

Requirements: JDK 17. Gradle 9 is provided by the wrapper.

```sh
cd plugin
./gradlew buildPlugin
```

Install `build/distributions/jetbrains-rgc-*.zip` via
`Settings → Plugins → ⚙ → Install Plugin from Disk…`.

IntelliJ Platform and Gradle versions in `build.gradle.kts` / `gradle/wrapper`
are pinned; update them when you adopt the skeleton.