package deliveryservice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import deliveryservice.config.kafka.KafkaProcessor;
import deliveryservice.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    DeliveryDriverRepository deliveryDriverRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
}
//>>> Clean Arch / Inbound Adaptor
