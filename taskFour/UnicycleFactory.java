package taskFour;

import taskFour.CycleFactory;

public class UnicycleFactory implements CycleFactory {
    public CycleTask4 getCycle(){
        return new Unicycle();
    }
}