/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck(0);
        System.out.println(truck);
        
        SeaPlane sPlane = new SeaPlane(0);
        System.out.println(sPlane);
        
        Helicopter copter = new Helicopter(0);
        System.out.println(copter);
        
        System.out.println("#####################################");
        
        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();
        
        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
        
        System.out.println("#####################################");
        
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();
        
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
    }
}

// package tugaspraktikum10;

// import java.util.ArrayList;
// import java.util.List;

// public class MainProgram {
//     public static void main(String[] args) {
//         Truck truck = new Truck();
//         System.out.println(truck);
        
//         SeaPlane spPlane = new SeaPlane();
//         System.out.println(spPlane);
        
//         Helicopter copter = new Helicopter();
//         System.out.println(copter);
        
//         System.out.println("#####################################");
        
//         List<Truck> armadaTruck = new ArrayList<>();
//         List<SeaPlane> armadaSeaPlane = new ArrayList<>();
//         List<Helicopter> armadaHelicopter = new ArrayList<>();
        
//         // Menambahkan kendaraan ke kelompok armada yang sesuai
//         armadaTruck.add(truck);
//         armadaTruck.add(truck);
//         armadaTruck.add(truck);
//         System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
        
//         armadaSeaPlane.add(spPlane);
//         System.out.println("Jumlah Armada SeaPlane: " + armadaSeaPlane.size());
        
//         armadaHelicopter.add(copter);
//         armadaHelicopter.add(copter);
//         System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
        
//         System.out.println("#####################################");
        
//         ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();
        
//         System.out.println("Menambahkan armada baru");
//         armadaKendaraan.tambahArmada(armadaTruck);
//         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());
        
//         System.out.println("Menambahkan armada baru");
//         armadaSeaPlane.add(spPlane);
//         armadaSeaPlane.add(spPlane);
//         armadaKendaraan.tambahArmada(armadaSeaPlane);
//         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());
        
//         System.out.println("Menambahkan armada baru");
//         armadaHelicopter.add(copter);
//         armadaHelicopter.add(copter);
//         armadaKendaraan.tambahArmada(armadaHelicopter);
//         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada());
//     }
// }
