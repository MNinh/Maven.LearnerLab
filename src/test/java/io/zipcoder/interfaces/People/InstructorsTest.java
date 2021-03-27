package io.zipcoder.interfaces.People;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void instanceInstructorsTest(){

        Instructors instructors = Instructors.getInstance();

        Integer expected = 3;
        Integer actual = instructors.count();

        Assert.assertEquals(expected, actual);

    }

}