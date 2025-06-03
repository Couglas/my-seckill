package com.couglas.gateway.controller;

import com.couglas.export.dto.ProductDTO;
import com.couglas.service.product.ProductQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 产品
 *
 * @author zhenxingchen4
 * @since 2025/5/26
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductQueryService productQueryService;

    @GetMapping("/{id}")
    public String getProduct(@PathVariable("id") Long id) {
        ProductDTO product = productQueryService.getById(id);
        return product.toString();
    }
}
