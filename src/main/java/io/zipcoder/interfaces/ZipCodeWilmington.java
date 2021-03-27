package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor =  instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){

        Map<Student, Double> studyMap = new HashMap<Student, Double>();

        for(Student student : students){
            studyMap.put(student, student.getTotalStudyTime());

        }
        return studyMap;
    }

}
