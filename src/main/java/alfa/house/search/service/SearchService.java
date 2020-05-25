package alfa.house.search.service;

import alfa.house.search.model.RequestSearch;
import alfa.house.search.model.ResponseSearch;

public interface SearchService {

    ResponseSearch getAll();
    ResponseSearch getByRequest(RequestSearch request);


}
