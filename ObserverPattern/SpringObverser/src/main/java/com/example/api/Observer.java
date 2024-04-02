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
public interface Observer<T> {

    void update(T content);
}