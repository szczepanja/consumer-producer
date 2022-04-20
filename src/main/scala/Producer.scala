//import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}
//
//import java.util.Properties
//
//object Producer extends App {
//
//  val props = new Properties()
//
//  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
//  props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer")
//  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
//
//  val producer = new KafkaProducer[String, String](props)
//
//  val message1 = "Hello from this topic1!"
//
//  producer.send(new ProducerRecord[String, String]("input", message1))
//
//  producer.close()
//}
