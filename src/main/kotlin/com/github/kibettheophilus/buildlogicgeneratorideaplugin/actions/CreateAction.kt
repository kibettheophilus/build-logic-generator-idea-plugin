package com.github.kibettheophilus.buildlogicgeneratorideaplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.io.File


class CreateAction : AnAction() {
    override fun actionPerformed(event: AnActionEvent) {
        val currentProject = event.project
        val directory = File(currentProject?.basePath, "build-logic")
        if (directory.mkdir()) {
            val conventions = File(directory, "conventions")
            val conventionsDir = File(directory, "conventions/src/main/kotlin")
            conventionsDir.mkdirs()
            val samplePlugin = File(conventionsDir,"AndroidApplicationConventionPlugin.kt")
            if (samplePlugin.createNewFile()){
                val sampleSetup = """
                    import org.gradle.api.Plugin
                    import org.gradle.api.Project

                    class SamplePlugin: Plugin<Project> {
                        override fun apply(target: Project) {
                            TODO("Not yet implemented")
                        }
                    }

                """.trimIndent()
                samplePlugin.writeText(sampleSetup)
            }
            val settings = File(directory, "settings.gradle.kts")
            if (settings.createNewFile()) {
                println("settings file created successfully")
                val settingsSetup = """
                    dependencyResolutionManagement {
                        repositories {
                            google()
                            mavenCentral()
                        }
                        versionCatalogs {
                            create("libs") {
                                from(files("../gradle/libs.versions.toml"))
                            }
                        }
                    }

                    rootProject.name = "build-logic"
                    include(":conventions")
                """.trimIndent()
                settings.writeText(settingsSetup)
            }
            val conventionBuild = File(conventions, "build.gradle.kts")
            if (conventionBuild.createNewFile()) {
                val buildSetup = """
                    plugins {
                        `kotlin-dsl`
                    }

                    group = "com.example.buildlogic"

                    java {
                        sourceCompatibility = JavaVersion.VERSION_11
                        targetCompatibility = JavaVersion.VERSION_11
                    }

                    dependencies {
                        compileOnly("com.example.library")
                    }
                    gradlePlugin {
                        plugins {
                            register("androidApplication") {
                                id = "com.example.android.application"
                                implementationClass = "AndroidApplicationConventionPlugin"
                            }
                        }
                    }
                """.trimIndent()

                conventionBuild.writeText(buildSetup)
            }
        } else {
            println("failed to create path")
        }
    }
}