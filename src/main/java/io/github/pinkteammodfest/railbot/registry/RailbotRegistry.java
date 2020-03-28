package io.github.pinkteammodfest.railbot.registry;

import io.github.pinkteammodfest.railbot.Railbot;
import io.github.pinkteammodfest.railbot.robot.RobotCore;
import io.github.pinkteammodfest.railbot.robot.RobotCoreType;
import io.github.pinkteammodfest.railbot.robot.RobotFeature;
import io.github.pinkteammodfest.railbot.robot.RobotFeatureType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;

public final class RailbotRegistry {

  public static DefaultedRegistry<RobotCoreType<?>> CORE = register("core", new DefaultedRegistry<>(Railbot.id("furnace_core").toString()));
  public static DefaultedRegistry<RobotFeatureType<?>> FEATURE = register("feature", new DefaultedRegistry<>(Railbot.id("place_rail").toString()));

  private static <R extends MutableRegistry<?>> R register(String registryName, R mutableRegistry) {
    return Registry.REGISTRIES.add(Railbot.id(registryName), mutableRegistry);
  }
}
