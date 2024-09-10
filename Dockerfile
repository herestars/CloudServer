# 使用官方Java 17 Runtime作为父镜像
FROM openjdk:17-jdk-alpine

LABEL authors="HanZiXin"

# 设置工作目录为/app
WORKDIR /app

# 将Gradle Wrapper复制到镜像中
#COPY gradle/wrapper/gradle-wrapper.jar /app/gradle/wrapper/gradle-wrapper.jar
#COPY gradle/wrapper/gradle-wrapper.properties /app/gradle/wrapper/gradle-wrapper.properties

# 将项目源代码复制到Docker镜像中
COPY . /app

# 给予gradlew执行权限（如果需要的话，这取决于你的构建环境是否已经设置了权限）
RUN chmod +x ./gradlew

# 使用Gradle Wrapper构建项目
RUN ./gradlew build

# 设置容器启动时执行的命令（如果需要的话）
CMD ["echo", "Your Java 17 Gradle app is ready to be run!"]

# 如果需要，可以在这里添加其他命令来运行你的应用
CMD ["java", "-jar", "SpringAI/build/libs/SpringAI-0.1-SNAPSHOT.jar"]