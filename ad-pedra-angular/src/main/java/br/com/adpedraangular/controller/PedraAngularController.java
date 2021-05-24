package br.com.adpedraangular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PedraAngularController {
    
    @GetMapping
    public ModelAndView home(){
        var mv = new ModelAndView("home.html");
        return mv;
    }
}
