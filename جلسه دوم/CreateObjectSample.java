public class CreateObjectSample {
    public void objectCreate(){
        // ساختن شی یا نمونه گیری Create Object
        //               1                   2      3
        ConstructorSample constructorSample=new ConstructorSample();
    }
    public String returnSample(String s){
        return s;
    }
    // تابع final که در جایی دیگر قابل override شدن نیست
    public final void finalMethod(){

    }
    // تابع static  در جایی قابل override  شدن نیست اما می توان از نو تعریف کرد
    public static void staticMethod(){

    }

    //<editor-fold desc="overloadingمفهوم">
    public void overloading(String parametr1){

    }
    public  void overloading(int id){

    }
    public  void overloading(long moadel){

    }
    //</editor-fold>
}
