package org.example;

public class Сonclusion {

    public static boolean isDate(String date) {
        String[] parts = date.split("-");
        if (parts.length != 3) {
            System.out.println("Ошибка: неверный формат даты");
            return false;
        }
        try {
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);

            if (month < 1 || month > 12) {
                System.out.println("Ошибка: месяц должен быть от 1 до 12");
                return false;
            }
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(year)) {
                daysInMonth[1] = 29;
            }
            if (day < 1 || day > daysInMonth[month - 1]) {
                System.out.println("Ошибка: в этом месяце нет столько дней");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите числовые значения для даты");
            return false;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
