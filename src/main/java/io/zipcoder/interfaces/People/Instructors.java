package io.zipcoder.interfaces.People;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        add(new Instructor(10, "Chris"));
        add(new Instructor(11, "Kris"));
        add(new Instructor(12, "Dolio"));

    }

    public static Instructors getInstance() {

        return INSTANCE;
    }

}
