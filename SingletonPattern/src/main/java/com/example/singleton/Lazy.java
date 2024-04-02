/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.singleton;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:17
 * @Version: 1.0.0
 */
public class Lazy {

    private static volatile Target target = null;

    public static Target instance(){
        if(null == target){
            synchronized (Lazy.class){
                if (null == target){
                    target = new Target();
                }
            }
        }
        return target;
    }
}