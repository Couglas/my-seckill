package com.couglas.export.service;

import com.couglas.export.dto.ProductDTO;

/**
 * 产品服务
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
public interface ProductService {
    ProductDTO getProductById(long id);
}
