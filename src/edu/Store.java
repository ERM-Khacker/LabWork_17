package edu;

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

    public UserLinux getUserLinux() {
        return userLinux;
    }

    public void setUserLinux(UserLinux userLinux) {
        this.userLinux = userLinux;
    }

    UserLinux userLinux = new UserLinux();

    public boolean login(UserLinux user) {
        if (user.getLogin() == userLinux.getLogin() && user.getPassword() == userLinux.getPassword()) {
            authorizedUser = user;
            return true;
        } else if (user.getLogin() != userLinux.getLogin() && user.getPassword() != userLinux.getPassword())
            authorizedUser = null;
        return false;
    }

    Employees_InternetStore employee = Employees_InternetStore.DIRECTOR;

    public void getCurrentUserRights() {
        switch (employee) {
            case DIRECTOR:
                System.out.println(employee.description);
            case ADMINISTRATOR:
                System.out.println(employee.description);
            case MANAGER:
                System.out.println(employee.description);
            case CUSTOMER:
                System.out.println(employee.description);
            case ANONYMOUS:
                System.out.println(employee.description);
        }
    }

    public void logout() {
        authorizedUser = null;
        System.out.println("This user escapes from system");
    }
}
