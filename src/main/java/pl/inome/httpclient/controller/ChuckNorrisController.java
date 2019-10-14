package pl.inome.httpclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import pl.inome.httpclient.model.ChuckJoke;

@Controller
public class ChuckNorrisController {

    private ChuckJoke getChuckJoke(String noOfJokes) {
        RestTemplate restTemplate = new RestTemplate();
        ChuckJoke joke = restTemplate.getForObject(
                "http://api.icndb.com/jokes/random/" + noOfJokes, ChuckJoke.class);
        return joke;
    }

    @GetMapping("chuck-joke")
    public String get(Model model, @RequestParam String cnt) {
        model.addAttribute("chuckJoke", getChuckJoke(cnt));
        return "chuckJoke";
    }
}
