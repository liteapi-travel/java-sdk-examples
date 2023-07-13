package travel.liteapi.demo.guest_loyalty.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import travel.liteapi.demo.guest_loyalty.service.GuestAndLoyaltyService;

@RestController
public class GuestAndLoyaltyResource {

    @Autowired
    private GuestAndLoyaltyService guestAndLoyaltyService;

    @GetMapping("/guests")
    public ResponseEntity<Object> guestsIds() {
        Object res = guestAndLoyaltyService.guestsIds();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/guestsByEmail")
    public ResponseEntity<Object> GuestsIdsByEmail() {
        Object res = guestAndLoyaltyService.GuestsIdsByEmail();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
