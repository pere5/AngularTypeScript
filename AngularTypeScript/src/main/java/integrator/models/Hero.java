package integrator.models;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by pere5 on 2017-05-13.
 */
public class Hero {
    private int id;
    private String name;

    public Hero() {
        id = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
    }

    public Hero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;

        Hero hero = (Hero) o;

        return getId() == hero.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
