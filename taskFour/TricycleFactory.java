package taskFour;

import taskFour.CycleFactory;
import taskFour.CycleTask4;

public class TricycleFactory implements CycleFactory {
    @Override
    public CycleTask4 getCycle() {
        return new Tricycle();
    }
}