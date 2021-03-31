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
        ZipCodeWilmington zipcode = new ZipCodeWilmington();

        //When
        Teacher kris = instructor.findById(10);
        Student mike = student.findById(22);
        double expected = 100;
        zipcode.hostLecture(kris, 280);
        double actual = mike.getTotalStudyTime();



        //Then
        Assert.assertEquals(expected, actual,0);
    }


    @Test
    public void testHostLecture2() {
        //Given

        Students student = Students.getInstance();
        ZipCodeWilmington zipcode = new ZipCodeWilmington();

        //When
        Educator dolio = Educator.Dolio;
        Student mike = student.findById(22);
        double expected = 100;
        zipcode.hostLecture(dolio, 280);
        double actual = mike.getTotalStudyTime();



        //Then
        Assert.assertEquals(expected, actual,0);
    }

//    @Test
//    public void getStudyMapTest(){
//
//        Students student = Students.getInstance();
//        ZipCodeWilmington zipcode = new ZipCodeWilmington();
//
//        //When
//        zipcode.getStudyMap();
//        System.out.println(zipcode.getStudyMap());


//    }

}