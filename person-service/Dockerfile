# Build
FROM gradle:5.4-jdk11 AS BUILD_IMAGE

ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --chown=gradle:gradle build.gradle settings.gradle gradlew $APP_HOME
COPY --chown=gradle:gradle gradle $APP_HOME/gradle
COPY --chown=gradle:gradle src/ $APP_HOME/src/
RUN ./gradlew build 
COPY . .

# Runnable
FROM openjdk:11.0-jdk
ENV ARTIFACT_NAME=person-service
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD_IMAGE $APP_HOME/build/libs/$ARTIFACT_NAME*.jar person-service.jar

EXPOSE 8080
CMD [ "-jar", "person-service.jar" ]
ENTRYPOINT [ "java" ]