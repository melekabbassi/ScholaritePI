import java.sql.*;

public class Teacher extends Person {
    private Integer teacherCode;

    public Teacher(Integer id, String name, String lastname, String email, String password, String role,
            Integer teacherCode) {
        super(id, name, lastname, email, password, role);
        this.teacherCode = teacherCode;
    }

    public Teacher() {
    }

    public Integer getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(Integer teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public void addPerson() {
        final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...

            String sql = "INSERT INTO TABLE person(firstName, lastName, mail, role, password) VALUES (?, ?, ?,teacher,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, "");
            preparedStatement.executeQuery();
            preparedStatement.close();
            String sql2 = "SELECT id FROM person WHERE firstName = ? AND lastName = ?";
            PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement2.setString(1, name);
            preparedStatement2.setString(2, lastname);
            conn.close();

        } catch (Exception e) {
            System.out.println("Database connexion failed!");
        }

    }

    @Override
    public void updatePerson() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deletePerson() {
        // TODO Auto-generated method stub

    }

    @Override
    public void searchPerson() {
        // TODO Auto-generated method stub

    }

}