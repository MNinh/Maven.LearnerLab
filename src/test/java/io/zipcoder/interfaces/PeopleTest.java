package io.zipcoder.interfaces;

import io.zipcoder.interfaces.People.People;
import io.zipcoder.interfaces.People.Person;
import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {

    Person mike = new Person(22, "Mike");
    Person xiong = new Person(24, "Xiong");
    Person lena = new Person(25, "Lena");
    Person monali = new Person(26, "Monali");


//    @Test
//    public void addTest() {
//        People<Person> people = new People<Person>();
//        people.add(mike);
//
//        boolean expected = true;
//        boolean actual = people.contains(mike);
//
//        Assert.assertTrue(actual);
//    }
//
//    @Test
//    public void removeTest() {
//        People<Person> people = new People<Person>();
//        people.add(mike);
//        people.remove(mike);
//
//        boolean actual = people.contains(mike);
//
//        Assert.assertFalse(actual);
//    }
//
//    @Test
//    public void removeAllTest() {
//        People<Person> people = new People<Person>();
//        people.add(mike);
//        people.add(xiong);
//        people.add(lena);
//        people.add(monali);
//        people.removeAll();
//
//        Integer expected = 0;
//        Integer actual = people.count();
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void findByIdTest() {
//        People<Person> people = new People<Person>();
//        people.add(mike);
//
//        Person expected = mike;
//        Person actual = people.findById(22);
//
//        Assert.assertEquals(expected, actual);
//
//
//    }
}
