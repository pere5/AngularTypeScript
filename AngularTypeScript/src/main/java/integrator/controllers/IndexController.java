package integrator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Per Eriksson on 2017-05-02.
 */


@Controller
public class IndexController {

    @RequestMapping("/")
    public String greeting(Model model) {
        return "index";
    }
}
