FROM adoptopenjdk/openjdk11:latest
COPY target/klk-0.0.1-SNAPSHOT.jar klk-0.0.1.jar
ENTRYPOINT ["java","-jar","-DUSERNAME=postgres","-DPASSWORD=admin","-DHOST=jdbc:postgresql://localhost","-DPORT=5432","-DDB_NAME=oblak","/klk-0.0.1.jar"]