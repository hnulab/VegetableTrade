package com.hnulab.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * Created by Wyd on 2017/12/6.
 * @Entity把数据映射成对象
 * 数据库表名product_category直接自动映射成驼峰式ProductCategory
 * 如果不想和数据库表名一直可以加上@Table(name = "数据库表名")
 * @DynamicUpdate 自动更新 主要是用来自动更新时间
 * @Data自动生成get set  toString方法
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /**
     * 同样数据库字段自动映射成对应的字段
     * @Id对应的id字段
     *  @GeneratedValue自动递增
     */

    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    /** 创建日期. */
    private Date createTime;

    /** 更新修改日期. */
    private Date updateTime;

    /**无参数的构造方法. 查询的时候会使用 必须写*/
    public ProductCategory() {
    }

    /**两个参数的构造方法. */
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}
