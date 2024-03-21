package com.james.api.product;

public class ProductController {
    private static ProductController instance = new ProductController();

    private ProductServiceImpl productService;

    public static ProductController getInstance() {
        return instance;
    }

    public ProductController() {
        this.productService = ProductServiceImpl.getInstnace();
    }
}
