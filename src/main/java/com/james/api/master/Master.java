package com.james.api.master;
import com.james.api.product.Product;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity(name="master")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Master {
    @Id
    @Column(name = "master_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "master_price")
    private Integer masterPrice;

    @Column(name = "master_date")
    private LocalDateTime masterDate;
}