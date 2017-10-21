package demo.rest;

import demo.domain.SupplyLocation;
import demo.domain.SupplyLocationRepository;
import demo.service.SupplyLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplyLocationRestController {

    private SupplyLocationService service;

    private SupplyLocationRepository repository;

    @Autowired
    public SupplyLocationRestController(SupplyLocationRepository repository, SupplyLocationService service){
        this.repository = repository;
        this.service = service;
    }


    @RequestMapping(value = "/supplylocations", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    private void upload(@RequestBody List<SupplyLocation> locations){
        repository.save(locations);
    }


}
