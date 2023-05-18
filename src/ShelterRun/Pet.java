package ShelterRun;

import javax.swing.*;

// If a class has an abstract method, then the whole class should be abstract
public abstract class Pet implements DomesticAnimal{ // abstract class implements an interface class
    protected int age;
    protected String breed;
    protected Owner owner;

    public Pet(String b, int a)
    {
        this.breed = b; this.age = a;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public void birthday(){
        age++;
        JOptionPane.showMessageDialog(null, "Happy " + age + " years old.");
    }

    public void setOwner(Owner o) {
        this.owner = o;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public abstract void adoptionCompleted();
    //This is an abstract method because it has no implementation
    //Object cannot be created from Pet class because it has abstract methods.
}
