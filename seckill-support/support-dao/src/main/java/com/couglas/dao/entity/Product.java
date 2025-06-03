package com.couglas.dao.entity;

import java.io.Serializable;

/**
 * product实体类
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
public class Product implements Serializable {
    private Long id;
    private String name;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
