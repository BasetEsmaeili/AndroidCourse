package com.polymorphism;


import java.util.Scanner;

public class Main{
    //تعریف یک متغیر جهت گرفتن نام کاربر از برنامه
    private static String userName;

    public static void main(String[] args) {
        // صدا زدن متد جهت دریافت نام کاربر
        getUserName();
        if (userName!=null){
            // چک کردن خالی نبودن متغیر
            System.out.println("خوش آمدی"+" "+userName);
            ForloopSample.forloopsample();
            WhileLoopSample.whileloopsample();
            DoWhileSample.doWhileSample();
        }
    }
    public static void getUserName(){
        // یک کلاس جهت گرفتن متن در جاوا
        Scanner scanner=new Scanner(System.in);
        userName=scanner.next();
    }
}
