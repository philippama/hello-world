FROM openjdk:8-jre
COPY build/libs /usr/src/hello
WORKDIR /usr/src/hello
CMD ["java", "-jar", "hello-world-1.0.jar"]
