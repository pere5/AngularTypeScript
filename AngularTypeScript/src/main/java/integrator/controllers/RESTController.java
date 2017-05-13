package integrator.controllers;

import integrator.models.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class RESTController {

    private static List<Hero> HERO_LIST = new ArrayList<>();

    static {
        HERO_LIST.add(new Hero(11, "Mr. Nice"));
        HERO_LIST.add(new Hero(12, "Narco"));
        HERO_LIST.add(new Hero(13, "Bombaso"));
        HERO_LIST.add(new Hero(14, "Celeritas"));
        HERO_LIST.add(new Hero(15, "Magenta"));
        HERO_LIST.add(new Hero(16, "Rubberman"));
        HERO_LIST.add(new Hero(17, "Dynama"));
        HERO_LIST.add(new Hero(18, "Dr IQ"));
        HERO_LIST.add(new Hero(19, "Magma"));
        HERO_LIST.add(new Hero(20, "Tornado"));
    }

    @GetMapping(value="/api/heroes")
    public List<Hero> getHeroes() {
        return HERO_LIST;
    }

    @GetMapping(value="/api/heroes/{id}")
    public Hero getHero(@PathVariable("id") int heroId) {
        for (Hero hero: HERO_LIST) {
            if (hero.getId() == heroId) {
                return hero;
            }
        }
        return null;
    }

    @PutMapping(value="/api/heroes/{id}")
    public boolean updateHero(@PathVariable("id") int heroId, @RequestBody Hero newHero) {
        for (int i = 0; i < HERO_LIST.size() ; i++) {
            Hero hero = HERO_LIST.get(i);
            if (hero.getId() == newHero.getId()) {
                HERO_LIST.set(i, newHero);
                return true;
            }
        }
        return false;
    }

    @PostMapping(value="/api/heroes")
    public Hero addHero(@RequestBody Hero newHero) {
        if (HERO_LIST.contains(newHero)) {
            return null;
        } else {
            HERO_LIST.add(newHero);
            return newHero;
        }
    }

    @DeleteMapping(value="/api/heroes/{id}")
    public boolean deleteHero(@PathVariable("id") int heroId) {
        return HERO_LIST.remove(new Hero(heroId, ""));
    }
}