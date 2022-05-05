public class Course {
    private Integer courseID;
    private String courseName;
    private String coef;

    public Course(Integer courseID, String courseName, String coef) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.coef = coef;
    }

    public Course() {
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoef() {
        return coef;
    }

    public void setCoef(String coef) {
        this.coef = coef;
    }

    public void addCourse() {

    }

    public void updateCourse() {

    }

    public void deleteCourse() {

    }

    public void searchCourse() {

    }

}
