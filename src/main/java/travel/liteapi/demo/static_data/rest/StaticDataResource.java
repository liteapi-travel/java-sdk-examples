package travel.liteapi.demo.static_data.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import travel.liteapi.demo.static_data.service.StaticDataService;

@RestController
public class StaticDataResource {

    @Autowired
    private StaticDataService staticDataService;

    @GetMapping("/cities")
    public ResponseEntity<Object> cities() {
        Object res = staticDataService.cities();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/countries")
    public ResponseEntity<Object> countries() {
        Object res = staticDataService.countries();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/currencies")
    public ResponseEntity<Object> currencies() {
        Object res = staticDataService.currencies();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


    @GetMapping("/hotels")
    public ResponseEntity<Object> hotels() {
        Object res = staticDataService.hotels();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/hotel")
    public ResponseEntity<Object> hotelDetail() {
        Object res = staticDataService.hotelDetail();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }


    @GetMapping("/iata")
    public ResponseEntity<Object> iata() {
        Object res = staticDataService.iata();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
