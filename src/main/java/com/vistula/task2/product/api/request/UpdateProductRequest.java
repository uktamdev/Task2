package com.vistula.task2.product.api.request;

public class UpdateProductRequest {
    private String name;
    private Double price;

    public UpdateProductRequest() {
    }

    public UpdateProductRequest(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

