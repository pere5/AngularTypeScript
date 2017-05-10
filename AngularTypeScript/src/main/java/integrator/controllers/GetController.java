package integrator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class GetController {

    @GetMapping(value="/whatever")
    public Map<String, String> getCategorySuggestions(@RequestBody(required=false) Map<String, String> whatever) {
        Map<String, String> lol = new HashMap<>();
        lol.put("fdsjhf", "sdd");
        return lol;
    }
}