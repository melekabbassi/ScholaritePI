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
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "INSERT INTO person(firstName, lastName, mail, role, password)" + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, "teacher");
            preparedStatement.setString(5, "mouchrajel");
            preparedStatement.execute();
            preparedStatement.close();
            String sql2 = "SELECT id FROM person WHERE firstName = ? AND lastName = ?";
            PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement2.setString(1, name);
            preparedStatement2.setString(2, lastname);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String sql3 = "INSERT INTO teacher(teacherID, teacher_code)" + " VALUES (?, ?)";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setInt(1, id);
                preparedStatement3.setInt(2, teacherCode);
                preparedStatement3.execute();
                preparedStatement3.close();
            }
            preparedStatement2.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void updatePerson(Integer newCode) {
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select teacherID from teacher where teacher_code = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, teacherCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("teacherID"));
                System.out.print(id);
                String sql2 = "UPDATE teacher SET teacher_code = ? WHERE teacher.teacherID = ?;";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, newCode);
                preparedStatement2.setInt(2, id);
                preparedStatement2.execute();
                String sql3 = "UPDATE person SET firstName = ? , lastName = ? , mail = ? WHERE person.id = ?;";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setString(1, name);
                preparedStatement3.setString(2, lastname);
                preparedStatement3.setString(3, email);
                preparedStatement3.setInt(4, id);
                preparedStatement3.execute();
                preparedStatement2.close();
                preparedStatement3.close();
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void deletePerson() {
        try {
            final String DB_URL = "jdbc:mysql://localhost/scolaritepi?serverTimezone=UTC";
            final String USERNAME = "root";
            final String PASSWORD = "";
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            // Connected to database successfully...
            String sql = "select teacherID from teacher where teacher_code = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, teacherCode);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("teacherID"));
                System.out.print(id);
                String sql2 = "DELETE FROM teacher WHERE teacher.teacherID = ?";
                PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                preparedStatement2.setInt(1, id);
                preparedStatement2.execute();
                String sql3 = "DELETE FROM person WHERE person.id = ?";
                PreparedStatement preparedStatement3 = conn.prepareStatement(sql3);
                preparedStatement3.setInt(1, id);
                preparedStatement3.execute();
                preparedStatement2.close();
                preparedStatement3.close();
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connexion failed!");
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void searchPerson() {
        // TODO Auto-generated method stub

    }

}