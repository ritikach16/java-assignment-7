package taskOne;

import taskOne.Rodents;

public class Gerbil extends Rodents {
    Gerbil(){
        System.out.println("GERBIL class");
    }
    @Override
    void typeOfRodent(){
        System.out.println("The GERBIL Rodent");
    }

    @Override
    void eat(){
        System.out.println("The GERBIL Rodent is eating");
    }
}