package alfa.house.search.model;

import java.util.Date;

public class Review {

    private int rate;
    private Date date;
    private User user;
    private Review answer;

    public int getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }

    public Review setRate(int rate) {
        this.rate = rate;
        return this;
    }

    public Review setDate(Date date) {
        this.date = date;
        return this;
    }

    public Review setUser(User user) {
        this.user = user;
        return this;
    }

    public Review setAnswer(Review answer) {
        this.answer = answer;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Review getAnswer() {
        return answer;
    }


}

