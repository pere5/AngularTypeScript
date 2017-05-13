package integrator.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class GetController {

    private static List<Map<String, Object>> HERO_LIST = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            HERO_LIST.add(new HashMap<>());
        }
        HERO_LIST.get(0).put("id", 11);
        HERO_LIST.get(0).put("name", "Mr. Nice");
        HERO_LIST.get(1).put("id", 12);
        HERO_LIST.get(1).put("name", "Narco");
        HERO_LIST.get(2).put("id", 13);
        HERO_LIST.get(2).put("name", "Bombaso");
        HERO_LIST.get(3).put("id", 14);
        HERO_LIST.get(3).put("name", "Celeritas");
        HERO_LIST.get(4).put("id", 15);
        HERO_LIST.get(4).put("name", "Magenta");
        HERO_LIST.get(5).put("id", 16);
        HERO_LIST.get(5).put("name", "Rubberman");
        HERO_LIST.get(6).put("id", 17);
        HERO_LIST.get(6).put("name", "Dynama");
        HERO_LIST.get(7).put("id", 18);
        HERO_LIST.get(7).put("name", "Dr IQ");
        HERO_LIST.get(8).put("id", 19);
        HERO_LIST.get(8).put("name", "Magma");
        HERO_LIST.get(9).put("id", 20);
        HERO_LIST.get(9).put("name", "Tornado");
    }
    @GetMapping(value="/api/heroes")
    public List<Map<String, Object>> getHeroes() {
        return HERO_LIST;
    }

    @GetMapping(value="/api/heroes/{id}")
    public Map<String, Object> getHeroById(@PathVariable("id") int heroId) {
        for (Map<String, Object> hero: HERO_LIST) {
            if ((int)hero.get("id") == heroId) {
                return hero;
            }
        }
        return null;
    }
}