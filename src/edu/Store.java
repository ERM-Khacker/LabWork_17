package edu;

/*4.Создать класс Store c полями: имя магазина, URL магазина,
    массив всех пользователей магазина, авторизированный пользователь магазина.*/
public class Store {
    private String nameStore;
    private String urlStore;
    protected UserLinux[] customersStore;
    private UserLinux authorizedUser;

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getUrlStore() {
        return urlStore;
    }

    public void setUrlStore(String urlStore) {
        this.urlStore = urlStore;
    }

    public UserLinux[] getCustomersStore() {
        return customersStore;
    }

    public void setCustomersStore(UserLinux[] customersStore) {
        this.customersStore = customersStore;
    }

    public UserLinux getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(UserLinux authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    //5.В классе Store создать метод login в который передается имя и пароль.
   /* • В методе необходимо найти пользователя у которого совпадают введенные и
        сохраненные логин и пароль и присвоить значение этого пользователя полю для
        авторизированного пользователя.
      • Если не найден пользователь с таким логином и паролем возвращаем true
      • Если не найден пользователь с таким логином и паролем возвращаем false.*/
    public boolean login(String password, String login) {
        UserLinux user = findByUser(login);
        if (user != null) {
            System.out.println("User is logged");
            authorizedUser = user;
            return true;
        } else {
            System.out.println("User is not logged");
            return false;
        }
    }

    /*6.В классе Store создать метод void getCurrentUserRights(). В методе, определить
        текущую должность пользователя и вывести информацию об этом пользователе.*/
    public void getCurrentUserRights(Employees_InternetStore role) {
        switch (role) {
            case DIRECTOR:
                System.out.println(role.description);
                break;
            case ADMINISTRATOR:
                System.out.println(role.description);
                break;
            case MANAGER:
                System.out.println(role.description);
                break;
            case CUSTOMER:
                System.out.println(role.description);
                break;
            case ANONYMOUS:
                System.out.println(role.description);
                break;
        }
    }

    /*7.В классе Store создать метод logout, в котором полю авторизированный пользователь
        присваивается null, и выводится сообщение: «Пользователь вышел из системы»*/
    public void logout() {
        authorizedUser = null;
        System.out.println("This user logouts from system");
    }

    private UserLinux findByUser(String userName) {
        UserLinux user = null;
        for (UserLinux userLinux : customersStore) {
            if (userLinux.getLogin().equalsIgnoreCase(userName)) {
                System.out.println("User was founded : " + userLinux.getLogin());
                user = userLinux;
                return user;
            } else {
                System.out.println("User was not founded : " + userLinux.getLogin());
            }
        }
        return user;
    }
}
