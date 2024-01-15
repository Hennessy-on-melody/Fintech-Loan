import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.0"
	kotlin("plugin.spring") version "1.6.0"
	kotlin("plugin.jpa") version "1.6.0"

	id("org.springframework.boot") version "2.7.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

repositories {
	mavenCentral()
}

allprojects {
	group = "com.zero"

	repositories {
		mavenCentral()
	}
}

subprojects {
	apply {
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305-strict")
			jvmTarget = "11"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter:2.6.3")
		implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.0")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.0")
		testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.3")
	}
}
