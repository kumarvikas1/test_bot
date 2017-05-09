package com.github.kumarvikas1.bots.rest;

import com.github.kumarvikas1.bots.pojo.Journey;
import com.github.kumarvikas1.bots.pojo.Tfl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

/**
 * Created by vikakumar on 5/7/17.
 */
@Component
public class TflRestFactory {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${TFL_API}")
    private String tfl_service;

    public Optional<List<Journey>> getJourney(String from, String to, String date) throws URISyntaxException, HttpServerErrorException {
        return Optional.ofNullable(new RestTemplate().getForObject(new URI(MessageFormat.format(tfl_service, from, to, date.replaceAll("-", ""))), Tfl.class).getJourneys());
    }

}
