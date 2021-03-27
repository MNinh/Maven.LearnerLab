package io.zipcoder.interfaces;

import io.zipcoder.interfaces.People.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    private String name;
    private long id;

    @Test
    public void personTest(){
        //Given
        String expectedName = "Mike";
        long expectedId = 222222;

        //When
        Person mike = new Person(expectedId, expectedName);
        String actualName = mike.getName();
        long actualId = mike.getId();
        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }



    @Test
    public void setNameTest() {
        //Given
        Person person = new Person(id, name);
        String expected = "Mike";
        //When
        person.setName("Mike");
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
