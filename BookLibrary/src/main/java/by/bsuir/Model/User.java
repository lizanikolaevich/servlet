package by.bsuir.Model;

public class User {
    private Integer id;
    private Integer groupId;
    private String login;
    private String password;

    public User(Integer id, Integer groupId, String login, String password){
        this.id = id;
        this.groupId = groupId;
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getGroupId(){
        return this.id;
    }

    public void setGroupId(Integer id){
        this.id = id;
    }
}
