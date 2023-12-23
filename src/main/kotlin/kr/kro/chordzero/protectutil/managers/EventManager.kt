package kr.kro.chordzero.protectutil.managers

import kr.kro.chordzero.protectutil.Main
import kr.kro.chordzero.protectutil.events.EntityChangeBlockEvent

class EventManager {
    fun registerEvents() {
        Main.instance.let {
            it.server.pluginManager.run {
                registerEvents(EntityChangeBlockEvent, it)
            }
        }
    }
}