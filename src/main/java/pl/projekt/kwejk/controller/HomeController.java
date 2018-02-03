package pl.projekt.kwejk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.projekt.kwejk.model.Gif;


@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
       modelMap.addAttribute("gif",new Gif("compiler-bot"));
        return "home";
    }
}
