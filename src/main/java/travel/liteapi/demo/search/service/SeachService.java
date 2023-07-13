package travel.liteapi.demo.search.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import travel.liteapi.client.api.SearchApi;
import travel.liteapi.demo.ConfigLiteApi;

@Service
public class SeachService {

    SearchApi searchInstance = new SearchApi(ConfigLiteApi.getDefaultClient());

    public Object minimumRates() {
        String[] hotelIds = {"lp3803c", "lp1f982", "lp19b70", "lp19e75"};
        String checkin = "2023-07-15";
        String checkout = "2023-07-16";
        String currency = "USD";
        String guestNationality = "US";
        Integer adults = 1;
        //Optional values
        Integer[] children = {2,3};
        String guestId = "traveler1";
        String strHotelIds = String.join(",", hotelIds);

        System.out.println(strHotelIds);
        String strChildren = Arrays.toString(children).replaceAll("\\[|\\]", "");
        System.out.println(strChildren);

        Object result = searchInstance.getMinimumRates(hotelIds, checkin, checkout, currency, guestNationality, adults, null, null);
        return result;
    }

    public Object fullRatest() {
        String[] hotelIds = {"lp3803c", "lp1f982", "lp19b70", "lp19e75"};
        String checkin = "2023-07-15";
        String checkout = "2023-07-16";
        String currency = "USD";
        String guestNationality = "US";
        Integer adults = 2;
        //Optional values
        Integer[] children = {2,3};
        String guestId = "traveler1";
        Object result = searchInstance.getFullRatest(hotelIds, checkin, checkout, currency, guestNationality, adults, null, null);
        return result;
    }

}
