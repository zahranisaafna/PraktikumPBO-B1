/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class Helicopter extends Vehicle {
    public Helicopter(double maxLoad) {
        super(maxLoad);
    }

    @Override
    public double calcFuelEfficiency() {
        // Implementasi sesuai kebutuhan
        return 0;
    }

    @Override
    public double calctripDistance() {
        // Implementasi sesuai kebutuhan
        return 0;
    }

    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil";
    }
}

