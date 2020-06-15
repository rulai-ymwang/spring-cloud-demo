FROM java:8-jre

COPY target/scd-infrastructure-zuul-1.0-SNAPSHOT.jar /opt/service/

WORKDIR /opt/service/

ENV JAVA_MEM="-Xms64m -Xmx128m"

CMD java -jar ${JAVA_MEM} scd-infrastructure-zuul-1.0-SNAPSHOT.jar