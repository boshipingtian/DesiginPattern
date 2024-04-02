/**
 * Copyright(C),2015‐2023,北京清能互联科技有限公司
 */

package com.example.subject;

import com.example.api.Observer;
import com.example.observer.AbstractSubject;
import com.example.subject.content.SimpleContent;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 * <br>
 *
 * @Author: duanrq@tsintergy.com
 * @Date: 2023/9/4 15:53
 * @Version: 1.0.0
 */
@Component
public class SimpleSubject extends AbstractSubject<SimpleContent> {


    protected SimpleSubject(List<Observer<SimpleContent>> observers, SimpleContent simpleContent) {
        super(observers, simpleContent);
    }

    @Override
    public boolean isNotifyObserver(SimpleContent oldContent, SimpleContent newContent) {
        return !Objects.equals(oldContent.getAge(), newContent.getAge());
    }
}