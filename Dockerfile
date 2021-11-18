FROM openjdk:8-jdk-alpine
MAINTAINER dika6 <1931710071@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY tugasdocker.java /app
#compile file java
RUN javac tugasdocker.java
#running java
ENTRYPOINT java tugasdoker