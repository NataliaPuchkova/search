package alfa.house.search.model;

import org.w3c.dom.ls.LSInput;

import java.util.Date;
import java.util.List;

public class Inventory {
    private String uid;
    private String text;
    private String city;
    private Double priceDay;
    private Double priceMonth;
    private Date startDate;
    private Date endDate;
    private int priceType;// 0 - oer day, 1 - per month
    private int BedQty;
    private int BathhQty;
    private int BedRoomQty;
    private int DekQty;
    private boolean withPatio;
    private boolean withDog;
    private boolean withCat;
    private boolean withWash;
    private boolean withDryer;
    private boolean withAirConditioner;
    private boolean withFirePlace;
    private int type; // 0-house, 1-townhouse, 3-appratment, 4-other
    private List<NoAvailabale> notAvailability;
    private List<Review> reviews;
    private User hoster;
    private List<Img> images;
    private PriceInfo priceInfo;

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public Inventory setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }

    public Inventory setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Inventory setNotAvailability(List<NoAvailabale> notAvailability) {
        this.notAvailability = notAvailability;
        return this;
    }

    public Inventory setReviews(List<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public Inventory setHoster(User hoster) {
        this.hoster = hoster;
        return this;
    }

    public Inventory setImages(List<Img> images) {
        this.images = images;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public List<NoAvailabale> getNotAvailability() {
        return notAvailability;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public User getHoster() {
        return hoster;
    }

    public List<Img> getImages() {
        return images;
    }

    public Inventory setText(String text) {
        this.text = text;
        return this;
    }

    public Inventory setCity(String city) {
        this.city = city;
        return this;
    }

    public Inventory setPriceDay(Double priceMin) {
        this.priceDay = priceMin;
        return this;
    }

    public Inventory setPriceMonth(Double priceMax) {
        this.priceMonth = priceMax;
        return this;
    }

    public Inventory setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Inventory setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Inventory setPriceType(int priceType) {
        this.priceType = priceType;
        return this;
    }

    public Inventory setBedQty(int bedQty) {
        BedQty = bedQty;
        return this;
    }

    public Inventory setBathhQty(int bathhQty) {
        BathhQty = bathhQty;
        return this;
    }

    public Inventory setBedRoomQty(int bedRoomQty) {
        BedRoomQty = bedRoomQty;
        return this;
    }

    public Inventory setDekQty(int dekQty) {
        DekQty = dekQty;
        return this;
    }

    public Inventory setWithPatio(boolean withPatio) {
        this.withPatio = withPatio;
        return this;
    }

    public Inventory setWithDog(boolean withDog) {
        this.withDog = withDog;
        return this;
    }

    public Inventory setWithCat(boolean withCat) {
        this.withCat = withCat;
        return this;
    }

    public Inventory setWithWash(boolean withWash) {
        this.withWash = withWash;
        return this;
    }

    public Inventory setWithDryer(boolean withDryer) {
        this.withDryer = withDryer;
        return this;
    }

    public Inventory setWithAirConditioner(boolean withAirConditioner) {
        this.withAirConditioner = withAirConditioner;
        return this;
    }

    public Inventory setWithFirePlace(boolean withFirePlace) {
        this.withFirePlace = withFirePlace;
        return this;
    }

    public Inventory setType(int type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public String getCity() {
        return city;
    }

    public Double getPriceDay() {
        return priceDay;
    }

    public Double getPriceMonth() {
        return priceMonth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getPriceType() {
        return priceType;
    }

    public int getBedQty() {
        return BedQty;
    }

    public int getBathhQty() {
        return BathhQty;
    }

    public int getBedRoomQty() {
        return BedRoomQty;
    }

    public int getDekQty() {
        return DekQty;
    }

    public boolean isWithPatio() {
        return withPatio;
    }

    public boolean isWithDog() {
        return withDog;
    }

    public boolean isWithCat() {
        return withCat;
    }

    public boolean isWithWash() {
        return withWash;
    }

    public boolean isWithDryer() {
        return withDryer;
    }

    public boolean isWithAirConditioner() {
        return withAirConditioner;
    }

    public boolean isWithFirePlace() {
        return withFirePlace;
    }

    public int getType() {
        return type;
    }



}
