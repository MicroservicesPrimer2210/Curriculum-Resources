# Multi stage dockerfile 
# 1st stage is going to be building the spring project
# 2nd stage is to copy over the jar file and use a lightweight docker image. 

FROM maven:3.8.5-openjdk-8 AS MAVEN_BUILD_STAGE 

#Copying over all the files 
COPY ./ ./

#The RUN command allows us to execute terminal commands
RUN mvn clean package 

#We're going to use a new base image, for *just* running the jar file 
FROM openjdk:8-jre 

COPY --from=MAVEN_BUILD_STAGE /target/Moon-Service-0.0.1-SNAPSHOT.jar /moon.jar 

CMD ["java", "-jar", "moon.jar"]