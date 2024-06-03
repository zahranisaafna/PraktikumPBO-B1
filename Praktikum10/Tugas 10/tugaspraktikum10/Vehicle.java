/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public abstract class Vehicle {
    protected double maxLoad;

    public abstract double calcFuelEfficiency();
    public abstract double calctripDistance();

    public Vehicle(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

