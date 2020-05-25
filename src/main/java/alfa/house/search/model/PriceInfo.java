package alfa.house.search.model;

import org.springframework.boot.autoconfigure.mongo.embedded.DownloadConfigBuilderCustomizer;

public class PriceInfo {
    private Double priceDay;
    private Double priceMoth;
    private Double cleaningFee;
    private Double secirityDeposite;
    private int typeOfPayment; //0-cashe 1-paypal 2 - using website
    private Double other;
    private String textOther;

    public Double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(Double priceDay) {
        this.priceDay = priceDay;
    }

    public Double getPriceMoth() {
        return priceMoth;
    }

    public void setPriceMoth(Double priceMoth) {
        this.priceMoth = priceMoth;
    }

    public Double getCleaningFee() {
        return cleaningFee;
    }

    public void setCleaningFee(Double cleaningFee) {
        this.cleaningFee = cleaningFee;
    }

    public Double getSecirityDeposite() {
        return secirityDeposite;
    }

    public void setSecirityDeposite(Double secirityDeposite) {
        this.secirityDeposite = secirityDeposite;
    }

    public int getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(int typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public String getTextOther() {
        return textOther;
    }

    public void setTextOther(String textOther) {
        this.textOther = textOther;
    }

    public Double getDiscountForDaysPercent() {
        return discountForDaysPercent;
    }

    public void setDiscountForDaysPercent(Double discountForDaysPercent) {
        this.discountForDaysPercent = discountForDaysPercent;
    }

    public Double getDiscountForDaysTotal() {
        return discountForDaysTotal;
    }

    public void setDiscountForDaysTotal(Double discountForDaysTotal) {
        this.discountForDaysTotal = discountForDaysTotal;
    }

    public Double getDiscountDays() {
        return discountDays;
    }

    public void setDiscountDays(Double discountDays) {
        this.discountDays = discountDays;
    }

    private Double discountForDaysPercent; //percent
    private Double discountForDaysTotal; //percent
    private Double discountDays; //percent

}
