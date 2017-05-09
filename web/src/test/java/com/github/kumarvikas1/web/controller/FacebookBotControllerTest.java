package com.github.kumarvikas1.web.controller;


import com.github.kumarvikas1.web.converter.facebook.FacebookConverter;
import com.github.kumarvikas1.web.facade.facebook.FacebookInterpreter;
import com.github.kumarvikas1.web.rest.FacebookRestFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FacebookBotController.class)
@AutoConfigureMockMvc
public class FacebookBotControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FacebookRestFactory facebookRestFactory;
    @MockBean
    private FacebookConverter facebookConverter;
    @MockBean
    private FacebookInterpreter facebookInterpreter;


    @Test
    public void test_webhook_is_working() throws Exception {
        //GIVEN

        //WHEN
        ResultActions resultActions = mockMvc.perform(get("/facebook_health/webhook?hub.verify_token=1&hub.challenge=challenge"));

        //THEN
        resultActions.andExpect(status().isOk())
                .andExpect(content().string(containsString("cha")));
    }
}
