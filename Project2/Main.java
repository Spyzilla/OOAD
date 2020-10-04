import java.util.Scanner;
import Zoo.Zoo;
import Animal.Accipitrine.*;
import Animal.Pachyderm.*;
import Animal.Feline.*;
import Animal.Canine.*;


public class Main {

    public static void main(String args[]) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);
        zoo.addAnimal(new Cat("Chester"));
        zoo.addAnimal(new Dog("Dan"));
        zoo.addAnimal(new Elephant("Eric"));
        zoo.addAnimal(new Falcon("Fred"));
        zoo.addAnimal(new Hawk("Harry"));
        zoo.addAnimal(new Hippo("Hank"));
        zoo.addAnimal(new Lion("Larry"));
        zoo.addAnimal(new Rhino("Randy"));
        zoo.addAnimal(new Tiger("Tony"));
        zoo.addAnimal(new Wolf("Wally"));

        System.out.println("Enter number of days to simulate: ");
        int numDays = Integer.parseInt((scanner.nextLine()));
        zoo.startZoo(numDays);

    }
}