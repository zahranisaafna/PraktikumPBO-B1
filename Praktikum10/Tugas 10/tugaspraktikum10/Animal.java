/*
 * Nama =  Zahra Nisaa' Fitria Nur'Afifah 03/06/2024
 * NIM = 24060121140162
 */
package tugaspraktikum10;

public abstract class Animal {
    public abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
