package alfa.house.search.model;

import java.util.Date;

public class RequestSearch {
    private String text;
    private String city;
    private Double priceMin;
    private Double priceMax;
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
    private int startPage;
    private int endPage;
    private String currency;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setOrderBy(int orderBy) {
        OrderBy = orderBy;
    }

    public int getOrderBy() {
        return OrderBy;
    }

    private int OrderBy; //0-priceLowFirst 2-ratingBestFirst

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getStartPage() {
        return startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPriceMin(Double priceMin) {
        this.priceMin = priceMin;
    }

    public void setPriceMax(Double priceMax) {
        this.priceMax = priceMax;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public void setBedQty(int bedQty) {
        BedQty = bedQty;
    }

    public void setBathhQty(int bathhQty) {
        BathhQty = bathhQty;
    }

    public void setBedRoomQty(int bedRoomQty) {
        BedRoomQty = bedRoomQty;
    }

    public void setDekQty(int dekQty) {
        DekQty = dekQty;
    }

    public void setWithPatio(boolean withPatio) {
        this.withPatio = withPatio;
    }

    public void setWithDog(boolean withDog) {
        this.withDog = withDog;
    }

    public void setWithCat(boolean withCat) {
        this.withCat = withCat;
    }

    public void setWithWash(boolean withWash) {
        this.withWash = withWash;
    }

    public void setWithDryer(boolean withDryer) {
        this.withDryer = withDryer;
    }

    public void setWithAirConditioner(boolean withAirConditioner) {
        this.withAirConditioner = withAirConditioner;
    }

    public void setWithFirePlace(boolean withFirePlace) {
        this.withFirePlace = withFirePlace;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public String getCity() {
        return city;
    }

    public Double getPriceMin() {
        return priceMin;
    }

    public Double getPriceMax() {
        return priceMax;
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
