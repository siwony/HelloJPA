package relationshipManage_05.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery extends BaseEntity{

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;
    private DeliveryStatus deliveryStatus;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
