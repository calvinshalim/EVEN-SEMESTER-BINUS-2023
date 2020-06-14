package Project;

/**
 * teacher can act as a student to
 */
public class Teacher extends User implements IsSchoolStaff {
    private String Division;
    private String shift;
    private String username;
    private String password;

    public Teacher() {
        super();
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }


    @Override
    public String getshift() {
        return shift;
    }

    @Override
    public void setshift(String shift) {
        this.shift = shift;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher { " + super.toString() + ", Division= " + Division + "}\n";
    }


}

