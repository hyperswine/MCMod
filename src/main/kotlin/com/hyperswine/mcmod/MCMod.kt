package com.hyperswine.mcmod

import net.fabricmc.api.ModInitializer

object MCMod : ModInitializer {
    private const val MOD_ID = "mcmod"
    override fun onInitialize() {
        println("MC mod has been initialized.")
    }
}
