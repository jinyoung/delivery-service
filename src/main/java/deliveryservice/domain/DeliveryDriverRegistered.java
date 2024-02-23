package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryDriverRegistered extends AbstractEvent {

    private String deliveryDriverId;
    private String name;
    private String vehicleNumber;

    public DeliveryDriverRegistered(DeliveryDriver aggregate) {
        super(aggregate);
    }

    public DeliveryDriverRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
