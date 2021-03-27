package io.zipcoder.interfaces.People;

public class Students extends People<Student> {
    //Eager Initialization

    private static final Students INSTANCE = new Students();
//    private final Group<Student> studentList;

    private Students() {
        add(new Student(22, "Mike",80));
        add(new Student(24, "Xiong",80));
        add(new Student(25, "Chris",80));
        add(new Student(26, "Abe",80));
        add(new Student(27, "Ashley",80));
        add(new Student(28, "Ryan",80));
        add(new Student(29, "Theresa",80));
        add(new Student(30, "Kelly",80));
        add(new Student(31, "Greg",80));
        add(new Student(32, "Jorge",80));
        add(new Student(33, "Hazel",80));
        add(new Student(34, "Justin",80));
        add(new Student(35, "Monali",80));
        add(new Student(36, "Lena",80));
    }

    public static Students getInstance() {

        return INSTANCE;
    }
}
