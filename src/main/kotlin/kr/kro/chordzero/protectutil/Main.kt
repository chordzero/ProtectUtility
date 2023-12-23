package kr.kro.chordzero.protectutil

import kr.kro.chordzero.protectutil.managers.EventManager
import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class Main : JavaPlugin() {
    companion object {
        lateinit var instance: Main
    }

    override fun onEnable() {
        instance = this
        EventManager().registerEvents()

        saveConfig()
        val configFile = File(dataFolder, "config.yml")
        if (configFile.length() == 0L) {
            config.options().copyDefaults(true)
            saveConfig()
        }
    }

    override fun onDisable() {}
}
