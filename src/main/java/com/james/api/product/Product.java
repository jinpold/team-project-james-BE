package com.james.api.product;

import jakarta.persistence.*;
import lombok.*;
@Entity(name="product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
}