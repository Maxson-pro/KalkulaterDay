package org.example;

public class CheckDisk {
    private int year;
    private int month;
    private int day;
    public CheckDisk(String data){
        String[] chast = data.split("-");
            year = Integer.parseInt(chast[0]);
            month = Integer.parseInt(chast[1]);
            day = Integer.parseInt(chast[2]);
        }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    }

