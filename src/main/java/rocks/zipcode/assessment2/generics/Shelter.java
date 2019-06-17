package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> extends Ageable implements Iterable<T>{

    List<Ageable> list;
    public Shelter() {
        this.list = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.list.size();
    }

    public void add(Ageable object) {
        this.list.add(object);
    }

    public Boolean contains(Object object) {
        return this.list.contains(object);
    }

    public void remove(Object object) { this.list.remove(object);
    }

    public Object get(Integer index) {
        return this.list.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return this.list.indexOf(ageable);
    }

    public Iterator<T>  iterator(){
        return this.iterator();
    }
}