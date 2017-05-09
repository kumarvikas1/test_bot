package com.github.kumarvikas1.web.converter.facebook;

import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.request.facebook.pojo.Messaging;
import com.github.kumarvikas1.core.request.facebook.pojo.Request;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class FacebookConverter {

    public FacebookRequest convert(Request request) {
        return FacebookRequest.of(getMessaging(request).get(0).getMessage(), getMessaging(request).get(0).getSender().getId());
    }

    private List<Messaging> getMessaging(Request request) {
        return request.getEntry().get(0).getMessaging();
    }
}
