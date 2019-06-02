package sample;

import java.util.Date;

public class User {

    public enum Gender {
        Male, Female, Other
    }

    public String username;
    private String password;
    private Date birthday;
    private int id;
    private Gender sex;
    public Avatar avatar = new Avatar();

    public User(String username, String password, Date birtday, int id, Gender sex) {
        this.username = username;
        this.password = password;
        this.birthday = birtday;
        this.id = id;
        this.sex = sex;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birtday) {
        this.birthday = birthday;
    }


    public void setId(int id) {
        this.id = id;
    }

    public Gender getSex(){
        return this.sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }



    public boolean isLoggedIn(User user) {
        return meetHUBWorld.loggedinUsers.contains(user);
    }

    public long retUserID() {
        return id;
    }


}
