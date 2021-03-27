package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.People.Person;
import io.zipcoder.interfaces.People.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Person Student;

    @Test
    public void testImplementation(){
        Student mike = new Student(22, "Mike",0);
        Assert.assertTrue(mike instanceof Learner);

    }

    @Test
    public void testInheritance(){
        Student mike = new Student(22, "Mike",0);
        Assert.assertTrue(mike instanceof Person);
    }


    @Test
    public void learnTest() {
        //Given
        Student mike = new Student(22, "Mike",0);
        double expectedStudyTime = 22.0;

        //When
        mike.learn(22);
        double actualStudyTime = mike.getTotalStudyTime();
        System.out.println(actualStudyTime);
        //Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime,0);
    }

    @Test
    public void getTotalStudyTimeTest() {
    }
}