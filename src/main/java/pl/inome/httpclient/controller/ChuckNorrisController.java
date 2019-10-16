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
        String noOfJokesTrim = noOfJokes.trim();
        RestTemplate restTemplate = new RestTemplate();
        if (!noOfJokesTrim.isEmpty() && noOfJokesTrim.matches("[0-9]{1,}")) {
            try {
                ChuckJoke joke = restTemplate.getForObject(
                        "http://api.icndb.com/jokes/random/" + noOfJokesTrim, ChuckJoke.class);
                return joke;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return restTemplate.getForObject(
                "http://api.icndb.com/jokes/random/0", ChuckJoke.class);
    }

    @GetMapping("chuck-joke")
    public String get(Model model, @RequestParam String cnt) {
        model.addAttribute("chuckJoke", getChuckJoke(cnt));
        return "chuckJokeView";
    }
}
