/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan {
    private List<Vehicle> allVehicles = new ArrayList<>();

    public <T extends Vehicle> void tambahArmada(Collection<T> armada) {
        allVehicles.addAll(armada);
    }

    public List<Vehicle> getAllArmada() {
        return allVehicles;
    }
}
