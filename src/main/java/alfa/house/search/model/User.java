package alfa.house.search.model;

import java.util.List;

public class User {
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Double rate;
    private List<Deal> hosterDeals;
    private List<Deal> clientDeals;
    private List<Message> messages;

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setRate(Double rate) {
        this.rate = rate;
        return this;
    }

    public User setHosterDeals(List<Deal> hosterDeals) {
        this.hosterDeals = hosterDeals;
        return this;
    }
    public User setClientDeals(List<Deal> clientDeals) {
        this.clientDeals = clientDeals;
        return this;
    }

    public User setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Double getRate() {
        return rate;
    }

    public List<Deal> getHosterDeals() {
        return hosterDeals;
    }

    public List<Deal> getClientDeals() {
        return clientDeals;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
