package edu;

import java.util.Scanner;

//8.Создать Main класс с main методом. В main методе создать 5 пользователей с разными должностями, логинами и паролями
public class Main {
    public static void main(String[] args) {
        UserLinux director = new UserLinux();
        director.setRole(Employees_InternetStore.DIRECTOR);
        director.setName("Umar");
        director.setLogin("lalala");
        director.setPassword("123456");

        UserLinux administrator = new UserLinux();
        administrator.setRole(Employees_InternetStore.ADMINISTRATOR);
        administrator.setName("Сява");
        administrator.setLogin("alalala");
        administrator.setPassword("434424");


        UserLinux manager = new UserLinux();
        manager.setRole(Employees_InternetStore.MANAGER);
        manager.setName("Владик");
        manager.setLogin("ururuje");
        manager.setPassword("243932749234");


        UserLinux customer = new UserLinux();
        customer.setRole(Employees_InternetStore.CUSTOMER);
        customer.setName("Вася");
        customer.setLogin("jfjfjsjjs");
        customer.setPassword("38984928");

        UserLinux anon = new UserLinux();
        anon.setRole(Employees_InternetStore.ANONYMOUS);
        anon.setName("Petya");
        anon.setLogin("uruk");
        anon.setPassword("e47854875");

        //9.В main методе создать экземпляр класса Store. Проинициализировать список пользователей, имя, url.
        Store adidas = new Store();
        UserLinux[] arrUsers = {customer, manager, director, administrator, anon};
        adidas.setUrlStore("www.adidas.com");
        adidas.setNameStore("Adidas");
        adidas.setCustomersStore(arrUsers);

        /*11. Вызвать метод tryLogin в main методе и обернуть его бесконечным циклом, для
        многоразового последовательного использования.*/
        while (true) {
            tryLogin(adidas);
        }
    }

    /*10. В классе Main создать статический метод без возвращаемого значения tryLogin, в
          который, в качестве параметра передается ссылка на экземпляр класса Store.
        • В методе создать Scanner для приема логина пользователя (Предварительно
           нужно вывести сообщение: «Введите логин:»). Присвоить значение созданной строке login.
        • создать Scanner для приема пароля пользователя (Предварительно нужно
          вывести сообщение: «Введите пароль:»). Присвоить значение созданной строке password.
        • Вызвать метод login у параметра (Store), передав в него login и password
        • Если метод вернул true: вызываем у store метод getCurrentUserRights и после него logout.
        • Если метод вернул false, выводим на экран сообщение: «Неверный логин и\или пароль».*/
    static void tryLogin(Store store) {
        System.out.println("Введите логин:");
        Scanner scanner = new Scanner(System.in);
        String log = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (store.login(password, log)) {
            store.getCurrentUserRights(store.getAuthorizedUser().getRole());
            store.logout();
        } else {
            System.out.println("Неверный логин или пароль");
        }
    }
}
