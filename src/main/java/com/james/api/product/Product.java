package com.james.api.product;
import com.james.api.master.Master;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity(name="product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Product {

    @Id
    @Column(name = "product_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "product")
    private List<Master> master;

    @Column(name = "product_name")
    private String productName;
}
