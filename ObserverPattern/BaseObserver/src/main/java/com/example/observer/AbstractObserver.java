/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.observer;

import com.example.subject.Subject;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:54
 * @Version: 1.0.0
 */
public abstract class AbstractObserver {

    private Subject subject;

    public abstract void update();
}