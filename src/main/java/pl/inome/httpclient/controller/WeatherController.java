package pl.inome.httpclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import pl.inome.httpclient.model.weather.WeatherForCity;

@Controller
public class WeatherController {

    @Value("${api-openweathermap.url}")
    private String url;
    @Value("${api-openweathermap.appid}")
    private String appid;

    public WeatherController() {
    }

    private WeatherForCity getWeatherForCity(String city) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherForCity weather = new WeatherForCity();
        weather = restTemplate.getForObject(url + city + "&appid=" + appid, WeatherForCity.class);
        String iconName = weather.getWeather().get(0).getIcon();
        String imgUrl = "http://openweathermap.org/img/w/" + iconName + ".png";
        weather.getWeather().get(0).setSrc(imgUrl);
        return weather;
    }

    @GetMapping("/weather")
    public String get(Model model, @RequestParam String city) {
        model.addAttribute("weather", getWeatherForCity(city));
        return "weatherView";
    }


}
