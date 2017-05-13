package integrator.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class GetController {

    @GetMapping(value="/api/heroes")
    public List<Map<String, Object>> getCategorySuggestions() {
        List<Map<String, Object>> heroList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heroList.add(new HashMap<>());
        }
        heroList.get(0).put("id", 11);
        heroList.get(0).put("name", "Mr. Nice");
        heroList.get(1).put("id", 12);
        heroList.get(1).put("name", "Narco");
        heroList.get(2).put("id", 13);
        heroList.get(2).put("name", "Bombaso");
        heroList.get(3).put("id", 14);
        heroList.get(3).put("name", "Celeritas");
        heroList.get(4).put("id", 15);
        heroList.get(4).put("name", "Magenta");
        heroList.get(5).put("id", 16);
        heroList.get(5).put("name", "Rubberman");
        heroList.get(6).put("id", 17);
        heroList.get(6).put("name", "Dynama");
        heroList.get(7).put("id", 18);
        heroList.get(7).put("name", "Dr IQ");
        heroList.get(8).put("id", 19);
        heroList.get(8).put("name", "Magma");
        heroList.get(9).put("id", 20);
        heroList.get(9).put("name", "Tornado");
        return heroList;
    }
}