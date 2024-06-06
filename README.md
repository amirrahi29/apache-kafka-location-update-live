start zookeeper
--------------------------------------------------------------------------------
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

start kafka
---------------------------------------------------------------------------------
bin\windows\kafka-server-start.bat config\server.properties

create topic
-----------------------------------------------------------------------------------
bin\windows\kafka-topics.bat --create --topic amir-topic --bootstrap-server localhost:9092

produce messages
------------------------------------------------------------------------------------
bin\windows\kafka-console-producer.bat --topic amir-topic --bootstrap-server localhost:9092

consumenr message
---------------------------------------------------------------------------------------
bin\windows\kafka-console-consumer.bat --topic amir-topic --from-beginning --bootstrap-server localhost:9092

https://github.com/amirrahi29/apache-kafka-location-update-live/assets/107117774/cfeaa685-907f-49c2-8b97-b67c94bd97de

