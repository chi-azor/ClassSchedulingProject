package scheduler;

public class Staff {
    private int staffId;
    private String lastname;
    private String firstname;
    private String dob;
    private String gender;
    private String phoneNo;
    private String email;
    private String address;
    private String city;
    private String state;
    private int deptId;

    public Staff() {
        // Default constructor
    }

    public Staff(int staffId, String lastname, String firstname, String dob, String gender,
                 String phoneNo, String email, String address, String city, String state, int deptId) {
        this.staffId = staffId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dob = dob;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.deptId = deptId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}