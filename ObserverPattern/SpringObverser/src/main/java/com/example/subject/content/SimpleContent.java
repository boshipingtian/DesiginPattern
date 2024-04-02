/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.subject.content;

import org.springframework.stereotype.Component;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 16:12
 * @Version: 1.0.0
 */
@Component
public class SimpleContent {

    private String name;

    private String age;

    public SimpleContent(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public SimpleContent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleContent{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
}