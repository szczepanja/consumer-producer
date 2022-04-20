import org.apache.kafka.clients.consumer.{ConsumerConfig, KafkaConsumer}
import org.apache.kafka.clients.producer.ProducerRecord

import java.time.Duration
import java.util.Properties

object Consumer extends App {

  val producer = Producer

  val consumerProps = new Properties()
  consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer")
  consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer")
  consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
  consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer")

  val consumer = new KafkaConsumer[String, String](consumerProps)

  import scala.jdk.CollectionConverters._

  consumer.subscribe(Seq("output").asJava)

  while (true) {
    val records = consumer.poll(Duration.ofMillis(100)).asScala
    records.foreach { record =>
      producer.producer.send(new ProducerRecord[String, String](record.value, record.value))
    }
  }
}
