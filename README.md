# springbootzookeeper


http://localhost:8787/#/applications


-Cunsumer
http://localhost:8882/get-greeting


-Provider :
http://localhost:8981/helloworld
http://localhost:8982/helloworld

--Zipkin server :
http://localhost:9411/zipkin/



C:\env\kafka_2.12-2.4.0\


kafka-server-start.bat C:\env\kafka_2.12-2.4.0\config\server.properties



https://github.com/openzipkin/zipkin/blob/master/zipkin-server/README.md

STORAGE_TYPE=cassandra3 CASSANDRA_CONTACT_POINTS=127.0.0.1:9042 KAFKA_BOOTSTRAP_SERVERS=localhost:9092 \java -jar zipkin-server-2.12.9-exec.jar




http://localhost:8882/get/all



http://localhost:8882/save/item
