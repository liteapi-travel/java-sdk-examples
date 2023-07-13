package travel.liteapi.demo;

import travel.liteapi.client.ApiClient;
import travel.liteapi.client.Configuration;
import travel.liteapi.client.auth.ApiKeyAuth;

public class ConfigLiteApi {
    public static ApiClient getDefaultClient() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiKeyAuth apikeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyAuth");
        apikeyAuth.setApiKey("YOUR_API_KEY");
        return defaultClient;
    }
}
