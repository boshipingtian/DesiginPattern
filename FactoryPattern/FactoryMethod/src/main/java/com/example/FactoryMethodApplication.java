/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example;

import com.example.api.Shape;
import com.example.factory.CircleFactory;
import com.example.factory.RectangleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:46
 * @Version: 1.0.0
 */
@SpringBootApplication
public class FactoryMethodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryMethodApplication.class, args);

        RectangleFactory rectangleFactory = new RectangleFactory();
        Shape shape = rectangleFactory.createShape();
        shape.draw();

        CircleFactory circleFactory = new CircleFactory();
        shape = circleFactory.createShape();
        shape.draw();
    }
}