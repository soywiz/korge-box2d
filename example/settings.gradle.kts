pluginManagement { repositories {  mavenLocal(); mavenCentral(); google(); gradlePluginPortal()  }  }

plugins {
    //id("com.soywiz.kproject.settings") version "0.0.1-SNAPSHOT"
    //id("com.soywiz.kproject.settings") version "0.1.3"
    id("com.soywiz.kproject.settings") version "0.2.1"
}

rootProject.name = "${rootDir.parentFile.name}-example"

kproject("./deps")
