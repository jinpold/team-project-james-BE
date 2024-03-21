package com.james.api.product;
import com.james.api.order.Order;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity(name="product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Product {

    @Id
    @Column(name = "product_id") //기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "product") //연결테이블(ORDER)쪽이 외래키를 갖고 있기 때문에, 연결 테이블이 연관관계의 주인이다.
    private List<Order> orders;

    @Column(name = "product_name") //
    private String productName;

    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
    }
}
