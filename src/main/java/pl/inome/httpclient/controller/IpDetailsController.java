package pl.inome.httpclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import pl.inome.httpclient.model.IpDetails;

@Controller
public class IpDetailsController {

    public IpDetailsController() {
    }

    private IpDetails getIpDetails() {
        RestTemplate restTemplate = new RestTemplate();
        IpDetails ipDetails = new IpDetails();
        try {
            ipDetails = restTemplate.getForObject("https://ipapi.co/json/", IpDetails.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ipDetails;
    }

    @GetMapping("/ip-details")
    public String get(Model model) {
        model.addAttribute("ipDetails", getIpDetails());
        return "ipView";
    }
}
