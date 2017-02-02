package edu.tomer;


public class Student {
    //properties
    String firstName;
    String lastName;

    //Constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //default constructor
    public Student() {
        this.firstName = IO.getString("Enter First Name");
        this.lastName = IO.getString("Enter Last Name");
    }

    void whatYourName() {
        System.out.printf(
                "My name is: %s - %s\n",
                this.firstName,
                this.lastName
        );
    }

    void replaceYourNameWith(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
