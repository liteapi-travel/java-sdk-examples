package travel.liteapi.demo.static_data.service;

import org.springframework.stereotype.Service;

import travel.liteapi.demo.ConfigLiteApi;

import travel.liteapi.client.api.StaticDataApi;

@Service
public class StaticDataService {

    StaticDataApi staticDataInstance = new StaticDataApi(ConfigLiteApi.getDefaultClient());
    public Object cities() {
        String countryCode = "IT";
        Object result = staticDataInstance.getCitiesByCountryCode(countryCode);
        return result;
    }

    public Object countries() {
        Object result = staticDataInstance.getCountries();
        return result;
    }

    public Object currencies() {
        Object result = staticDataInstance.getCurrencies();
        return result;
    }

    public Object hotels() {
        String countryCode = "IT";
        String cityName = "Rome";
        //Optional values
        Integer offset = 10;
        Integer limit = 1000;
        String longitude = "-115.16988";
        String latitude = "36.12510";
        Integer distance = 1000;
        Object result = staticDataInstance.getHotels(countryCode, cityName, offset, limit, longitude, latitude, null);
        return result;
    }

    public Object hotelDetail() {
        String hotelId =  "lp24373";
        Object result = staticDataInstance.getHotelDetails(hotelId);
        return result;
    }

    public Object iata() {
        Object result = staticDataInstance.getIataCodes();
        return result;
    }

}
