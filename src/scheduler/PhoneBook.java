package scheduler;

public class PhoneBook {
    private int phoneId;
    private int studentId;
    private String phoneNo;

    public PhoneBook() {
        // Default constructor
    }

    public PhoneBook(int phoneId, int studentId, String phoneNo) {
        this.phoneId = phoneId;
        this.studentId = studentId;
        this.phoneNo = phoneNo;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}