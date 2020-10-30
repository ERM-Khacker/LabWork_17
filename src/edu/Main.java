package edu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserLinux director = new UserLinux();
        director.setStore(Employees_InternetStore.DIRECTOR);
        director.setName("Umar");
        director.setLogin("lalala");
        director.setPassword("123456");

        UserLinux administrator = new UserLinux();
        administrator.setStore(Employees_InternetStore.ADMINISTRATOR);
        administrator.setName("Сява");
        administrator.setLogin("alalala");
        administrator.setPassword("434424");


        UserLinux manager = new UserLinux();
        manager.setStore(Employees_InternetStore.MANAGER);
        manager.setName("Владик");
        manager.setLogin("ururuje");
        manager.setPassword("243932749234");


        UserLinux customer = new UserLinux();
        customer.setStore(Employees_InternetStore.CUSTOMER);
        customer.setName("Вася");
        customer.setLogin("jfjfjsjjs");
        customer.setPassword("38984928");

        UserLinux anon = new UserLinux();
        anon.setStore(Employees_InternetStore.ANONYMOUS);
        anon.setName("Petya");
        anon.setLogin("uruk");
        anon.setPassword("e47854875");

        System.out.println();

        Store adidas = new Store();
        UserLinux[] arrUsers = {customer, manager, director, administrator, anon};
        adidas.setUrlStore("www.adidas.com");
        adidas.setNameStore("Adidas");
        adidas.setCustomersStore(arrUsers);
        for (UserLinux arrUs : arrUsers) {
            System.out.println(adidas.getNameStore());;
            System.out.println(arrUs + " " + adidas.getUrlStore());

        }
    }
    static void tryLogin(Store store){
        System.out.println("Введите логин:");
        Scanner scanner1 = new Scanner(System.in);
        String log = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner2.nextLine();
        store.login(new UserLinux());

    }


}
