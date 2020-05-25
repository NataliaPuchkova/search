package alfa.house.search.model;

import java.util.Date;
import java.util.List;

public class Deal {
    private User hoster;
    private User guest;
    private Date start;
    private Date end;
    private Double price;
    private List<Message> messages;
    private int status; //0-reserved 1-feature 2 - in progress 3-finished 4 -closed 5-canceledByHoster 6-canceled By Guest 7 balance
    private PriceInfo priceDeal;

    public List<Message> getMessages() {
        return messages;
    }

    public Deal setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public PriceInfo getPriceDeal() {
        return priceDeal;
    }

    public void setPriceDeal(PriceInfo priceDeal) {
        this.priceDeal = priceDeal;
    }

    public User getHoster() {
        return hoster;
    }

    public User getGuest() {
        return guest;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Double getPrice() {
        return price;
    }

    public int getStatus() {
        return status;
    }

    public Deal setHoster(User hoster) {
        this.hoster = hoster;
        return this;
    }

    public Deal setGuest(User guest) {
        this.guest = guest;
        return this;
    }

    public Deal setStart(Date start) {
        this.start = start;
        return this;
    }

    public Deal setEnd(Date end) {
        this.end = end;
        return this;
    }

    public Deal setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Deal setStatus(int status) {
        this.status = status;
        return this;
    }
}
