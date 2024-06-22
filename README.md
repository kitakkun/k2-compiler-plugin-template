# K2 Compiler Plugin Template

This is a template project to get started with Kotlin Compiler Plugin development(K2).

## Module setup

- `compiler`: This module should contain the Kotlin Compiler Plugin implementation. It is where the core logic of the plugin is developed.
- `core`: This is the runtime library required by the compiler plugin. It should contain annotation classes and any predefined declarations that the
  plugin will use.
- `test`: This module is preconfigured to test the compiler plugin.

## Getting Started

1. Clone the repository: `git clone git@github.com:kitakkun/k2-compiler-plugin-template.git`
2. Open the project with IDE (IntelliJ IDEA or Android Studio are recommended)
3. Implement your plugin: See [greeting-plugin](https://github.com/kitakkun/greeting-plugin) to understand how to extend Kotlin Compiler.
4. Build and Test:
    - Use the `test` module to check if your compiler plugin is working as expected. Note that FIR operations or IR operations can easily break the
      original source of programs. Therefore, you need to test more carefully than in normal Kotlin projects.

## Predefined classes in `compiler` module

- `MyCompilerPluginRegistrar`: This is preconfigured `CompilerPluginRegistrar` implementation. Generally, you may not need to edit this file.
- `MyFirExtensionRegistrar`: Add factories of FirExtensions by using special syntax: `+::MyFirExtension`.
- `MyIrGenerationExtension`: Transform or accept `IrModuleFragment` to modify or analyze IR nodes.

## License

This project is licenced under the MIT license. See the [LICENSE](LICENSE) file for details.
