package com.hnulab.service;


import com.hnulab.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目Service接口
 * Created by Wyd on 2017/12/6.
 */
public interface CategoryService {

    /**
     * 根据id查询类目
     * @param categoryId 类目ID
     * @return 对应类目条目
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有类目条目
     * @return 数据表中的所有类目条目
     */
    List<ProductCategory> findAll();

    /**
     * 根据商品类型集合查询类目集合
     * @param categoryTypeList 类目类型集合
     * @return 对应的商品类目集合
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 新增商品类目
     * @param productCategory 商品
     * @return 新增的商品
     */
    ProductCategory save(ProductCategory productCategory);
}
