FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE

ADD target/nodo*.jar /

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/nodo*.jar"]