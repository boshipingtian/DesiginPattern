/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory.shape;


import com.example.api.Factory;
import com.example.api.Shape;
import com.example.product.shape.Circle;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:44
 * @Version: 1.0.0
 */
@Component
public class CircleFactory implements Factory<Shape> {

    @Override
    public Shape create() {
        return new Circle();
    }
}