plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.dv8tion:JDA:5.0.0-beta.20")
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")
    implementation("club.minnced:jda-ktx:0.11.0-beta.20")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}