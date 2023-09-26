public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkingLeapYear(2024);
        System.out.println("Задание 2");
        displayVersionNotification(1, 2023);
        System.out.println("Задание 3");
        int days = definePeriodDeliveryDays(21);
        if (days > 0) {
            System.out.println("Доставка займёт дней: " + days);
        } else {
            System.out.println("Доставки нет!");
        }
    }

    public static void checkingLeapYear(int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0 && year > 1584) {
            System.out.println("Год " + year + " является високосным!");
        } else {
            System.out.println("Год " + year + " не является високосным!");
            return;
        }
    }

    public static void displayVersionNotification(int os, int deviceYear) {
        if (os == 0 && deviceYear >= 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (os == 0 && deviceYear < 2023) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (os == 1 && deviceYear >= 2023) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (os == 1 && deviceYear < 2023) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (os != 0 && os != 1) {
            System.out.println("Не корректная версия ОС!");
            return;
        }
    }

    private static int definePeriodDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return -1;
        }
        int days=1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
         }
         return days;}
        }



