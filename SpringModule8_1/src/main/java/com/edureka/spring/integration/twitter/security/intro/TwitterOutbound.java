package com.edureka.spring.integration.twitter.security.intro;
 
import java.util.Calendar;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.message.GenericMessage;

public class TwitterOutbound {
 
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("/twitter-outbound.xml", TwitterOutbound.class);
 
        MessageChannel input = context.getBean("twitterOutbound", MessageChannel.class);
 
        Message message = new GenericMessage(Calendar.getInstance().getTime()+" @ New Message from Skilled Monster using Spring Integration Module");
 
        input.send(message);
    }
}


