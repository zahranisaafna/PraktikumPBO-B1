/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class Superman extends Kryptonian implements IFlyer {
    private String name;

    public Superman() {
        this.name = "Clark Kent";
    }

    @Override
    public void takeOff() {
        System.out.println("Superman is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Superman has landed.");
    }

    @Override
    public void fly() {
        System.out.println("Superman is flying.");
    }

    public void leapBuilding() {
        System.out.println("Superman is leaping a building.");
    }

    public void stopBullet() {
        System.out.println("Superman is stopping a bullet.");
    }

    @Override
    public void eat() {
        System.out.println("Superman is eating.");
    }

    @Override
    public String toString() {
        return "Superman dengan nama: " + name;
    }
}
