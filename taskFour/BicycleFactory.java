package taskFour;

import taskFour.CycleFactory;
import taskFour.CycleTask4;

public class BicycleFactory implements CycleFactory {
    @Override
    public CycleTask4 getCycle() {
        return new Bicycle();
    }
}