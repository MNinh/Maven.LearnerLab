package io.zipcoder.interfaces.People;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<type extends Person> implements Iterable<Person>{

    List<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){

        for( Person i : personList) {
            if (i.getId() == id) {
                return i;
            }

        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
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


    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
