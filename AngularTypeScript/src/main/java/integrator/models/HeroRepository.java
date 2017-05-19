package integrator.models;

/**
 * Created by pere5 on 2017-05-17.
 */
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface HeroRepository extends MongoRepository<Hero, String> {

    @Query("{ 'name' : { $regex: ?0 } }")
    List<Hero> findHeroesByRegexpName(String regexp);
    Hero findById(String id);

}
