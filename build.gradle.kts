import dev.buildopt.pilot.GeneratePilotManifest
import org.gradle.api.tasks.bundling.AbstractArchiveTask

plugins {
    base
}

group = "dev.buildopt.pilot"
version = "1.0.0"

allprojects {
    group = rootProject.group
    version = rootProject.version
}

subprojects {
    apply(plugin = "java-library")

    repositories {
        mavenCentral()
    }

    extensions.configure<JavaPluginExtension> {
        toolchain {
            languageVersion = JavaLanguageVersion.of(17)
        }
    }

    dependencies {
        "testImplementation"(platform("org.junit:junit-bom:5.11.4"))
        "testImplementation"("org.junit.jupiter:junit-jupiter")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release = 17
    }
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        maxParallelForks = 1
    }
    tasks.withType<AbstractArchiveTask>().configureEach {
        isPreserveFileTimestamps = false
        isReproducibleFileOrder = true
    }
}

val generatePilotManifest = tasks.register<GeneratePilotManifest>("generatePilotManifest") {
    entries.set(subprojects.map { it.path })
    outputFile.set(layout.buildDirectory.file("pilot/manifest.txt"))
}

tasks.register("pilotBuild") {
    group = "verification"
    description = "Builds every declared pilot deliverable."
    dependsOn(generatePilotManifest)
    dependsOn(subprojects.map { it.path + ":build" })
    dependsOn(":app:distZip")
}
