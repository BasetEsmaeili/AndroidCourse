package com.polymorphism;

public class NestedIf {
    public static void nestedIfSample(){
        String name="Baset";
        int age=16;
        if (name.equals("Baset")){
            System.out.println("باسط خوش آمدید");
            if (age>=18){
              System.out.println("بیا شروع کنیم");
            }else {
                System.out.println("شما هنوز به سن قانونی نرسیده اید و حق استفاده از این برنامه را ندارید");
            }
        }else {
            System.out.println("اسم شما درسیستم ثبت نشده است");
        }
    }
}
