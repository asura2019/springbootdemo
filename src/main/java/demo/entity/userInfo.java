package demo.entity;

public class userInfo {

    private String id;


    private String username;


    private String password1;


    private String addresses;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }


    public String getAddresses() {
        return addresses;
    }


    public void setAddresses(String addresses) {
        this.addresses = addresses == null ? null : addresses.trim();
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}