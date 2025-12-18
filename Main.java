package org.example;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи дату ГГГГ-ММ-ДД");
        String data = scanner.nextLine();
        if (!Сonclusion.isDate(data)){
            scanner.close();
            return;
       }
       CheckDisk checkDisk = new CheckDisk(data);
        String dayOfWeek = Input.calcukater(checkDisk);
       System.out.println("День недели " + dayOfWeek );
       scanner.close();

   }
}
