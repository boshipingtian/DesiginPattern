/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.singleton;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:24
 * @Version: 1.0.0
 */
public enum EnumSingleton {

    TARGET;

    public void loging() {
        System.out.println(TARGET.hashCode());
    }

}