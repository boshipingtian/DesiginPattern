/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.observer.easy;

import com.example.api.Observer;
import com.example.subject.content.EasyContent;
import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 16:38
 * @Version: 1.0.0
 */
@Component
public class EasyObserverA implements Observer<EasyContent> {

    @Override
    public void update(EasyContent content) {
        System.out.println(this.getClass().getName() + " 获取到了" + content);
    }
}