package com.hnulab.repository;

import com.hnulab.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-05-07 14:35
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /** 根据类目类型列表查询类目集合 In：只会查包含的类目类型*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
