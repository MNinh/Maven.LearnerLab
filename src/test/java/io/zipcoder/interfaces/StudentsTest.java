package io.zipcoder.interfaces;

import io.zipcoder.interfaces.People.Student;
import io.zipcoder.interfaces.People.Students;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void instanceStudentsTest(){

    Students students = Students.getInstance();

    Integer expected = 14;
    Integer actual = students.count();

    Assert.assertEquals(expected, actual);

    }


}