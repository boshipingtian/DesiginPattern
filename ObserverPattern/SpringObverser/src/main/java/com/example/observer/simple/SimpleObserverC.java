/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.observer.simple;

import com.example.api.Observer;
import com.example.subject.content.SimpleContent;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 16:31
 * @Version: 1.0.0
 */
@Component
public class SimpleObserverC implements Observer<SimpleContent> {

    @Override
    public void update(SimpleContent content) {
        System.out.println(this.getClass().getName() + " 获取到了" + content);
    }
}