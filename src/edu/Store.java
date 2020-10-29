package edu;

public class Store extends UserLinux {
    private String nameStore;
    private String urlStore;
    protected String[] customersStore;
    private boolean authorizedUser;

    UserLinux user = new UserLinux();

    private boolean login(String name, String password) {
        if (name == user.getLogin() && password == user.getPassword()) {
            authorizedUser = true;
            return true;
        } else if (name != user.getLogin() && password != user.getPassword())
            authorizedUser = false;
        return false;
    }
Employees_InternetStore employee = Employees_InternetStore.DIRECTOR;
    private void getCurrentUserRights() {
        switch (employee){
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

    private void logout(){
        authorizedUser = false;
        System.out.println();
    }
}
