package alfa.house.search.service;

import alfa.house.search.model.Inventory;
import alfa.house.search.model.RequestSearch;
import alfa.house.search.model.ResponseSearch;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SearchServiceImpl implements SearchService{

    @Override
    public ResponseSearch getAll() {
        return null;
    }

    @Override
    public ResponseSearch getByRequest(RequestSearch request) {
        return getSimpleData();
    }

    private ResponseSearch getSimpleData(){
        return getMockResponse();
    }

    private ResponseSearch getMockResponse(){
        return (new ResponseSearch()).setList(getMockListInventory());
    }

    private List<Inventory> getMockListInventory(){
        List<Inventory> list = new ArrayList<Inventory>();
        list.add(getMockInv1());
        list.add(getMockInv2());
        return list;
    }

    private Inventory getMockInv1(){
        Inventory inv = new Inventory();
        inv.setBathhQty(3).setBedQty(2).setBedRoomQty(2).setDekQty(1).setCity("San Jose");
        inv.setBathhQty(1);
        return inv;
    }

    private Inventory getMockInv2(){
        Inventory inv = new Inventory();
        inv.setBathhQty(3).setBedQty(2).setBedRoomQty(1).setDekQty(0).setCity("San Frnacisco");
        return inv;
    }
}
