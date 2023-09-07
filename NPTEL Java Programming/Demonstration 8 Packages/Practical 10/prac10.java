// import MyPackage1.myClass;
// import MyPackage2.myClass;

public class prac10 {
    public static void main(String[] args) {
        MyPackage1.myClass a = new MyPackage1.myClass();
        MyPackage2.myClass b = new MyPackage2.myClass();

        a.msg1();
        b.msg2();
    }
}