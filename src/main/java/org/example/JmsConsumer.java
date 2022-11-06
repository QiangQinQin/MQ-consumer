package org.example;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class JmsConsumer {
//  topic方式是一对多
    @JmsListener(destination = JmsConfig.TOPIC,containerFactory = "jmsListenerContainerTopic")
    public void onMessageTopic1(String text){
        System.out.println("topic1消息:"+text);
    }

    @JmsListener(destination = JmsConfig.TOPIC,containerFactory = "jmsListenerContainerTopic")
    public void onMessageTopic2(Message message){
        try {
            TextMessage textMsg = (TextMessage) message;
            String msg = textMsg.getText();
 
            System.out.println("topic2消息：" + msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

//    queue方式是一对一
    @JmsListener(destination = JmsConfig.QUEUE,containerFactory = "jmsListenerContainerQueue")
    public void onMessageQueue1(String text){
        System.out.println("queue1消息:"+text);
    }
 
    @JmsListener(destination = JmsConfig.QUEUE,containerFactory = "jmsListenerContainerQueue")
    public void onMessageQueue2(Message message){
        try {
            TextMessage textMsg = (TextMessage) message;
            String msg = textMsg.getText();
            System.out.println("queue2消息：" + msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
 
}