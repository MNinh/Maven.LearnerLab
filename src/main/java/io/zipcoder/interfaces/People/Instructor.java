package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);

    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner i : learners){
            i.learn(numberOfHoursPerLearner);
        }
    }
}
