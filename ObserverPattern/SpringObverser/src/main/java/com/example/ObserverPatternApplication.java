package com.example; /**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

import com.example.subject.SimpleSubject;
import com.example.subject.content.SimpleContent;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:43
 * @Version: 1.0.0
 */
@SpringBootApplication
public class ObserverPatternApplication {
    private static SimpleSubject subject;

    @PostConstruct
    public void setA(){
        SimpleContent simpleContent = new SimpleContent("aaa", "12");
        subject.setContent(simpleContent);
    }

    @Autowired
    public void setSubject(SimpleSubject subject) {
        ObserverPatternApplication.subject = subject;
    }


    public static void main(String[] args) {
        SpringApplication.run(ObserverPatternApplication.class, args);
        // 只有年龄变化才会通知其他
        SimpleContent content1 = new SimpleContent("ccc", "12");
        subject.change(content1);
        SimpleContent content2 = new SimpleContent("haha", "50");
        subject.change(content2);
    }
}