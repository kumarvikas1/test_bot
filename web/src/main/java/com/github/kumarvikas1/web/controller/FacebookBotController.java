package com.github.kumarvikas1.web.controller;

import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.request.facebook.pojo.Request;
import com.github.kumarvikas1.core.response.facebook.Webhook;
import com.github.kumarvikas1.web.converter.facebook.FacebookConverter;
import com.github.kumarvikas1.web.facade.facebook.FacebookInterpreter;
import com.github.kumarvikas1.web.rest.FacebookRestFactory;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vikakumar on 4/28/17.
 */
@RestController
@RequestMapping("/facebook_health")
public class FacebookBotController {

    private FacebookConverter facebookConverter;
    private FacebookInterpreter facebookInterpreter;
    private FacebookRestFactory facebookRestFactory;

    @Value("${ACCESS_TOKEN}")
    private String access_token;
    @Value("${FACEBOOK_API}")
    private String facebook_api;

    @Autowired
    public FacebookBotController(FacebookConverter facebookConverter, FacebookInterpreter facebookInterpreter, FacebookRestFactory facebookRestFactory) {
        this.facebookConverter = facebookConverter;
        this.facebookInterpreter = facebookInterpreter;
        this.facebookRestFactory = facebookRestFactory;
    }


    @RequestMapping(value = "/webhook", method = RequestMethod.POST)
    public ResponseEntity<Webhook> health(@RequestBody Request body) {
        FacebookRequest facebookRequest = facebookConverter.convert(body);
        Webhook webhook = facebookInterpreter.interpret(facebookRequest);
        postMessage(webhook);
        return new ResponseEntity(HttpStatus.OK);
    }

    private void postMessage(Webhook webhook) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(webhook, headers);
        new RestTemplate().exchange(Joiner.on("").join(facebook_api, access_token), HttpMethod.POST, httpEntity, String.class);
    }


    @RequestMapping(value = "/webhook", method = RequestMethod.GET)
    public ResponseEntity webhook(@RequestParam("hub.verify_token") String token,
                                  @RequestParam("hub.challenge") String challenge) {
        return new ResponseEntity(challenge, HttpStatus.OK);
    }


}
