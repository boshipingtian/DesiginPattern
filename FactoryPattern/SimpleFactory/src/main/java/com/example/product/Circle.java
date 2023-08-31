/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.product;

import com.example.api.Shape;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:02
 * @Version: 1.0.0
 */
@Component
public class Circle implements Shape {

    @Override
    public void drow() {
        System.out.println("圆");
    }

    public void test(){
        System.out.println("true = " + true);
    }
}