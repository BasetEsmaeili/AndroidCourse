public class Inheritance extends CreateObjectSample {
    // مفهوم ارث یری یا Inheritance
    // در این مثال این کلاس از والد خود یعنی CreateObjectSample ارث بری کرده است و به صفت های پدر خود دسترسی دارد



    //   این متد معنای Overriding را می رساند که از کلاس والد خود ارث بری شده است
    @Override
    public void objectCreate()
    {
        // کلمه super به معنای اشاره به والد است
        super.objectCreate();
    }
    // یک مثال برای متد مقدار برگشتی

    @Override
    public String returnSample(String s) {
        return super.returnSample(s);
    }

}
