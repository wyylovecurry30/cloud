package com.atwyy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName CommonResult.java
 * @createTime 2020年03月07日 17:09:00
 */
@Data
@AllArgsConstructor //全参构造器
@NoArgsConstructor //空参构造器
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
