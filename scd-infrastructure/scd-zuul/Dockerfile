FROM java:8-jre

COPY target/scd-zuul-1.0-SNAPSHOT.jar /opt/service/scd-zuul.jar

WORKDIR /opt/service/

ENV JAVA_MEM="-Xms128m -Xmx128m"

CMD java -jar ${JAVA_MEM} scd-zuul.jar