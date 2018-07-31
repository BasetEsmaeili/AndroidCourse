package com.polymorphism;

import com.polymorphism.Univercity.Student;

public class Main {

    public static void main(String[] args) {
        //کار \کیج ها فقط راحتی و مرتب کردن کد های ما در جاوا می باشد
        //  دو کلاس هم نام با پکیج های متفاوت تعریف شده است
        Student schoolStudnet=new Student();
        schoolStudnet.printStudentName("ALi");
        Student univerCityStudent=new Student();
        univerCityStudent.printStudentName("Mohsen");
    }
}
