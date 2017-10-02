package com.example.demo;

public class Student {

    String firstName;
    String lastName;
    Grade grade;
    boolean enrolled;

    public Student() {}

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Grade getGrade() { return grade; }

    public void setGrade(Grade grade) { this.grade = grade; }

    public String isEnrolled() {
        if(this.enrolled) {
            return "Yes";
        }else return "No";
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade + '\'' +
                ", enrolled='" + enrolled +
                '}';
    }
}
