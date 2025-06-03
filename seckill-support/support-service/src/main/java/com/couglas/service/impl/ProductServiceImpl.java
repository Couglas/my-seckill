package com.couglas.service.impl;

import com.couglas.dao.entity.Product;
import com.couglas.dao.mapper.ProductMapper;
import com.couglas.export.dto.ProductDTO;
import com.couglas.export.service.ProductService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;

/**
 * 产品服务实现类
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
@DubboService
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public ProductDTO getProductById(long id) {
        System.out.println("====== called with id: " + id);
        Product product = productMapper.selectById(id);
        if (product == null) {
            return null;
        }
        ProductDTO result = new ProductDTO();
        BeanUtils.copyProperties(product, result);

        return result;
    }
}
