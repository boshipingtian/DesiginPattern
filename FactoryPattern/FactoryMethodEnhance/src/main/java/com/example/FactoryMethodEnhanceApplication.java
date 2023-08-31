/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example;

import com.example.api.Color;
import com.example.api.Shape;
import com.example.factory.BaseFactory;
import com.example.factory.color.BlueFactory;
import com.example.factory.color.GreenFactory;
import com.example.factory.shape.RectangleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:46
 * @Version: 1.0.0
 */
@SpringBootApplication
public class FactoryMethodEnhanceApplication {

    private static BaseFactory factory;

    @Autowired
    public void setFactory(BaseFactory factory) {
        FactoryMethodEnhanceApplication.factory = factory;
    }

    public static void main(String[] args) {
        SpringApplication.run(FactoryMethodEnhanceApplication.class, args);

        Color color = factory.create(new BlueFactory());
        color.paint();
        color = factory.create(new GreenFactory());
        color.paint();

        Shape shape = factory.create(new RectangleFactory());
        shape.draw();
    }
}