package deliveryservice.domain;

import deliveryservice.DeliveryServiceApplication;
import deliveryservice.domain.RestaurantCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurant_table")
@Data
//<<< DDD / Aggregate Root
public class Restaurant {

    @Id
    private String restaurantId;

    private String name;

    private Address location;

    @PostPersist
    public void onPostPersist() {
        RestaurantCreated restaurantCreated = new RestaurantCreated(this);
        restaurantCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RestaurantRepository repository() {
        RestaurantRepository restaurantRepository = DeliveryServiceApplication.applicationContext.getBean(
            RestaurantRepository.class
        );
        return restaurantRepository;
    }
}
//>>> DDD / Aggregate Root
