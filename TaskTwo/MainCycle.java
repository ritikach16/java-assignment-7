package TaskTwo;

public class MainCycle {
    public static void main(String[] args) {
        MyCycle[] arr = new MyCycle[3];
        arr[0] = new Unicycle();
        arr[1] = new Bicycle();
        arr[2] = new Tricycle();

        for(MyCycle c : arr) c.balance();
    }
}