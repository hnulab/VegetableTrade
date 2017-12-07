package com.hnulab.repository;

import com.hnulab.dataobject.ProductCategory;
import com.hnulab.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Wyd on 2017/12/6.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据商品状态查找商品
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

}
