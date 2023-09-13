package ir.syrent.velocityvanish.spigot.hook

import github.scarsz.discordsrv.DiscordSRV

class DiscordSRVHook : Dependency("DiscordSRV") {

    lateinit var discordSRV: DiscordSRV

    init {
        if (exists) {
            discordSRV = DiscordSRV.getPlugin()
        }
    }

    override fun features(): List<String> {
        return mutableListOf(
            "Send join/leave message on vanish toggle."
        )
    }

}