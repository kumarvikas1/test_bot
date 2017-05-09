package com.github.kumarvikas1.core.request.hipchat.pojo;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Item {

    private Message message;
    private Room room;

    public Message getMessage() {
        return message;
    }


    public void setMessage(Message message) {
        this.message = message;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


}