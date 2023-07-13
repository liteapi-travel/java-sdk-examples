package travel.liteapi.demo.book.service;

import org.springframework.stereotype.Service;

import travel.liteapi.client.ApiClient;
import travel.liteapi.client.Configuration;
import travel.liteapi.client.api.BookApi;
import travel.liteapi.client.auth.ApiKeyAuth;
import travel.liteapi.demo.ConfigLiteApi;

@Service
public class BookService {

    BookApi bookInstance = new BookApi(ConfigLiteApi.getDefaultClient());

    public Object prebook() {
        String rateId = "NRYDCZRZHAZHYMRQGIZS2MBXFUYTK7BSGAZDGLJQG4WTCNT4GJ6HYVKTPRDVSWSEJVMVUV2HIUZUOS2OKJKEOWKZKRCU2QSXJVETGRCTJZKEMR2ZGNMFSTKKIRDUSWKEIVGVUUKHGRMVISZXIJJUOQK2IRDU2QSYI5CTGSCZLJGE6TBVJNLEON2DKZFU4NSGJNKTERKQKFNEKQ2NINCFAUK2IRCU6QSUKBJEWVCFKZJVST2KGZCEGTSSLFEEKWSEJVHEUVSIIFMVIQ2OLJLEWNJUJBKVUWSEI5CVURCTJZBFER2BKJKEKT2CKNDFKWKUIVHUUVKHIVMUQWKUKNJUSWSIJBMU2USRI5CTIVCDJVBFERZVGZCEGN2CKJDTIWSUKNGUERCLJJEFGR2UKNJUSWSIINDU2USRI5CTIUZSJVFFCRSVLFKE67CVKNCHY7D4GE4TSLRZHB6DEMBRHEWTCMBNGE3XYQSPPQYTEOJUGEYHYMQ";
        Object result = bookInstance.preBook(rateId);
        return result;
    }

    public Object book() {
        String prebookId = "RffyyG5ym";
        String guestFirstName = "Kim";
        String guestLastName = "James";
        String guestEmail = "test@nlite.ml";

        String holderName = "Kim James";
        String paymentMethod = "CREDIT_CARD";
        String card_number = "4242424242424242";
        String exp_month = "11";
        String exp_year = "23";
        Integer cvc = 123;
        String token = null;
        Object result = bookInstance.book(prebookId, guestFirstName, guestLastName, guestEmail, paymentMethod,
                holderName, card_number, exp_month, exp_year, cvc, token);
        return result;
    }
}
