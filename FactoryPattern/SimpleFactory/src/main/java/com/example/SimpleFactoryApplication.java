/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example;

import com.example.factory.ShapeFactory;
import com.example.product.Circle;
import com.example.product.Rectangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:32
 * @Version: 1.0.0
 */
@SpringBootApplication
public class SimpleFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class, args);

        Circle circle = ShapeFactory.getShape(Circle.class);
        circle.drow();
        circle.test();
        Rectangle rectangle = ShapeFactory.getShape(Rectangle.class);
        rectangle.drow();
        rectangle.color();
    }
}