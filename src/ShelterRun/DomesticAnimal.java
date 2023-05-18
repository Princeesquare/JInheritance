package ShelterRun;

public interface DomesticAnimal {
    boolean isDomesticated = true;

    void move(String from, String to);

    void eat(String food);

   void sleep(int hours);
}
