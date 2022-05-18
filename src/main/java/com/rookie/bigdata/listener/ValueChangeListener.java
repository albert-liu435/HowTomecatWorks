package com.rookie.bigdata.listener;

/**
 * @Classname ValueChangeListener
 * @Description TODO
 * @Author rookie
 * @Date 2022/5/18 22:51
 * @Version 1.0
 */
public interface ValueChangeListener extends java.util.EventListener {

    public abstract void performed(ValueChangeEvent e);
}
