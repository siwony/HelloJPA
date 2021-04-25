package relationshipManage_05.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Table(name = "ORDERS") // DB에서 안될때도 있고 될때도 있어서 바
public class Order extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToOne(fetch = LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime orderDate; // spring boot 는 DB에 order_date라고 매핑된다.

    @Enumerated(EnumType.STRING) // 무조건 String으로 들어가게 해야된다.
    private OrderStatus orderStatus;

    public Order() {
    }

    //연관관계 편의 매서드
    public void addOrderItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}