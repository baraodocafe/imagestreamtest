FROM openjdk:8u242-jre-slim

COPY target/opp-cdc-signaling-0.0.1-SNAPSHOT-spring-boot.jar /opp-cdc-signaling.jar

ENTRYPOINT ["java", "-jar", "opp-cdc-signaling.jar","--spring.config.location=/config.yaml"]