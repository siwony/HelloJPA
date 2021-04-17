package basicMapping_02.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS") // DB에서 안될때도 있고 될때도 있어서 바
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDERS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    private LocalDateTime orderDate; // spring boot 는 DB에 order_date라고 매핑된다.

    @Enumerated(EnumType.STRING) // 무조건 String으로 들어가게 해야된다.
    private OrderStatus orderStatus;

    //연관관계 편의 매서드
    public void addOrderItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}