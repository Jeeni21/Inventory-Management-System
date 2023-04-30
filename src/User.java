import java.util.ArrayList;
import java.util.List;

public class User  {

    String username;
    String password;
    boolean permission;
    static List<User> userList = new ArrayList<>();
    
    //For the permission admin is equals to true and employee is equal to false

    public User() {

    }

    public User(String username, String password, boolean permission) {
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    public User username(String username) {
        setUsername(username);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User permission(boolean permission) {
        setPermission(permission);
        return this;
    }
    public void add(User user){
        userList.add(user);
    }
    @Override
    public String toString(){
        String role = permission?"admin":"employee";
        return "User name is "+username+" has a role of "+role;
    }
}