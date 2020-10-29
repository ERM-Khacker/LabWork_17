package edu;

public class UserLinux {
    private String login;
    private String password;
    private String name;
    private Employees_InternetStore Store = Employees_InternetStore.ANONYMOUS;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employees_InternetStore getStore() {
        return Store;
    }

    public void setStore(Employees_InternetStore store) {
        Store = store;
    }
}
