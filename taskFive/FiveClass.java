package taskFive;

public class FiveClass {
    public class InnerClass{
        InnerClass(int n){
            System.out.println("number: "+n);
        }
    }
}

class SecondClass{
    public class SecondInnerClass extends FiveClass.InnerClass {

        SecondInnerClass(int n) {
            super(n);
        }
    }
}