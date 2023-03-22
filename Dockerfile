FROM openjdk:8
EXPOSE 9094
ADD target/spring-boot-backendmysql-docker.jar spring-boot-backendmysql-docker.jar
ENTRYPOINT [ "java","-jar","spring-boot-backendmysql-docker.jar" ] CMD ["-start"]