/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory;

import com.example.api.Shape;
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
 * @Date: 2023/8/31 16:02
 * @Version: 1.0.0
 */
@Component
public class ShapeFactory {

    private static final Map<Class<? extends Shape>, Shape> SHAPE_MAP = new ConcurrentHashMap<>();

    private List<? extends Shape> shapeList;

    @Autowired
    private void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }


    @PostConstruct
    private void initializeMap() {
        shapeList.forEach(shape -> SHAPE_MAP.put(shape.getClass(), shape));
    }

    public static <T extends Shape> T getShape(Class<T> tClass) {
        return (T) SHAPE_MAP.get(tClass);
    }
}