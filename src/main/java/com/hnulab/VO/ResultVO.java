package com.hnulab.VO;

import lombok.Data;
/**
 * http请求返回的最外层对象
 * Created by Wyd on 2017/12/6.
 * JsonProperty(""Json中对应的字段名)
 * @Data自动生成Set和Get方法
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
