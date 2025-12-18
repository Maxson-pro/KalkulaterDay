package org.example;

public class Input {
    private static final String[] DayWeek = {
            "Суббота", "Воскресенье", "Понедельник",
            "Вторник", "Среда", "Четверг", "Пятница"
    };
    static String calcukater(CheckDisk checkDisk) {
        int day = checkDisk.getDay();
        int month = checkDisk.getMonth();
        int year = checkDisk.getYear();

        int m = month;
        int y = year;
        if (month < 3){
            m = month + 12;
            y = year - 1;
             }
        int h = (day + (13 * (m + 1)) / 5 + y + y/4 - y/100 + y/400) % 7;
      return DayWeek[h];
    }
}

