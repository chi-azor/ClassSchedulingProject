package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassSchedulerApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Staff> staff = new ArrayList<>();
        List<Floor> floors = new ArrayList<>();
        List<Timing> timings = new ArrayList<>();
        List<Day> days = new ArrayList<>();
        List<Classroom> classrooms = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Class Scheduling System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Add Staff");
            System.out.println("4. Add Floor");
            System.out.println("5. Add Timing");
            System.out.println("6. Add Day");
            System.out.println("7. Add Classroom");
            System.out.println("8. Enroll Student in Course");
            System.out.println("9. List Students");
            System.out.println("10. List Courses");
            System.out.println("11. List Staff");
            System.out.println("12. List Floors");
            System.out.println("13. List Timings");
            System.out.println("14. List Days");
            System.out.println("15. List Classrooms");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.print("Enter Student ID: ");
                    student.setStudentId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Last Name: ");
                    student.setLastname(scanner.nextLine());
                    System.out.print("Enter First Name: ");
                    student.setFirstname(scanner.nextLine());
                    System.out.print("Enter Date of Birth (DOB): ");
                    student.setDob(scanner.nextLine());
                    System.out.print("Enter Gender: ");
                    student.setGender(scanner.nextLine());
                    System.out.print("Enter Email: ");
                    student.setEmail(scanner.nextLine());
                    System.out.print("Enter Address: ");
                    student.setAddress(scanner.nextLine());
                    System.out.print("Enter City: ");
                    student.setCity(scanner.nextLine());
                    System.out.print("Enter State: ");
                    student.setState(scanner.nextLine());
                    System.out.print("Enter Registration Date: ");
                    student.setRegDate(scanner.nextLine());
                    students.add(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    Course course = new Course();
                    System.out.print("Enter Course Code: ");
                    course.setCourseCode(scanner.nextLine());
                    System.out.print("Enter Course Title: ");
                    course.setTitle(scanner.nextLine());
                    System.out.print("Enter Course Description: ");
                    course.setDesc(scanner.nextLine());
                    System.out.print("Enter Course Duration: ");
                    course.setDuration(scanner.nextLine());
                    System.out.print("Enter Course Outline: ");
                    course.setOutline(scanner.nextLine());

                    System.out.print("Enter Floor ID for Course: ");
                    int floorId = scanner.nextInt();
                    Floor selectedFloor = findFloorById(floors, floorId);
                    if (selectedFloor != null) {
                        course.setFloor(selectedFloor);
                    } else {
                        System.out.println("Floor not found. Course added without floor.");
                    }

                    System.out.print("Enter Timing ID for Course: ");
                    int timingId = scanner.nextInt();
                    Timing selectedTiming = findTimingById(timings, timingId);
                    if (selectedTiming != null) {
                        course.setTiming(selectedTiming);
                    } else {
                        System.out.println("Timing not found. Course added without timing.");
                    }

                    List<Day> selectedDays = new ArrayList<>();
                    while (true) {
                        System.out.print("Enter Day ID for Course (0 to finish): ");
                        int dayId = scanner.nextInt();
                        if (dayId == 0) {
                            break;
                        }
                        Day selectedDay = findDayById(days, dayId);
                        if (selectedDay != null) {
                            selectedDays.add(selectedDay);
                        } else {
                            System.out.println("Day not found. Course added without days.");
                            break;
                        }
                    }
                    course.setDays(selectedDays);

                    System.out.print("Enter Classroom ID for Course: ");
                    int classroomId = scanner.nextInt();
                    Classroom selectedClassroom = findClassroomById(classrooms, classroomId);
                    if (selectedClassroom != null) {
                        course.setClassroom(selectedClassroom);
                    } else {
                        System.out.println("Classroom not found. Course added without classroom.");
                    }

                    courses.add(course);
                    System.out.println("Course added successfully.");
                    break;

                case 3:
                    Staff staffMember = new Staff();
                    System.out.print("Enter Staff ID: ");
                    staffMember.setStaffId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Last Name: ");
                    staffMember.setLastname(scanner.nextLine());
                    System.out.print("Enter First Name: ");
                    staffMember.setFirstname(scanner.nextLine());
                    System.out.print("Enter Date of Birth (DOB): ");
                    staffMember.setDob(scanner.nextLine());
                    System.out.print("Enter Gender: ");
                    staffMember.setGender(scanner.nextLine());
                    System.out.print("Enter Phone Number: ");
                    staffMember.setPhoneNo(scanner.nextLine());
                    System.out.print("Enter Email: ");
                    staffMember.setEmail(scanner.nextLine());
                    System.out.print("Enter Address: ");
                    staffMember.setAddress(scanner.nextLine());
                    System.out.print("Enter City: ");
                    staffMember.setCity(scanner.nextLine());
                    System.out.print("Enter State: ");
                    staffMember.setState(scanner.nextLine());
                    System.out.print("Enter Department ID: ");
                    staffMember.setDeptId(scanner.nextInt());
                    staff.add(staffMember);
                    System.out.println("Staff member added successfully.");
                    break;

                case 4:
                    Floor floor = new Floor();
                    System.out.print("Enter Floor ID: ");
                    floor.setId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Floor Number: ");
                    floor.setFloorNo(scanner.nextInt());
                    floors.add(floor);
                    System.out.println("Floor added successfully.");
                    break;

                case 5:
                    Timing timing = new Timing();
                    System.out.print("Enter Timing ID: ");
                    timing.setTimingId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Start Time: ");
                    timing.setStart(scanner.nextLine());
                    System.out.print("Enter End Time: ");
                    timing.setEnd(scanner.nextLine());
                    timings.add(timing);
                    System.out.println("Timing added successfully.");
                    break;

                case 6:
                    Day day = new Day();
                    System.out.print("Enter Day ID: ");
                    day.setId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Day: ");
                    day.setDay(scanner.nextLine());
                    days.add(day);
                    System.out.println("Day added successfully.");
                    break;

                case 7:
                    Classroom classroom = new Classroom();
                    System.out.print("Enter Classroom ID: ");
                    classroom.setId(scanner.nextInt());
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Classroom Name: ");
                    classroom.setName(scanner.nextLine());
                    classrooms.add(classroom);
                    System.out.println("Classroom added successfully.");
                    break;

                case 8:
                    System.out.println("Enroll Student in Course:");
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course Code: ");
                    String courseCode = scanner.nextLine();

                    Student studentToEnroll = findStudentById(students, studentId);
                    Course courseToEnroll = findCourseByCode(courses, courseCode);

                    if (studentToEnroll != null && courseToEnroll != null) {
                        studentToEnroll.enrollInCourse(courseToEnroll);
                        System.out.println("Student with ID " + studentId + " enrolled in Course with Code " + courseCode + ".");
                    } else {
                        System.out.println("Student or Course not found. Enrollment failed.");
                    }
                    break;

                case 9:
                    System.out.println("List of Students:");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 10:
                    System.out.println("List of Courses:");
                    for (Course c : courses) {
                        System.out.println(c);
                    }
                    break;

                case 11:
                    System.out.println("List of Staff Members:");
                    for (Staff st : staff) {
                        System.out.println(st);
                    }
                    break;

                case 12:
                    System.out.println("List of Floors:");
                    for (Floor f : floors) {
                        System.out.println(f);
                    }
                    break;

                case 13:
                    System.out.println("List of Timings:");
                    for (Timing t : timings) {
                        System.out.println(t);
                    }
                    break;

                case 14:
                    System.out.println("List of Days:");
                    for (Day d : days) {
                        System.out.println(d);
                    }
                    break;

                case 15:
                    System.out.println("List of Classrooms:");
                    for (Classroom cl : classrooms) {
                        System.out.println(cl);
                    }
                    break;

                case 16:
                    System.out.println("Exiting Class Scheduling System. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Helper methods to find objects by ID or code
    private static Student findStudentById(List<Student> students, int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    private static Course findCourseByCode(List<Course> courses, String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    private static Floor findFloorById(List<Floor> floors, int floorId) {
        for (Floor floor : floors) {
            if (floor.getId() == floorId) {
                return floor;
            }
        }
        return null;
    }

    private static Timing findTimingById(List<Timing> timings, int timingId) {
        for (Timing timing : timings) {
            if (timing.getTimingId() == timingId) {
                return timing;
            }
        }
        return null;
    }

    private static Day findDayById(List<Day> days, int dayId) {
        for (Day day : days) {
            if (day.getId() == dayId) {
                return day;
            }
        }
        return null;
    }

    private static Classroom findClassroomById(List<Classroom> classrooms, int classroomId) {
        for (Classroom classroom : classrooms) {
            if (classroom.getId() == classroomId) {
                return classroom;
            }
        }
        return null;
    }
}