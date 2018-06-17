package com.tb.jms.main;

import com.tb.jms.consumer.Consumer;
import com.tb.jms.producer.Producer;

public class App {

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Thread producerThread = new Thread(producer);
        producerThread.start();
        System.out.println("Producer - done");

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        System.out.println("Consumer - done");
    }
}
