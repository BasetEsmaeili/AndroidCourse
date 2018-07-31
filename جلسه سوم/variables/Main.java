package com.polymorphism;
//شیوه تعریف کلاس جدید
//Modifire ClassKeyWord  Class Name
// 1        2             3
public    class         Main {
    // یک نوع متغیر public که برای همه کلاس ها در دسترس است
    public int variablePublic = 54;
    // ینوع متغیر private که فقط برای بدنه کلاس قابل دسترسی است.
    private int variablePrivate = 68;
// یک نوع متغیر protected که فقط برای داخل پکیج خود و سابکلاس های قابل دیدن است
    protected int variableProtected=86;
    // یک نوع متغیر final که اجازه تغییر نمی دهد
    private final int nationalCode=1947;
    // نوعی متغیر static که بدون نمونه گیری می توان به آن دسترسی داشت
    private static String variableStatic="Hello World";
    // نوعی متغیر default که فقط برای پکیج قابل دیدن است
    String countryName="IRAN";
    public static void main(String[] args) {
        Main main=new Main();

    }
}
