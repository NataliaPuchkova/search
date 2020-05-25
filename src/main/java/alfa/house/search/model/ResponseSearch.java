package alfa.house.search.model;

import java.util.List;

public class ResponseSearch {
    private List<Inventory> list;

    public ResponseSearch setList(List<Inventory> list) {
        this.list = list;
        return this;
    }

    public List<Inventory> getList() {
        return list;
    }
}
