package com.github.kumarvikas1.bots.service;

import com.github.kumarvikas1.bots.pojo.Instruction;
import com.github.kumarvikas1.bots.pojo.Leg;
import com.github.kumarvikas1.bots.rest.TflRestFactory;
import com.github.kumarvikas1.core.response.facebook.Message;
import com.google.common.base.Joiner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * Created by vikakumar on 5/4/17.
 */
@Component
public class TflResponse {

    @Autowired
    private TflRestFactory restTemplateFactory;

    public CompletableFuture<Message> travel(String from, String to, String date) {
        Message message = new Message();
        try {
            message.setText(getString(from, to, date));
            return CompletableFuture.completedFuture(message);
        } catch (URISyntaxException e) {
            message.setText("Oops, please try again");
            return CompletableFuture.completedFuture(message);
        }
    }

    private String getString(String from, String to, String date) throws URISyntaxException {
        return restTemplateFactory.getJourney(from, to, date).map(f ->
                Joiner.on("\n").join("Here you Go", f.get(0).getLegs().stream().
                        map(Leg::getInstruction).map(Instruction::getSummary).collect(Collectors.joining("\n")))
        ).orElse("Sorry, You Destination is not correct");
    }

}