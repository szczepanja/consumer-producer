# consumer-producer

**What needed to be done?**

1. Run `zookeeper`
2. Run `kafka server`
3. Run `producer console` on topic output and another on topic input
4. Run `consumer console` on topic output and another on topic input
5. Read messages according to specified value in producer console

- zookeeper:

````
    bin\windows>zookeeper-server-start.bat C:kafka\config\zookeeper.properties
````

- kafka server:

````
    bin\windows>kafka-server-start.bat C:\kafka\config\server.properties
````

- read message in consumer:

 ````
  bin\windows>kafka-console-consumer.bat --topic <topic-name> --from-beginning --bootstrap-server :9092
````

- write message in producer to consumers console:

 ````
  bin\windows>kafka-console-consumer.bat --topic <topic-name> --bootstrap-server :9092
````

Enjoy!