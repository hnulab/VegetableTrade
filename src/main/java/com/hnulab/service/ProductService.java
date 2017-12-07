package com.hnulab.service;

import com.hnulab.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品Service
 * Created by Wyd on 2017/12/6.
 */
public interface ProductService {

    /**
     * 根据商品ID查询商品
     * @param productId 商品ID
     * @return 查询到的商品
     */
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 按页查询商品信息
     * @param pageable 页属性（第几页，条目数量）
     * @return 所在页的商品信息
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 新增商品
     * @param productInfo 新增的商品信息
     * @return 新增的商品
     */
    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

    //上架

    //下架
}
