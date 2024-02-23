package deliveryservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterDeliveryDriverCommand {

    private String name;
    private String vehicleNumber;
}
