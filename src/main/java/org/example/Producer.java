package org.example;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.example.DataGenerator.DataGenerator;
import org.example.DataGenerator.PhoneData;
import org.example.Serializer.JsonSerializer;

import java.util.Properties;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.Timer;

public class Producer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final Properties props = new Properties();
        props.setProperty(ProducerConfig.CLIENT_ID_CONFIG, "java-producer");
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());

        final KafkaProducer producer = new KafkaProducer<String, PhoneData>(props);

        DataGenerator dataGenerator = new DataGenerator();

        Timer tick = new Timer();
            tick.scheduleAtFixedRate(new TimerTask()
            {

                Long i=1L;
                public void run()
                {
                    PhoneData phoneData = dataGenerator.DataGen(i);
                    ProducerRecord<String, PhoneData> record =
                            new ProducerRecord<>("phone-calls", phoneData);
                    System.out.println("sent "+ phoneData.getTimeStamp());
                   i++;
                    try {
                        producer.send(record).get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 1000, 1000);

        }
}



