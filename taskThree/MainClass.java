package taskThree;

public class MainClass {
    public static void firstInterfaceMethod(FirstInterface f){
        System.out.println("firstInterfaceMethod");
    }
    public static void secondInterfaceMethod(SecondInterface s){
        System.out.println("secondInterfaceMethod");
    }
    public static void thirdInterfaceMethod(ThirdInterface t){
        System.out.println("thirdInterfaceMethod");
    }
    public static void forthInterfaceMethod(MainInterface m){
        System.out.println("forthInterfaceMethod");
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        firstInterfaceMethod(obj);
        secondInterfaceMethod(obj);
        thirdInterfaceMethod(obj);
        forthInterfaceMethod(obj);
    }
}