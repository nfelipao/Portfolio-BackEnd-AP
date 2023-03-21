FROM amazoncorretto:11-alpine-jdk
MAINTAINER NFelipe
COPY target/porfolio-0.0.1-SNAPSHOT.jar nfelipe-app.jar
ENTRYPOINT ["java", "-jar", "/nfelipe-app.jar"]
