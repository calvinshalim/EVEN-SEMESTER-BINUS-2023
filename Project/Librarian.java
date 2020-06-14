package Project;

/**
 * just for login as an admin only
 */
public class Librarian implements IsSchoolStaff {
    private String username;
    private String password;
    private String shift;



    public Librarian() {
        this.username = "calvin";
        this.password = "alibi";
        this.shift = "everyday";
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getshift() {
        return shift;
    }

    @Override
    public void setshift(String shift) {
        this.shift = shift;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


