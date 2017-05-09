package com.github.kumarvikas1.web.converter.facebook;

import com.github.kumarvikas1.core.request.facebook.pojo.*;
import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by vikakumar on 5/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FacebookConverter.class)
@WebAppConfiguration
@ComponentScan
public class FacebookConverterTest {

    @Autowired
    FacebookConverter facebookConverter;

    @Test
    public void test_facebook_request_converted() {
        Request request = new Request();
        Entry entry = new Entry();
        Messaging messaging = new Messaging();
        Sender sender = new Sender();
        Recipient recipient = new Recipient();
        Message message = new Message();

        sender.setId("sender");
        recipient.setId("recipient");
        message.setText("Hi");
        messaging.setRecipient(recipient);
        messaging.setSender(sender);
        messaging.setMessage(message);
        entry.setId("121");
        entry.setMessaging(ImmutableList.of(messaging));
        request.setEntry(ImmutableList.of(entry));
        
        Assert.assertEquals(facebookConverter.convert(request).getMessage().getText(), "Hi");

    }
}
