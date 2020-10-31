package edu;

//1. Создать класс User (пользователь какой-то системы). Необходимые поля: login, password, name, role
public class UserLinux {
    private String login;
    private String password;
    private String name;
    //3.Заменить тип поля role на тип созданного Enum (по умолчанию поставить анонима).
    private Employees_InternetStore role;

    public UserLinux() {
        this.role = Employees_InternetStore.ANONYMOUS;
    }

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

    public Employees_InternetStore getRole() {
        return role;
    }

    public void setRole(Employees_InternetStore role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserLinux{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", store=" + role +
                '}';
    }
}
