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
public class EasyContent {

    private String school;

    private String clazz;

    public EasyContent(String school, String clazz) {
        this.school = school;
        this.clazz = clazz;
    }

    public EasyContent() {
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "EasyContent{" +
            "school='" + school + '\'' +
            ", clazz='" + clazz + '\'' +
            '}';
    }
}