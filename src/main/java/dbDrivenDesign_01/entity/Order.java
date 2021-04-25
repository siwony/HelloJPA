package dbDrivenDesign_01.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "ORDERS") // DB에서 안될때도 있고 될때도 있어서 바
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime orderDate; // spring boot 는 DB에 order_date라고 매핑된다.

    @Enumerated(EnumType.STRING) // 무조건 String으로 들어가게 해야된다.
    private OrderStatus orderStatus;

}
