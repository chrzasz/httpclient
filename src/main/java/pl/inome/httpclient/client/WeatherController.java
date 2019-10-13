package pl.inome.httpclient.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    private String url;

    public WeatherController() {
        url = "http://api.openweathermap.org/data/2.5/weather?q=warsaw&appid=746907dfc4a678a82cb90d4325705aa7";
    }

    private WeatherForCity getWeatherForCity() {
        RestTemplate restTemplate = new RestTemplate();
        WeatherForCity weather = new WeatherForCity();
        weather = restTemplate.getForObject(url, WeatherForCity.class);

        String iconName = weather.getWeather().get(0).getIcon();
        String imgUrl = "http://openweathermap.org/img/w/" + iconName + ".png";
        weather.getWeather().get(0).setSrc(imgUrl);
        return weather;
    }

    @GetMapping("/weather")
    public String get(Model model) {
        model.addAttribute("weather", getWeatherForCity());
        return "weatherView";
    }

}
