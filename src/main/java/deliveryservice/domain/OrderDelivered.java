package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderDelivered extends AbstractEvent {

    private String orderId;

    public OrderDelivered(Order aggregate) {
        super(aggregate);
    }

    public OrderDelivered() {
        super();
    }
}
//>>> DDD / Domain Event
