package pl.inome.httpclient.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class IpDetailsController {

    public IpDetailsController() {
    }

    private IpDetails getIpDetails() {
        RestTemplate restTemplate = new RestTemplate();
        IpDetails ipDetails = restTemplate.getForObject("https://ipapi.co/json/", IpDetails.class);
        return ipDetails;
    }

    @GetMapping("/ip-details")
    public String get(Model model) {
        model.addAttribute("ipDetails", getIpDetails());
        return "ipView";
    }
}
