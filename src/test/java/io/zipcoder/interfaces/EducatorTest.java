package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.Instructor;
import io.zipcoder.interfaces.People.Person;
import io.zipcoder.interfaces.People.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation(){
        Educator nobles = Educator.Chris;
        Assert.assertTrue(nobles instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Educator dolio = Educator.Dolio;
        Assert.assertTrue(dolio.getInstructor() instanceof Person);
    }



    @Test
    public void teach() {
        //Given
        Educator kris = Educator.Kris;
        Student mike = new Student(22, "Mike",80);

        //When
        double expected = 100.0;
        kris.teach(mike, 20);
        double actual = mike.getTotalStudyTime();

        //Then

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void lecture() {
        //Given
        Educator dolio = Educator.Dolio;
        Student mike = new Student(22, "Mike",80);
        Student xiong = new Student(24, "Xiong", 90);
        Learner[] learners = {mike, xiong};

        //When
        double expectedMike = 95.0;
        double expectedXiong = 105.0;

        dolio.lecture(learners,30);
        double actualMike = mike.getTotalStudyTime();
        double actualXiong = xiong.getTotalStudyTime();



        //Then

        Assert.assertEquals(expectedMike, actualMike, 0);
        Assert.assertEquals(expectedXiong, actualXiong, 0);
    }

    @Test
    public void workTimeTest() {
        //Given
        Educator dolio = Educator.Dolio;
        Student mike = new Student(22, "Mike", 80);
        Student xiong = new Student(24, "Xiong", 90);
        Learner[] learners = {mike, xiong};

        //When
        dolio.lecture(learners, 30);
        double expected = 60.0;
        double actual = Educator.Dolio.getTimeWorked();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }





}