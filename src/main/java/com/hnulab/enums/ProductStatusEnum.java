package com.hnulab.enums;

import lombok.Getter;

/**
 * Created by Wyd on 2017/12/6.
 * @Getter 只自动生成Get方法
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1, "下架")
    ;

    /**商品状态码. */
    private Integer code;

    /**注释信息. */
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
