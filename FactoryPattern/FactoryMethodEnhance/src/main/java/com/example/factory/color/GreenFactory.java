/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory.color;

import com.example.api.Color;
import com.example.api.Factory;
import com.example.product.color.Green;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:54
 * @Version: 1.0.0
 */
@Component
public class GreenFactory implements Factory<Color> {

    @Override
    public Color create() {
        return new Green();
    }
}