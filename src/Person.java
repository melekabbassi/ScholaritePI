public class Person {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String role;
    
    public Person(int id, String name, String lastname, int age, String email, String role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
    }

    // constructor without parameters
    public Person() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
}
