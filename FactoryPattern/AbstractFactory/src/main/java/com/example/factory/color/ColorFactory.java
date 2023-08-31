/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory.color;

import com.example.api.Factory;
import com.example.api.Color;
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
 * @Date: 2023/8/31 17:15
 * @Version: 1.0.0
 */
@Component
public class ColorFactory implements Factory {

    private static final Map<Class<? extends Color>, Color> COLOR_MAP = new ConcurrentHashMap<>();

    private List<? extends Color> colorList;

    @Autowired
    private void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }

    @PostConstruct
    private void initializeMap() {
        colorList.forEach(color -> COLOR_MAP.put(color.getClass(), color));
    }

    @Override
    public <T extends Color> T getColor(Class<T> tClass) {
        return (T) COLOR_MAP.get(tClass);
    }
}