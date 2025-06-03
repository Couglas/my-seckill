package com.couglas.service.product;

import com.couglas.export.dto.ProductDTO;
import com.couglas.export.service.ProductService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 产品查询服务
 *
 * @author zhenxingchen4
 * @since 2025/5/26
 */
@Service
public class ProductQueryService {
    @DubboReference
    private ProductService productService;

    public ProductDTO getById(Long id) {
        return productService.getProductById(id);
    }
}
