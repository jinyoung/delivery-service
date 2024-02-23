package deliveryservice.domain;

import deliveryservice.domain.*;
import deliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RestaurantCreated extends AbstractEvent {

    private String restaurantId;
    private String name;
    private Address location;

    public RestaurantCreated(Restaurant aggregate) {
        super(aggregate);
    }

    public RestaurantCreated() {
        super();
    }
}
//>>> DDD / Domain Event
