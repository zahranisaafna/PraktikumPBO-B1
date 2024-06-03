/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class SeaPlane extends Airplane {

    public SeaPlane(double maxLoad) {
        super(maxLoad);
    }

    @Override
    public void takeOff() {
        // Implementasi takeOff() method
    }

    @Override
    public void land() {
        // Implementasi land() method
    }

    @Override
    public void fly() {
        // Implementasi fly() method
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
        return super.toString() + " dapat take-off dan mendarat di perairan laut";
    }
}

