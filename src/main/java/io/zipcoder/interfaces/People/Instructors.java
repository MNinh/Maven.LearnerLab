package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Educator;

import java.util.List;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor dolio = Educator.Dolio.getInstructor();
        Instructor younger = Educator.Kris.getInstructor();
        Instructor nobles = Educator.Chris.getInstructor();

        this.add(dolio);
        this.add(younger);
        this.add(nobles);

    }

    public static Instructors getInstance() {

        return INSTANCE;
    }


    public Instructor[] getArray(){
        List<Instructor> instructorsList = this.personList;
        Instructor[] instructorsArray = new Instructor[instructorsList.size()];
        for(int i = 0; i < instructorsList.size(); i++){
            instructorsArray[i] = instructorsList.get(i);
        }
        return instructorsArray;
    }

}
