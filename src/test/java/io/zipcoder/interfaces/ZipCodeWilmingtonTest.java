package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture() {
        //Given
        Instructors instructor = Instructors.getInstance();
        Students student = Students.getInstance();
        ZipCodeWilmington zipcdoe = new ZipCodeWilmington();
        //When
        zipcdoe.hostLecture(12, 20);
        double expected = 100;
        Student learner = (Student) student.findById(22);
        double actual = learner.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual,0);
    }
}