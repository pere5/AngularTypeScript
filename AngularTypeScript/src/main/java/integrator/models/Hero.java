package integrator.models;

import org.springframework.data.annotation.Id;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by pere5 on 2017-05-13.
 */
public class Hero {

    @Id private String id;
    private String name;

    public Hero() {
        id = String.valueOf(ThreadLocalRandom.current().nextInt(1, 9999));
    }

    public Hero(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
