package pl.inome.httpclient.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ChuckNorrisController {

    private ChuckJoke getChuckJoke() {
        RestTemplate restTemplate = new RestTemplate();
        ChuckJoke joke = restTemplate.getForObject(
                "http://api.icndb.com/jokes/random/10", ChuckJoke.class);
        return joke;
    }

    @GetMapping("chuck-joke")
    public String get(Model model) {
        model.addAttribute("chuckJoke", getChuckJoke());
        return "chuckJoke";
    }
}
