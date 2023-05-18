package ShelterRun;

import javax.swing.*;

public class Dog extends Pet{
    private String name;
    public Dog(String b, int a){
        super(b, a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        JOptionPane.showMessageDialog(null,  " Dog name = " + name +
                "\nDog Breed = " + breed +
                "\nDog Age = " + age +
                "\nOwner = " +owner.getName());
    }

    @Override
    public void adoptionCompleted() {
        JOptionPane.showMessageDialog(null, name + " is adopted by " + owner.getName());
    }

    @Override
    public void move(String from, String to) {
        JOptionPane.showMessageDialog(null, name + " runs from " + from + " to " + to);
    }

    @Override
    public void eat(String food) {
        JOptionPane.showMessageDialog(null, name + " eats " + food);
    }

    @Override
    public void sleep(int hours) {
        JOptionPane.showMessageDialog(null, name + " sleeps  " + hours + " hours per day.");
    }
}
