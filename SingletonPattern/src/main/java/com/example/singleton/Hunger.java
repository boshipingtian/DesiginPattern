/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.singleton;

/**
 * 饿汉式 <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:17
 * @Version: 1.0.0
 */
public class Hunger {

    private static final Target TARGET = new Target();

    public static Target instance() {
        return TARGET;
    }

}