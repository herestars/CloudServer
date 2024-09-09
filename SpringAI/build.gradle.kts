dependencies {
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-ai")
    implementation("org.apache.dubbo:dubbo-spring-boot-starter")
    implementation("org.apache.dubbo:dubbo-registry-nacos")
    implementation("com.google.protobuf:protobuf-java:3.19.6")
    implementation("com.google.protobuf:protobuf-java-util:3.19.6")
    implementation(project(":dubbo-interface"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-configuration-processor")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

group = "com.herestars.ai"
version = "0.1-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "3.2.4"
}

apply(plugin = "org.springframework.boot")