FROM alpine:3.11.2
RUN apk add --no-cache openjdk11
COPY build/libs/estate-0.0.1-SNAPSHOT.jar /app4/
WORKDIR /app4/

CMD ["java", "-jar", "/app4/estate-0.0.1-SNAPSHOT.jar"]
