package taskOne;

import taskOne.Rodents;

public class Mouse extends Rodents {
    Mouse(){
        System.out.println("MOUSE class");
    }
    @Override
    void typeOfRodent(){
        System.out.println("The MOUSE Rodent");
    }

    @Override
    void eat(){
        System.out.println("The MOUSE Rodent is eating");
    }
}