import java.sql.*;

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

    public void addCourse(int code) {
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select teacherID from teacher where teacher_code = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, code);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("teacherID");
                String sql2 = "INSERT INTO course(courseID, courseName, coef, teacherID)" + " VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, courseID);
                preparedStatement2.setString(2, courseName);
                preparedStatement2.setString(3, coef);
                preparedStatement2.setInt(4, id);
                preparedStatement2.execute();
                preparedStatement2.close();
            } else {
                System.out.println("prof not found");
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }

    public void updateCourse(int code, int coursenewid) {
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select teacherID from teacher where teacher_code = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, code);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("teacherID");
                String sql2 = "UPDATE course SET courseID = ?, courseName = ?, coef = ?, teacherID = ? WHERE `course`.`courseID` = ?;";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, coursenewid);
                preparedStatement2.setString(2, courseName);
                preparedStatement2.setString(3, coef);
                preparedStatement2.setInt(4, id);
                preparedStatement2.setInt(5, courseID);
                preparedStatement2.executeQuery();
                preparedStatement2.close();
            } else {
                System.out.println("prof not found");
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }

    public void deleteCourse() {
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "DELETE FROM course WHERE course.courseID = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, courseID);
            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }

    public void searchCourse() {

    }

}
