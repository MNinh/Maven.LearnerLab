package io.zipcoder.interfaces.People;

public class Person {

        public final long id;
        public String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }



}
