#I can build a jar of the file, then copy over the jar file to my java container. 

#Base image I'm using, I don't need a maven image because I'm not building anything. 
FROM openjdk:8-jdk 

#Copying over the Jar file. 
# ADD/COPY - we copy from our host system into our container image
COPY target/Planet-Service-0.0.1-SNAPSHOT.jar planet-demo.jar

#The final argument should match the name and location of the copied jar file.
CMD ["java", "-jar", "planet-demo.jar"]
