FROM openjdk:8-jdk-alpine
MAINTAINER dikaayu <1931710061@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY tugasdocker.java /app
#compile file java
RUN javac tugasdocker.java
#running java
ENTRYPOINT java tugasdocker