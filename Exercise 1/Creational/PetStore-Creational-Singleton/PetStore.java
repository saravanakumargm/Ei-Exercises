import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = Animal.getInstance();
        System.out.println("Enter animal name : ");
        String name = sc.next();
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Prices : ");
        int price = sc.nextInt();
        System.out.println("Is it vaccinated : ");
        String vaccine = sc.next();
        animal.createAnimal(name,age,price,vaccine);
        animal.getAnimalDetails();
        animal.createAnimal("Cat",2,4000,"No");
        animal.getAnimalDetails();
        animal.showAnimals();
    }
}
