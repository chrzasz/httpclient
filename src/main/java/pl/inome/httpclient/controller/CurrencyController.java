package pl.inome.httpclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import pl.inome.httpclient.model.currecny.Currency;

import java.math.BigDecimal;

@Controller
public class CurrencyController {

    @GetMapping("/currency")
    public String get(Model model, @RequestParam String plnRate) {
        model.addAttribute("plnRate", checkCurrency(plnRate));
        model.addAttribute("cnt", new String());
        return "currencyView";
    }

    private int checkCurrency(String plnRate) {
        String plnRateTrim = plnRate.trim();
        if (!plnRateTrim.isEmpty() && plnRateTrim.matches("[0-9]{1,}[.]{0,1}[0-9]{0,2}")) {
            try {
                BigDecimal value = BigDecimal.valueOf(Double.parseDouble(plnRateTrim));
                return value.compareTo(getPlnRate());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return -2;
    }

    private Currency getCurrency() {
        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject(
                "https://api.exchangeratesapi.io/latest?base=USD&symbols=PLN", Currency.class);
        return currency;
    }

    private BigDecimal getPlnRate() {
        Currency currency = getCurrency();
        return currency
                .getRates()
                .getPLN()
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }


}
