package ShelterRun;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShelterRunMain {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Jack");
        Dog dog1 = new Dog("Golden Retriever", 6);
        //Implementing methods from Dog Class
        dog1.setName("Max"); // Name of the Dog
        dog1.setOwner(owner1); // Dog owner's name
        dog1.adoptionCompleted(); // Adoption Status
        dog1.eat("Dog Biscuit"); // Dog Food
        dog1.sleep(7); // Dog sleep time method
        dog1.birthday(); // Dog's birthday
        dog1.move("Home", "Park"); // Dog's movement
        dog1.display(); // //Dog information display
    }
}