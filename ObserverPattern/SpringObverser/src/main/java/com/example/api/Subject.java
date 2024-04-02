/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.api;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 16:07
 * @Version: 1.0.0
 */
public interface Subject<T> {

    T getContent();

    void setContent(T content);

    /**
     * 功能描述: 通知各个观察者<br>
     *
     * @Version: 1.0.0
     * @Author: duanrq@tsintergy.com.cn
     * @Date: 2023/9/4 17:13
     */
    void change(T content);

    boolean isNotifyObserver(T oldContent, T newContent);

    void attach(Observer<T> observer);

}