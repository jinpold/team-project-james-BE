package com.james.api.order;
import com.james.api.User.User;
import com.james.api.product.Product;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity(name="order")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Order {

    @Id
    @Column(name = "order_id") // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id") // 외래키
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id") // 외래키
    private Product product;

    @Column(name = "order_price")
    private Integer orderPrice;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    public Order(Long id, User user, Product product, Integer orderPrice, LocalDateTime orderDate) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
    }
}