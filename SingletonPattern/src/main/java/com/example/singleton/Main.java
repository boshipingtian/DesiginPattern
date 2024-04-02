/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.singleton;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:27
 * @Version: 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        Hunger.instance().loging();
        Hunger.instance().loging();

        Lazy.instance().loging();
        Lazy.instance().loging();

        EnumSingleton.TARGET.loging();
        EnumSingleton.TARGET.loging();

        InnerStaticClass.instance().loging();
        InnerStaticClass.instance().loging();

    }
}