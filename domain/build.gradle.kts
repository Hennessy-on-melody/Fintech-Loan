plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")

    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")
    runtimeOnly("mysql:mysql-connector-java:8.0.32")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}