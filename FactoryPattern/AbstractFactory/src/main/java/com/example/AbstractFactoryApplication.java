/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example;

import com.example.factory.FactoryProducer;
import com.example.factory.color.ColorFactory;
import com.example.product.color.Blue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 17:30
 * @Version: 1.0.0
 */
@SpringBootApplication
public class AbstractFactoryApplication {

    private static FactoryProducer factoryProducer;

    @Autowired
    public void setFactoryProducer(FactoryProducer factoryProducer) {
        AbstractFactoryApplication.factoryProducer = factoryProducer;
    }

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryApplication.class, args);
        ColorFactory factory = factoryProducer.getFactory(ColorFactory.class);
        Blue color = factory.getColor(Blue.class);
        color.paint();
    }
}