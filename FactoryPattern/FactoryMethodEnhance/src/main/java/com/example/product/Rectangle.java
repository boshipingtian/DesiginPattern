/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.product;

import com.example.api.Shape;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:42
 * @Version: 1.0.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}