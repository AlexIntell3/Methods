public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        leapYear();
        System.out.println("Задание 2");
        clientOs();
        System.out.println("Задание 3");
        delivery();
    }
    public static void leapYear() {
        int year = 2024;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0 && year > 1584) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным.");
        }
    }
    public static void clientOs() {
        int clientOs = 1;
        int clientDeviceYear = 2014;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }
     public static void delivery() {
        int deliveryDistance = 21;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        }
        if (deliveryDistance > 20 && deliveryDistance < 61) {
            System.out.println("Потребуется дней: 2 ");
        }
        if (deliveryDistance > 60 && deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        }
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}