/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.factory;

import com.example.api.Factory;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/8/31 16:51
 * @Version: 1.0.0
 */
@Component
public class BaseFactory {

    public <T> T create(Factory<T> factory){
        return factory.create();
    }

}