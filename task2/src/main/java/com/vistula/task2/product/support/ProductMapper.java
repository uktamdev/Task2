package com.vistula.task2.product.support;

import com.vistula.task2.product.api.request.ProductRequest;
import com.vistula.task2.product.api.response.ProductResponse;
import com.vistula.task2.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static Product toEntity(ProductRequest request) {
        return new Product(null, request.getName(), request.getPrice());
    }

    public static ProductResponse toResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }
}
