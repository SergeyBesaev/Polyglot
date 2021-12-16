#!/bin/bash
gradle bootJar
docker build --build-arg JAR_FILE=build/libs/*.jar -t besaev/backend-test .
docker run -p 8080:8080 besaev/backend-test