package pl.projekt.kwejk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.projekt.kwejk.model.Gif;
import pl.projekt.kwejk.repository.GifRespository;


@Controller
public class HomeController {

    private GifRespository gifRespository = new GifRespository();

    @GetMapping("/")
    public String hello(ModelMap modelMap){
       modelMap.addAttribute("gifs",gifRespository.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String getFavorites(ModelMap modelMap){
        modelMap.addAttribute("gifs",gifRespository.findFavorites());
        return "favorites";
    }
}
