/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.api;

import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 17:15
 * @Version: 1.0.0
 */
@Component
public interface Factory {

    default <T extends Shape> T getShape(Class<T> tClass) {
        return null;
    }

    default <T extends Color> T getColor(Class<T> tClass) {
        return null;
    }
}