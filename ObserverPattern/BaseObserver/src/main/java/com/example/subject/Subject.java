/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.subject;

import com.example.observer.AbstractObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:53
 * @Version: 1.0.0
 */
public class Subject {

    private final List<AbstractObserver> abstractObservers = new ArrayList<>();

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(AbstractObserver abstractObserver){
        abstractObservers.add(abstractObserver);
    }

    public void notifyAllObserver(){
        abstractObservers.forEach(AbstractObserver::update);
    }
}