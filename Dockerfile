FROM openjdk:latest
ADD target/Badminton-api-docker.jar Badminton-api-docker.jar
ENTRYPOINT ["java","-jar","/Badminton-api-docker.jar"] 
