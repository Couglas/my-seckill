package com.couglas.dao.mapper;

import com.couglas.dao.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * product mapper
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
@Mapper
public interface ProductMapper {
    @Select("select id, name, price from product where id  = #{id}")
    Product selectById(Long id);
}
