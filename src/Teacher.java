public class Teacher extends Person {
    private Integer teacherCode;

    public Teacher(Integer id, String name, String lastname, String email, String password, String role, Integer teacherCode) {
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