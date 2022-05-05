public class Administration extends Person{
    private Integer adminisCode;

    public Administration(Integer id, String name, String lastname, String email, String password, String role, Integer adminisCode) {
        super(id, name, lastname, email, password, role);
        this.adminisCode = adminisCode;
    }

    public Administration() {
    }

    public Integer getAdminisCode() {
        return adminisCode;
    }

    public void setAdminisCode(Integer adminisCode) {
        this.adminisCode = adminisCode;
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
