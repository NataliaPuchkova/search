package alfa.house.search.model;

import java.util.Date;

public class Message {
    private User from;
    private User to;
    private String text;
    private Date date;

    public Message setFrom(User from) {
        this.from = from;
        return this;
    }

    public Message setTo(User to) {
        this.to = to;
        return this;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public Message setDate(Date date) {
        this.date = date;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public User getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
