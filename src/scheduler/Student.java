package scheduler;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String lastname;
    private String firstname;
    private String dob;
    private String gender;
    private String email;
    private String address;
    private String city;
    private String state;
    private String regDate;
    private List<Course> enrolledCourses; // List to store enrolled courses

    public Student() {
        enrolledCourses = new ArrayList<>();
    }

    public Student(int studentId, String lastname, String firstname, String dob, String gender,
                   String email, String address, String city, String state, String regDate) {
        this.studentId = studentId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.regDate = regDate;
        enrolledCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", regDate='" + regDate + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}