/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.observer;

import com.example.api.Observer;
import com.example.api.Subject;
import java.util.List;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 16:09
 * @Version: 1.0.0
 */
public abstract class AbstractSubject<T> implements Subject<T> {

    private final List<Observer<T>> observers;

    private T content;

    protected AbstractSubject(List<Observer<T>> observers, T content) {
        this.observers = observers;
        this.content = content;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void change(T content) {
        if (isNotifyObserver(this.content, content)) {
            notifyAllObserver(content);
        }
        this.content = content;
    }

    public void attach(Observer<T> observer) {
        this.observers.add(observer);
    }

    private void notifyAllObserver(T newContent) {
        observers.forEach(tObserver -> tObserver.update(newContent));
    }
}