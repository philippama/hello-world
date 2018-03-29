# hello-world

## Building and running the application JAR.

```
./gradlew clean jar

java -jar build/libs/hello-world-1.0.jar

java -jar build/libs/hello-world-1.0.jar happy too
```

## Building and running the application in a Docker container

Build a container and tag it with "hello-world-java":
```
docker build -t hello-world-java .
```
This tags the container with hello-world-java:latest

Run it:
```
docker run -it --rm --name my-test hello-world-java
```
`-it` is to allocate a pseudo-TTY connected to the container’s stdin.

`--rm` is to automatically remove the container when it exits.
