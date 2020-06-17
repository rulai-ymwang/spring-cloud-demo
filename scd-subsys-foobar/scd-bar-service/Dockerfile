FROM java:8-jre

COPY scd-bar-service-standalone/target/scd-bar-service-standalone-1.0-SNAPSHOT.jar /opt/service/scd-bar-service.jar

WORKDIR /opt/service/

ENV JAVA_MEM="-Xms128m -Xmx128m"

CMD java -jar ${JAVA_MEM} scd-bar-service.jar