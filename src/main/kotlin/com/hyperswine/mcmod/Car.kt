package com.hyperswine.mcmod

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.minecraft.entity.Entity
import net.minecraft.entity.EntityType
import net.minecraft.nbt.NbtCompound
import net.minecraft.network.Packet
import net.minecraft.world.World

class Car : ModInitializer {
    var car: CarEntity = TODO()

    override fun onInitialize() {
        FabricDefaultAttributeRegistry.register(null, null)
    }
}

class CarEntity(type: EntityType<*>?, world: World?) : Entity(type, world) {
    // attributes, like accel, curr_velocity?
    // acceleration depends on how much the dude is stepping on the gas
    // there is a max velocity though, so even while your accelerating and your v = max, you wont gain anymore speed

    var w_pressed: Boolean = false
    var a_pressed: Boolean = false
    var s_pressed: Boolean = false
    var d_pressed: Boolean = false

    var accel: ArrayList<Float> = ArrayList()
    var velocity: ArrayList<Float> = ArrayList()



    override fun initDataTracker() {
        TODO("Not yet implemented")
    }

    override fun readCustomDataFromNbt(nbt: NbtCompound?) {
        TODO("Not yet implemented")
    }

    override fun writeCustomDataToNbt(nbt: NbtCompound?) {
        TODO("Not yet implemented")
    }

    override fun createSpawnPacket(): Packet<*> {
        TODO("Not yet implemented")
    }

}