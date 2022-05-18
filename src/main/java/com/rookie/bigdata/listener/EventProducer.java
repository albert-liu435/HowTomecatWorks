package com.rookie.bigdata.listener;

/**
 * @Classname EventProducer
 * @Description TODO
 * @Author rookie
 * @Date 2022/5/18 22:52
 * @Version 1.0
 */
public class EventProducer {

    ListenerRegister register = new ListenerRegister();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (value != newValue) {
            value = newValue;
            ValueChangeEvent event = new ValueChangeEvent(this, value);
            fireAEvent(event);
        }
    }

    public void addListener(ValueChangeListener a) {
        register.addListener(a);
    }

    public void removeListener(ValueChangeListener a) {
        register.removeListener(a);
    }

    public void fireAEvent(ValueChangeEvent event) {
        register.fireAEvent(event);
    }
}
