package integrator.controllers;

import integrator.models.Hero;
import integrator.models.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by pere5 on 2017-05-17.
 */
@RestController
public class RESTController {

    @Autowired
    private HeroRepository repository;

    @GetMapping(value="/api/heroes")
    public List<Hero> getHeroes() {
        return repository.findAll();
    }

    @GetMapping(value="/api/heroes/{id}")
    public Hero getHero(@PathVariable("id") String heroId) {
        return repository.findById(heroId);
    }

    @PutMapping(value="/api/heroes/{id}")
    public Hero updateHero(@PathVariable("id") String heroId, @RequestBody Hero newHero) {
        newHero.setId(heroId);
        return repository.save(newHero);
    }

    @PostMapping(value="/api/heroes")
    public Hero addHero(@RequestBody Hero newHero) {
        return repository.save(newHero);
    }

    @DeleteMapping(value="/api/heroes/{id}")
    public void deleteHero(@PathVariable("id") String heroId) {
        repository.delete(heroId);
    }

    @GetMapping("/api/heroes/")
    public List<Hero> getHeroesByName(@RequestParam(value="name", defaultValue="") String name) {
        return repository.findHeroesByRegexpName(name);
    }
}