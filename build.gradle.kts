plugins {
    java
    kotlin("jvm") version "1.4.32"
}

group = "com.leaguelogic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    compileOnly("org.jetbrains:annotations:20.1.0")
    implementation("com.google.code.gson:gson:2.8.6")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
