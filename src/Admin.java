public class Admin extends Person {
    private Integer adminCode;

    public Admin(Integer id, String name, String lastname, String email, String password, String role,
            Integer adminCode) {
        super(id, name, lastname, email, password, role);
        this.adminCode = adminCode;
    }

    public Admin() {
    }

    public Integer getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(Integer adminCode) {
        this.adminCode = adminCode;
    }

    @Override
    public void addPerson() {
        // TODO Auto-generated method stub

    }

    @Override
    public void updatePerson(Integer newCode) {
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
