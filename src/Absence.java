import java.sql.*;

public class Absence {
    private Integer number;
    Student student;
    Course course;

    public Absence(Integer number) {
        this.number = number;
    }

    public Absence() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public void addAbsence() {
        final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            String sql = "INSERT INTO absence(number) VALUES (?) WHERE studentID = ? AND courseID = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, number);
            preparedStatement.executeQuery();
            preparedStatement.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Database connexion failed!");
        }        
    }

    public void updateAbsence() {
        // TODO Auto-generated method stub

    }

    public void deleteAbsence() {

    }

    public void searchAbsence() {

    }

    public void displayAbsence() {

    }
}
