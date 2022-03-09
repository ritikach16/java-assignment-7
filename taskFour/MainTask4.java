package taskFour;

public class MainTask4 {
    static void getMyCycle(CycleFactory f){
        CycleTask4 c = f.getCycle();
        c.cycleType();
    }
    public static void main(String[] args) {
       getMyCycle(new UnicycleFactory());
       getMyCycle(new BicycleFactory());
       getMyCycle(new TricycleFactory());
    }
}