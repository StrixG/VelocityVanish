package ir.syrent.velocityvanish.spigot.hook

import ir.syrent.velocityvanish.spigot.VelocityVanishSpigot
import ir.syrent.velocityvanish.spigot.storage.Settings

object DependencyManager {

    var protocolLibHook: ProtocolLibHook = ProtocolLibHook()
        private set
    var placeholderAPIHook: PlaceholderAPIHook = PlaceholderAPIHook(VelocityVanishSpigot.instance)
        private set
    var essentialsXHook: EssentialsXHook = EssentialsXHook()
        private set
    var sunlightHook: SunlightHook = SunlightHook()
        private set
    var squareMapHook: SquareMapHook = SquareMapHook()
        private set
    var discordSRVHook: DiscordSRVHook = DiscordSRVHook()
        private set
    var cmiHook: CMIHook = CMIHook()
        private set

    fun hook(name: String) {
        when (name) {
            protocolLibHook.name -> {
                ProtocolLibHook().apply {
                    this.register()
                    protocolLibHook = this
                }
            }

            essentialsXHook.name -> {
                EssentialsXHook().apply {
                    this.register()
                    essentialsXHook = this
                }
            }

            sunlightHook.name -> {
                SunlightHook().apply {
                    this.register()
                    sunlightHook = this
                }
            }

            "EnhancedVelocity" -> {
                EnhancedVelocityHook().apply {
                    if (Settings.velocitySupport) {
                        this.register()
                    }
                }
            }

            placeholderAPIHook.name -> {
                PlaceholderAPIHook(VelocityVanishSpigot.instance).apply {
                    this.register()
                    placeholderAPIHook = this
                }
            }

            squareMapHook.name -> {
                SquareMapHook().apply {
                    this.register()
                    squareMapHook = this
                }
            }

            discordSRVHook.name -> {
                DiscordSRVHook().apply {
                    this.register()
                    discordSRVHook = this
                }
            }

            cmiHook.name -> {
                CMIHook().apply {
                    this.register()
                    cmiHook = this
                }
            }
        }
    }
}