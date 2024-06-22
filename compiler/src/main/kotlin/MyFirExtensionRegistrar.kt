import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrar

class MyFirExtensionRegistrar : FirExtensionRegistrar() {
    override fun ExtensionRegistrarContext.configurePlugin() {
        // add factories of FirExtensions by using the special syntax
        // ex) +::MyFirExtension
    }
}
