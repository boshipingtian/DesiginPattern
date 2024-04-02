/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.observer;

import com.example.subject.Subject;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:57
 * @Version: 1.0.0
 */
public class TomObserver extends AbstractObserver {

    private Subject subject;

    public TomObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Tom got it " + subject.getState());
    }
}