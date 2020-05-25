package alfa.house.search.model;

public class Img {

    private String name;
    private boolean isFirst;
    private String small;
    private String medium;
    private String large;


    public Img setName(String name) {
        this.name = name;
        return this;
    }

    public Img setFirst(boolean first) {
        isFirst = first;
        return this;
    }

    public Img setSmall(String small) {
        this.small = small;
        return this;
    }

    public Img setMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public Img setLarge(String large) {
        this.large = large;
        return this;
    }

    public String getName() {
        return name;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public String getSmall() {
        return small;
    }

    public String getMedium() {
        return medium;
    }

    public String getLarge() {
        return large;
    }
}
