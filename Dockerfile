FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/estate-0.0.1-SNAPSHOT.jar /app2/
WORKDIR /app2/

CMD ["java", "-jar", "/app2/estate-0.0.1-SNAPSHOT.jar"]
