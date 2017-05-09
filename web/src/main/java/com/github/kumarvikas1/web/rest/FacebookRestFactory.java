package com.github.kumarvikas1.web.rest;

import com.github.kumarvikas1.core.response.facebook.Webhook;
import com.google.common.base.Joiner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vikakumar on 5/7/17.
 */
@Component
public class FacebookRestFactory {
    private final RestTemplate restTemplate = new RestTemplate();


    public void postFacebook(Webhook webhook, String facebook_api, String access_token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(webhook, headers);
        try {
            restTemplate.exchange(Joiner.on("").join(facebook_api, access_token), HttpMethod.POST, httpEntity, String.class);
        } catch (HttpClientErrorException e) {
            System.out.println("aasdfdf");
        }
    }

}
