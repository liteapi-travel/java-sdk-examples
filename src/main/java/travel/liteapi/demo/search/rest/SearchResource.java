package travel.liteapi.demo.search.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import travel.liteapi.demo.search.service.SeachService;

@RestController
public class SearchResource {

    @Autowired
    private  SeachService seachService;

    @GetMapping("/minimumRates")
    public ResponseEntity<Object> minimumRates() {
        Object res = seachService.minimumRates();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/fullRatest")
    public ResponseEntity<Object> fullRatest() {
        Object res = seachService.fullRatest();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    
}
