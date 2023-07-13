package travel.liteapi.demo.booking_management.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import travel.liteapi.demo.booking_management.service.BookingManagementService;

@RestController
public class BookingManagementResource {
      @Autowired
    private BookingManagementService bookingManagementService;

    @GetMapping("/bookingList")
    public ResponseEntity<Object> bookingListByGuestId() {
        Object res = bookingManagementService.bookingListByGuestId();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/retrieveBook")
    public ResponseEntity<Object> retrieveBook() {
        Object res = bookingManagementService.retrieveBook();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

        @GetMapping("/cancelBook")
    public ResponseEntity<Object> cancelBook() {
        Object res = bookingManagementService.cancelBook();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
