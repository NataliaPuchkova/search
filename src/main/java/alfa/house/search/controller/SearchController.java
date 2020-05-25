package alfa.house.search.controller;

import alfa.house.search.model.RequestSearch;
import alfa.house.search.model.ResponseSearch;
import alfa.house.search.service.SearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Api(value = "Task Controller", description = "Operation with tasks")
public class SearchController {

    @Autowired
    SearchService service;

    @GetMapping(value = "/hello")
    public String getHello(){
        return "Hello world!";
    }

    @ApiOperation(value = "Returns all list of invetories.", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PostMapping(value = "/getAll", consumes = "application/json", produces = "application/json")
    public ResponseSearch getAllTask(){
        return service.getAll();
    }

    @ApiOperation(value = "Returns all list of invetories.", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PostMapping(value = "/search", consumes = "application/json", produces = "application/json")
    public ResponseSearch getByRequest(@RequestBody RequestSearch request){
        return service.getByRequest(request);
    }

}

