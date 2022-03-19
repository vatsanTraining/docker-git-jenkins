FROM java:8
ARG JAR_FILE=target/student-service.jar


COPY ${JAR_FILE} service.jar

EXPOSE 6060

ENTRYPOINT ["java","-jar","service.jar"]


