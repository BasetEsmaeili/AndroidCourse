public class InterfaceImplemation implements InterfaceSample {
    // این کلاس از اینترفیس InterfaceSample ایمپلمنت شده و متد های آن پیاده سازی شده است
    public String clock;
    private InterfaceSample interfaceSample=this;
    public void checkDate(){
        // متغیر در اینجا مقدار دهی شده است
        clock="12:00";
        // در این بخش چک می شود که ساعت برابر چند است و بر اساس آن رویداد اینترفیس صدا زده خواهد شد
        if (clock.equals("12:00")){
            interfaceSample.onClockis12();
        }else if (clock.equals("10:00")){
            interfaceSample.onClockis10();
        }else if (clock.equals("14:00")){
            // در این callback به عنوان پارامتر ورودی یک پیغام داده شده است و در داخل بلاک اینترفیس می توان به آن دسترسی داشت
            interfaceSample.onClockis14("پاس دادن اطلاعات به اینترفیس");
        }
    }
    @Override
    public void onClockis12() {
        System.out.println("ساعت برابر 12 است");
    }

    @Override
    public void onClockis10() {
System.out.println("ساعت برابر 10 است");
    }

    @Override
    public void onClockis14(String mesage) {
System.out.println(mesage);
    }
}
