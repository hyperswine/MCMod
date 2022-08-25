package com.hyperswine.mcmod

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.minecraft.entity.Entity
import net.minecraft.entity.EntityDimensions
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.entity.mob.PathAwareEntity
import net.minecraft.nbt.NbtCompound
import net.minecraft.network.Packet
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.World

class Car : ModInitializer {
    // var car: CarEntity = CarEntity(TODO(), TODO())

    // register c ar
    final val car: EntityType<CarEntity> = Registry.register(
        Registry.ENTITY_TYPE, Identifier("Car", "CarEntity"),
        FabricEntityTypeBuilder.create<CarEntity>(SpawnGroup.MISC, CarEntity)
            .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    )

    val caraware = Registry.register(
        Registry.ENTITY_TYPE,
        Identifier("cartesting", "car"),
        FabricEntityTypeBuilder.create<CarAware>(SpawnGroup.CREATURE, CarAware::new)
            .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    override fun onInitialize() {
        FabricDefaultAttributeRegistry.register(null, null)
    }
}

class CarAware(entityType: EntityType<out PathAwareEntity>?, world: World?) : PathAwareEntity(entityType, world)

/// So you construct this "directly" instead of SECONDARY
class CarEntity(type: EntityType<*>?, world: World?) : Entity(type, world) {
    // attributes, like accel, curr_velocity?
    // acceleration depends on how much the dude is stepping on the gas
    // there is a max velocity though, so even while your accelerating and your v = max, you wont
    // gain anymore speed

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

    companion object CarEntity : EntityType.EntityFactory<Entity> {
        override fun create(type: EntityType<Entity>?, world: World?): CarEntity? {
            return null
        }
    }
}
