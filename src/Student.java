public class Student extends Person {
    private Integer studentCode;

    public Student(Integer id, String name, String lastname, String email, String password, String role, Integer studentCode) {
        super(id, name, lastname, email, password, role);
        this.studentCode = studentCode;
    }

    public Student() {
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }


    @Override
    public void addPerson() {
        // TODO Auto-generated method stub
        
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