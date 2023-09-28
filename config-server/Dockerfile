FROM adoptopenjdk/openjdk11
EXPOSE 8888
ARG JAR_FILE=build/libs/config-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} config-server.jar
ENTRYPOINT ["java", "-jar","/config-server.jar"]