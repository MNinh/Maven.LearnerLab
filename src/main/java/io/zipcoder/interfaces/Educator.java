package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.Instructor;
import io.zipcoder.interfaces.People.Instructors;

public enum Educator implements Teacher {
    Kris (10, "Kris"),
    Dolio (11, "Dolio"),
    Chris (12, "Chris");

    private Instructor instructor;
    private double timeWorked;

    private Educator(long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public Instructor getInstructor(){
        return instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;

    }

    public double getTimeWorked(){
        return this.timeWorked;
    }
}
