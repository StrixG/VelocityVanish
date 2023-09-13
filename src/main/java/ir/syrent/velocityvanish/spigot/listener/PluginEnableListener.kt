package ir.syrent.velocityvanish.spigot.listener

import ir.syrent.velocityvanish.spigot.hook.DependencyManager
import ir.syrent.velocityvanish.spigot.ruom.Ruom
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.PluginEnableEvent

class PluginEnableListener : Listener {

    init {
        Ruom.registerListener(this)
    }

    @EventHandler
    private fun onPluginEnabled(event: PluginEnableEvent) {
        DependencyManager.hook(event.plugin.name)
    }
}