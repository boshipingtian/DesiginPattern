/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.product;

import com.example.api.Shape;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:02
 * @Version: 1.0.0
 */
@Component
public class Rectangle implements Shape {

    @Override
    public void drow() {
        System.out.println("矩形");
    }

    public void color() {
        System.out.println("蓝色");
    }
}