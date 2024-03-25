package com.james.api.product;
public class ProductServiceImpl {

    private ProductRepository productRepository;
    private static ProductServiceImpl instnace = new ProductServiceImpl();

    private ProductServiceImpl() {
        this.productRepository = ProductRepository.getInstance();
    }
    public static ProductServiceImpl getInstnace() {
        return instnace;
    }
}
