package com.github.kumarvikas1.core.request.facebook.pojo;

import java.util.List;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Request {

    private String object;
    private List<Entry> entry = null;

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public String getObject() {
        return object;
    }
}
