plugins {
    java
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.1.5"
}

val alibabaVersion = "2023.0.1.0"
val springCloudVersion by extra("2023.0.1")

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.spring.io/milestone/")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/public/")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/spring/")
    }
    mavenLocal()
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:$springCloudVersion")
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(17)
        }
    }

    group = "org.stars"
    version = "0.0.1-SNAPSHOT"

    configurations {
        compileOnly {
            extendsFrom(configurations.annotationProcessor.get())
        }
    }

    configurations.all {
        exclude(module = "slf4j-simple")
    }

    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.spring.io/milestone/")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/public/")
        }
        maven {
            url = uri("https://maven.aliyun.com/repository/spring/")
        }
        mavenLocal()
    }

    dependencies {
        implementation(platform("com.alibaba.cloud:spring-cloud-alibaba-dependencies:$alibabaVersion"))
        implementation(platform("org.apache.dubbo:dubbo-bom:3.3.0-beta.2"))
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}