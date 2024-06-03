/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class Truck extends Vehicle {
    public Truck(double maxLoad) {
        super(maxLoad);
    }

    @Override
    public double calcFuelEfficiency() {
        return 0; // Implementasi sesuai kebutuhan
    }

    @Override
    public double calctripDistance() {
        return 0; // Implementasi sesuai kebutuhan
    }

    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }

  
}
