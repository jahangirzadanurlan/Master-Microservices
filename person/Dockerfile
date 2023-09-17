FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=build/libs/person-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} person.jar
ENTRYPOINT ["java", "-jar","/person.jar"]