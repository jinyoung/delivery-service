package deliveryservice.infra;

import deliveryservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeliveryDriverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeliveryDriver>> {

    @Override
    public EntityModel<DeliveryDriver> process(
        EntityModel<DeliveryDriver> model
    ) {
        return model;
    }
}
