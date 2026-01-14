package com.vistula.task2.product.service;

import com.vistula.task2.product.api.request.ProductRequest;
import com.vistula.task2.product.api.request.UpdateProductRequest;
import com.vistula.task2.product.api.response.ProductResponse;
import com.vistula.task2.product.domain.Product;
import com.vistula.task2.product.repository.ProductRepository;
import com.vistula.task2.product.support.ProductMapper;
import com.vistula.task2.product.support.exception.ProductExceptionSupplier;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Indexed
@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = ProductMapper.toEntity(request);
        Product saved = repository.save(product);
        return ProductMapper.toResponse(saved);
    }

    public ProductResponse findById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return ProductMapper.toResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        product.setName(request.getName());
        product.setPrice(request.getPrice());

        Product saved = repository.save(product);
        return ProductMapper.toResponse(saved);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(ProductMapper::toResponse)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        repository.deleteById(product.getId());
    }
}
