package kr.kro.chordzero.protectutil.events

import kr.kro.chordzero.protectutil.Main
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityChangeBlockEvent

object EntityChangeBlockEvent: Listener {
    @EventHandler
    fun onEntityChangeBlock(e: EntityChangeBlockEvent) {
        // farmland jump protect
        run {
            if (!Main.instance.config.getBoolean("protect.entity.jumping_on_farmland")) return
            if (e.block.type != Material.FARMLAND || e.to != Material.DIRT) return

            e.isCancelled = true
        }
    }
}