public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 11.");
        System.out.println("Task 1.");
        int thisYear = 2024;
        checkYear(thisYear);
        System.out.println("Task 2.");
//        int iOS = 0;
//        int android = 1;
        int os = 0;
        int clientDeviceYear = 2024;
        selectingVersion(os, clientDeviceYear);
    }
    public static void checkYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void selectingVersion(int os, int clientDeviceYear) {
        if (os != 0 && os != 1) {
            System.out.println("Неизвестная система");
        }
        if (os == 0 && clientDeviceYear <= 2015) {
            System.out.println("установите облегченную версию приложения для IOS по ссылке");
        } else if (os == 0 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для IOS по ссылке");
        } else if (os == 1 && os <= 2015) {
            System.out.println("установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear > 2015) {
            System.out.println("установите версию приложения для Android по ссылке");
        }
    }
}