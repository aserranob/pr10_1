FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE

ADD target/nodo-0.0.1-SNAPSHOT-docker-info.jar /

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/nodo-0.0.1-SNAPSHOT-docker-info.jar"]
