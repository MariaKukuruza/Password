package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите пароль");
            Scanner in = new Scanner(System.in);
            String a = in.next();
            Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]");
            Pattern pattern1 = Pattern.compile("[0-9]");
            Pattern pattern2 = Pattern.compile("[.$*-]");
            Matcher m = pattern.matcher(a);
            Matcher n = pattern1.matcher(a);
            Matcher k = pattern2.matcher(a);
            if(!m.find())
                System.out.println("В пароле отсутствуют буквы");
            if (!n.find())
                System.out.println("В пароле отсутствуют цифры");
            if (!k.find())
                System.out.println("В пароле отсутствуют специальные символы (*, - , #)");
            if (a.length() != 8)
                System.out.println("Длина пароля не равна 8");
            else
                System.out.println("надежный пароль");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
