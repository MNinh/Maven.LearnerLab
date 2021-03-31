package io.zipcoder.interfaces.People;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){

        for( E i : personList) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    public boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void remove(long id){
        for( Person i : personList) {
            if (i.getId() == id) {
                personList.remove(i);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] newArray = new Person[personList.size()];
        for(int i = 0; i < personList.size(); i++){
            newArray[i] = personList.get(i);
        }
        return newArray;
    }


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
