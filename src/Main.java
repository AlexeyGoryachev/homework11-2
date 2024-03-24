public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 11.");
        System.out.println("Task 1.");
        int thisYear = 2024;
        checkYear(thisYear);
    }
    public static void checkYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}