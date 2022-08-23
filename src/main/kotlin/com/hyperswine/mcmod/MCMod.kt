package com.hyperswine.mcmod

import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object MCMod : ModInitializer {
    private const val MOD_ID = "mcmod"
    override fun onInitialize() {
        println("MC mod has been initialized.")
    }
}