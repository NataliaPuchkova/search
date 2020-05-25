package alfa.house.search.controller;

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
    @GetMapping(value = "/hello")
    public String getHello(){
        return "Hello world!";
    }

}

