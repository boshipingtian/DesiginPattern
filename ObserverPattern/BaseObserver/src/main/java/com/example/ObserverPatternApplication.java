package com.example; /**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

import com.example.observer.TomObserver;
import com.example.subject.Subject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:43
 * @Version: 1.0.0
 */
@SpringBootApplication
public class ObserverPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(ObserverPatternApplication.class, args);

        Subject subject = new Subject();
        subject.attach(new TomObserver(subject));

        subject.setState(12);
        subject.setState(10);
    }
}