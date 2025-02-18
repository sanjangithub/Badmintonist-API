FROM openjdk:latest
EXPOSE 8089
ADD target/Badminton-api-docker.jar Badminton-api-docker.jar
ENTRYPOINT ["java","-jar","/Badminton-api-docker.jar"] 