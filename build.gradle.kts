plugins {
    java
}

group = "maxwainer.pools"
version = "1.0"

subprojects {
    apply {
        plugin("java")
    }

    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        implementation("redis.clients:jedis:3.5.1")
        implementation("com.zaxxer:HikariCP:4.0.3")
        implementation("org.jetbrains:annotations:20.1.0")
        implementation("com.google.code.gson:gson:2.8.6")
        implementation("com.google.guava:guava:30.1-jre")
        implementation("org.junit.jupiter:junit-jupiter:5.4.2")
        implementation("org.jetbrains:annotations:20.1.0")
    }
}


