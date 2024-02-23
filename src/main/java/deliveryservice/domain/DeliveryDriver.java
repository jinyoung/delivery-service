package deliveryservice.domain;

import deliveryservice.DeliveryServiceApplication;
import deliveryservice.domain.DeliveryDriverRegistered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryDriver_table")
@Data
//<<< DDD / Aggregate Root
public class DeliveryDriver {

    @Id
    private String deliveryDriverId;

    private String name;

    private String vehicleNumber;

    @PostPersist
    public void onPostPersist() {
        DeliveryDriverRegistered deliveryDriverRegistered = new DeliveryDriverRegistered(
            this
        );
        deliveryDriverRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryDriverRepository repository() {
        DeliveryDriverRepository deliveryDriverRepository = DeliveryServiceApplication.applicationContext.getBean(
            DeliveryDriverRepository.class
        );
        return deliveryDriverRepository;
    }
}
//>>> DDD / Aggregate Root
