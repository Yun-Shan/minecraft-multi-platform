# Minecraft Multi-Platform Template


## How to use
1. clone this repo(or you can create new github repo use this template repo).
2. rename `minecraft-multi-platform` to your project name in `/settings.gradle`.
3. rename mod_id `example_mcmp` to your mod id (at `/gradle.properties` and `/mod/common/src/main/java/org/yunshanmc/example_mcmp/mod/CommonModMain.java`).
4. edit properties in `/gradle.properties` for your mod.
5. edit versions in `/gradle/libs.versions.toml` for your mod.
6. reload Gradle project in your IDE.
7. rename all `org.yunshanmc.example_mcmp` to your mod base package name.
8. you can develop multi-platform minecraft mod/plugin project now!

## update mod/plugin version
edit version in `/mod/gradle.properties` and `/plugin/gradle.properties`
