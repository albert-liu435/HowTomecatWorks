package com.rookie.bigdata.listener;

/**
 * @Classname EventConsumer
 * @Description TODO
 * @Author rookie
 * @Date 2022/5/18 22:53
 * @Version 1.0
 */
public class EventConsumer implements ValueChangeListener {

    @Override
    public void performed(ValueChangeEvent e) {
        System.out.println("value changed, new value = " + e.getValue());
    }

}
