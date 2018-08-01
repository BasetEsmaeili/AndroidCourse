package com.polymorphism;

import java.util.Scanner;

public class SwitchSample {
    public static void switchSample(){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        if (name!=null){
            switch (name){
                case "باسط":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                case "حسن":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                case "معین":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                case "محسن":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                case "عدنان":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                case "سهراب":
                    System.out.println(name+"خوش آمدی برنامه نویس");
                    break;
                    default:System.out.println("نام وارد شده در سیستم ثبت نیست");
            }
        }else {
            System.out.println("لطفا یک نام وارد کنید");
        }
    }
}
