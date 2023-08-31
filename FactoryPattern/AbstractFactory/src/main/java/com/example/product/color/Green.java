/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.product.color;

import com.example.api.Color;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 17:27
 * @Version: 1.0.0
 */
@Component
public class Green implements Color {

    @Override
    public void paint() {
        System.out.println("绿");
    }
}