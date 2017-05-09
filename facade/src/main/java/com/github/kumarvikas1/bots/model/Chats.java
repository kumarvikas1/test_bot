package com.github.kumarvikas1.bots.model;

import com.github.kumarvikas1.bots.enums.Flows;
import com.github.kumarvikas1.core.chat.BotRequest;

/**
 * Created by vikakumar on 5/4/17.
 */
public class Chats {
    private String userId;
    private Flows flows;
    private BotRequest botRequest;

    public void setBotRequest(BotRequest botRequest) {
        this.botRequest = botRequest;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFlows(Flows flows) {
        this.flows = flows;
    }

    public BotRequest getBotRequest() {
        return botRequest;
    }

    public String getUserId() {
        return userId;
    }

    public Flows getFlows() {
        return flows;
    }

    public static Chats of(String userId, Flows flows, BotRequest botRequest) {
        Chats retval = new Chats();
        retval.setUserId(userId);
        retval.setBotRequest(botRequest);
        retval.setFlows(flows);
        return retval;
    }
}
