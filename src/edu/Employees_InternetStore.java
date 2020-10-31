package edu;

//2.Создать Enum описывающий должности работников интернет-магазина: директор администратор, менеджер, клиент, аноним.
public enum Employees_InternetStore {
    DIRECTOR("Директор магазина, может управлять кадрами, и ценами."),
    ADMINISTRATOR("Администратор магазина, может добавлять товары и редактировать их описание."),
    MANAGER("Менеджер магазина, может общаться с клиентами."),
    CUSTOMER("Клиент магазина, может покупать товары и пользоваться дисконтом."),
    ANONYMOUS("Анонимный пользователь, может покупать товары и авторизоваться.");

    String description;

    Employees_InternetStore(String description) {
        this.description = description;
    }
}
