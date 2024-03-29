package deliveryservice.domain;

import deliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveryDrivers",
    path = "deliveryDrivers"
)
public interface DeliveryDriverRepository
    extends PagingAndSortingRepository<DeliveryDriver, String> {}
