package com.rookie.bigdata.listener;

/**
 * @Classname Main
 * @Description TODO
 * @Author rookie
 * @Date 2022/5/18 22:53
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        EventProducer producer = new EventProducer();
        producer.addListener(new EventConsumer());
        producer.setValue(2);
    }
}
