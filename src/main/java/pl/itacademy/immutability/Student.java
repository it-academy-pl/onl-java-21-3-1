package pl.itacademy.immutability;

import java.util.Objects;

//public class Student extends Person {
public class Student {
    private String universityName;

    public Student(String firstName, String lastName, Address address, String universityName) {
//        super(firstName, lastName, address);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(universityName, student.universityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), universityName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityName='" + universityName + '\'' +
                "} " + super.toString();
    }
}
