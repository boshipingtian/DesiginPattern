/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory;

import com.example.api.Factory;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 17:31
 * @Version: 1.0.0
 */
@Component
public class FactoryProducer {

    private static final Map<Class<? extends Factory>, Factory> FACTORY_MAP = new ConcurrentHashMap<>();

    private List<Factory> factories;

    @Autowired
    private void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    @PostConstruct
    private void initialMap() {
        factories.forEach(factory -> FACTORY_MAP.put(factory.getClass(), factory));
    }

    public <T extends Factory> T getFactory(Class<T> tClass) {
        return (T) FACTORY_MAP.get(tClass);
    }
}