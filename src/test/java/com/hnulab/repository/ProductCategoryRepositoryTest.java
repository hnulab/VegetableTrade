package com.hnulab.repository;

import com.hnulab.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 类目测试类
 * Created by Wyd on 2017/12/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;


    /**
     * 测试根据id查找对应条目
     */
    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    /**
     *测试插入单一条目信息
     * @Transactional 事务回滚 只进行测试不向数据库表添加数据
     * 保持数据库的整洁
     */
    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        //判断结果是否为null
        Assert.assertNotNull(result);
        //判断结果是否为null 等价于上句unexpected 不期待的结果
//        Assert.assertNotEquals(null,result);
    }

    /**
     *根据id更新对应条目
     */
    @Test
    public void updateTest(){
        ProductCategory productCategory = repository.findOne(1);
        productCategory.setCategoryName("男生最爱1");
        ProductCategory result = repository.save(productCategory);
        System.out.println(result.toString());
    }

    /**
     * 根据类目类型集合查询类目列表集合
     */
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}