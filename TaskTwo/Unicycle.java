package TaskTwo;
import TaskTwo.MyCycle;

public class Unicycle extends MyCycle {
    @Override
    void cycleType(){
        System.out.println("Unicycle");
    }

    void balance(){
        System.out.println("balancing unicycle");
    }
}