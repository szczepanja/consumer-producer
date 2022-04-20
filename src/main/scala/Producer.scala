import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig}

import java.util.Properties

object Producer extends App {

  val producerProps = new Properties()
  producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
  producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
  producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")

  val producer = new KafkaProducer[String, String](producerProps)

}
