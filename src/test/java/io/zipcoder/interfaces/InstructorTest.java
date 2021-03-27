package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import io.zipcoder.interfaces.People.Instructor;
import io.zipcoder.interfaces.People.Person;
import io.zipcoder.interfaces.People.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void testImplementation(){
        Instructor nobles = new Instructor(12, "Nobles");
        Assert.assertTrue(nobles instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor nobles = new Instructor(11, "Dolio");
        Assert.assertTrue(nobles instanceof Person);
    }



    @Test
    public void teach() {
        //Given
        Instructor nobles = new Instructor(12, "Nobles");
        Student mike = new Student(22, "Mike",80);

        //When
        double expected = 100.0;
        nobles.teach(mike, 20);
        double actual = mike.getTotalStudyTime();

        //Then

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void lecture() {
        //Given
        Instructor dolio = new Instructor(11, "Dolio");
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
}