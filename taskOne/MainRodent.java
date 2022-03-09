package taskOne;

public class MainRodent {
    public static void main(String[] args) {
        Rodents[] arr = new Rodents[3];
        arr[0] = new Mouse();
        arr[1] = new Gerbil();
        arr[2] = new Hamster();

        arr[0].typeOfRodent();
        arr[1].eat();
    }
}