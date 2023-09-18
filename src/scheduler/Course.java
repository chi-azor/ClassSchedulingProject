package scheduler;

import java.util.List;
public class Course {
    private String courseCode;
    private String title;
    private String desc;
    private String duration;
    private String outline;
    private Floor floor;
    private Timing timing;
    private List<Day> days;
    private Classroom classroom;

    public Course() {
        // Default constructor
    }

    public Course(String courseCode, String title, String desc, String duration, String outline) {
        this.courseCode = courseCode;
        this.title = title;
        this.desc = desc;
        this.duration = duration;
        this.outline = outline;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", duration='" + duration + '\'' +
                ", outline='" + outline + '\'' +
                ", floor=" + floor +
                ", timing=" + timing +
                ", days=" + days +
                ", classroom=" + classroom +
                '}';
    }
}