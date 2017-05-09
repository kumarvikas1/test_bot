package com.github.kumarvikas1.web.controller;

import com.github.kumarvikas1.core.request.hipchat.pojo.Request;
import com.github.kumarvikas1.core.response.hipchat.Text;
import com.github.kumarvikas1.web.converter.hipchat.HipChatConverter;
import com.github.kumarvikas1.web.facade.hipchat.HipChatInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vikakumar on 4/28/17.
 */
@RestController
@RequestMapping("/health")
public class HipChatBotController {

    @Autowired
    HipChatInterpreter hipChatInterpreter;
    @Autowired
    HipChatConverter hipChatConverter;


    @RequestMapping(method = RequestMethod.POST)

    public ResponseEntity<Text> health(@RequestBody Request request) {
        return new ResponseEntity(hipChatInterpreter.interpret(hipChatConverter.convert(request)), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity alive() {
        return new ResponseEntity(HttpStatus.OK);
    }

}
