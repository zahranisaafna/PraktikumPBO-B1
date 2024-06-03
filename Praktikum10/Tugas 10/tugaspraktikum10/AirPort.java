/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land";
        } else {
            return "Permission denied";
        }
    }

    @Override
    public String toString() {
        return "AirPort name: " + name + ", with airplane: " + (airplane != null ? airplane.toString() : "none");
    }
}
