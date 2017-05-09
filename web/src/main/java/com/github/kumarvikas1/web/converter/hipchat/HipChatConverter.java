package com.github.kumarvikas1.web.converter.hipchat;

import com.github.kumarvikas1.core.chat.HipChatRequest;
import com.github.kumarvikas1.core.request.hipchat.pojo.Request;
import org.springframework.stereotype.Component;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class HipChatConverter {


    public HipChatRequest convert(Request request) {
        return HipChatRequest.get(request.getItem().getMessage());
    }

}
