//Nama : Zahra Nisaa' Fitria Nur'Afifah
//NIM : 24060122140162
//Tanggal : 5 Maret 2024

public class OperasiTitik {

    private void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-titik.getOrdinat());
    }

    private void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}