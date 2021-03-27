package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington {

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){

        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        ArrayList<Student> students = new ArrayList<Student>();
        for(Student student : students){
            studyMap.put(student, student.getTotalStudyTime());

        }
        return studyMap;
    }

}
