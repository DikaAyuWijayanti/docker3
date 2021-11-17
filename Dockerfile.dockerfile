FROM openjdk:8-jdk-alpine
MAINTAINER dikaayu <1931710061@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Tugas_Docker.java /app
#compile file java
RUN javac Tugas_Docker.java
#running java
ENTRYPOINT java Tugas_Docker