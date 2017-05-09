package com.github.kumarvikas1.web.facade.facebook;

import com.github.kumarvikas1.bots.service.ChatBotService;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.request.facebook.pojo.Message;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.concurrent.CompletableFuture;

/**
 * Created by vikakumar on 5/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FacebookInterpreter.class)
@WebAppConfiguration
@ComponentScan
public class FacebookInterpreterTest {

    @Autowired
    FacebookInterpreter facebookInterpreter;

    @MockBean
    ChatBotService chatBotService;


    @Test
    public void test_facebook_interprets_response() {

        //GIVEN
        Message message = new Message();
        message.setText("Hi");
        FacebookRequest facebookRequest = FacebookRequest.of(message, "sender");
        com.github.kumarvikas1.core.response.facebook.Message message_res = new com.github.kumarvikas1.core.response.facebook.Message();
        message_res.setText("How Can I Help");
        Mockito.when(chatBotService.getMessage(facebookRequest)).thenReturn(CompletableFuture.completedFuture(message_res));


        //WHEN
        String expectedText = facebookInterpreter.interpret(facebookRequest).getMessage().getText();

        //THEN
        Assert.assertEquals(expectedText, "How Can I Help");
    }
}
