FROM java:8

WORKDIR /app

COPY search-0.0.1-SNAPSHOT.jar /app

EXPOSE 8082

CMD java - jar search-0.0.1-SNAPSHOT.jar 
