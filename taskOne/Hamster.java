package taskOne;

import taskOne.Rodents;

public class Hamster extends Rodents {
    Hamster(){
        System.out.println("HAMSTER class");
    }
    @Override
    void typeOfRodent(){
        System.out.println("The HAMSTER Rodent");
    }

    @Override
    void eat(){
        System.out.println("The HAMSTER Rodent is eating");
    }
}