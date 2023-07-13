package travel.liteapi.demo.booking_management.service;

import org.springframework.stereotype.Service;

import travel.liteapi.client.api.BookingManagementApi;
import travel.liteapi.demo.ConfigLiteApi;

@Service
public class BookingManagementService {
    BookingManagementApi bookingManagementInstance = new BookingManagementApi(ConfigLiteApi.getDefaultClient());

    public Object bookingListByGuestId() {
        String guestId = "FrT56hfty";
        Object result = bookingManagementInstance.getBookingListByGuestId(guestId);
        return result;
    }

    public Object retrieveBook() {
        String bookingId = "orxiDMATP";
        Object result = bookingManagementInstance.retrievedBooking(bookingId);
        return result;

    }

    public Object cancelBook() {
        String bookingId = "orxiDMATP";
        Object result = bookingManagementInstance.cancelBooking(bookingId);
        return result;
    }

}
