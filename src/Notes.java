public class Notes {
    private Integer note;
    private Student student;
    private Course course;

    public Notes(Integer note, Student student, Course course) {
        this.note = note;
        this.student = student;
        this.course = course;
    }

    public Notes() {
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Calculate the average of the notes of a student

    public void CalculeMoyenne() {

    }
    
}
