package course.homeworkBeforeOOP.week3.homework312.password;

public class UserPass {
    private String user;
    private String password;

    public UserPass(String user) {
        this.setUser(user);
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
