/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Bird is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Bird has landed.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    public void buildNest() {
        System.out.println("Bird is building a nest.");
    }

    public void layEggs() {
        System.out.println("Bird is laying eggs.");
    }

    @Override
    public String toString() {
        return "Bird";
    }
}
