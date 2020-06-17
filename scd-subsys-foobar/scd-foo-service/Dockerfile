FROM java:8-jre

COPY scd-foo-service-standalone/target/scd-foo-service-standalone-1.0-SNAPSHOT.jar /opt/service/scd-foo-service.jar

WORKDIR /opt/service/

ENV JAVA_MEM="-Xms128m -Xmx128m"

CMD java -jar ${JAVA_MEM} scd-foo-service.jar