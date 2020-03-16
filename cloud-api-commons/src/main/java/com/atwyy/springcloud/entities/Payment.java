package com.atwyy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by idea
 *
 * @author Curry
 * @version 1.0.0
 * @ClassName Payment.java
 * @createTime 2020年03月07日 17:06:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
