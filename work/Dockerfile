FROM adoptopenjdk/openjdk11
EXPOSE 8081
ARG JAR_FILE=build/libs/work-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} work.jar
ENTRYPOINT ["java", "-jar","/work.jar"]