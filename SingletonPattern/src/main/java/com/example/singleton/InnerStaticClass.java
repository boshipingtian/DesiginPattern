/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.singleton;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:29
 * @Version: 1.0.0
 */
public class InnerStaticClass {

    private InnerStaticClass() {
    }

    public static Target instance() {
        return SingletonHolder.TARGET;
    }

    private static class SingletonHolder {

        private static final Target TARGET = new Target();
    }
}