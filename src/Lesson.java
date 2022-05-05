public class Lesson {
    private Integer lessonID;
    private String lessonName;
    private String lessonDuration;

    public Lesson(Integer lessonID, String lessonName, String lessonDuration) {
        this.lessonID = lessonID;
        this.lessonName = lessonName;
        this.lessonDuration = lessonDuration;
    }

    public Lesson() {
    }

    public Integer getLessonID() {
        return lessonID;
    }

    public void setLessonID(Integer lessonID) {
        this.lessonID = lessonID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonDuration() {
        return lessonDuration;
    }

    public void setLessonDuration(String lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    public void addLesson() {

    }

    public void updateLesson() {

    }

    public void deleteLesson() {

    }

    public void searchLesson() {

    }
    
}
