plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.getByName<Jar>("jar") {
    archiveBaseName.set("frontend")
}

sourceSets {
    main {
        resources {
            srcDir("src/main/resources/static")
        }
    }
}