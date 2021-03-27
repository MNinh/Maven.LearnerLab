package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Interface.Learner;

public class Student extends Person implements Learner {
    double totalStudyTime;

    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
