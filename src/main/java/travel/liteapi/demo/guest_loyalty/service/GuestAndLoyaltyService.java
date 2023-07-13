package travel.liteapi.demo.guest_loyalty.service;

import org.springframework.stereotype.Service;

import travel.liteapi.client.api.GuestAndLoyaltyApi;
import travel.liteapi.demo.ConfigLiteApi;

@Service
public class GuestAndLoyaltyService {

    GuestAndLoyaltyApi guestAndLoyaltyInstance = new GuestAndLoyaltyApi(ConfigLiteApi.getDefaultClient());

    public Object guestsIds() {
        Object result = guestAndLoyaltyInstance.getGuests(null);
        return result;
    }

    public Object GuestsIdsByEmail() {
        String email = "johndoe@nlite.ml";
        Object result = guestAndLoyaltyInstance.getGuests(email);
        return result;
    }

}
