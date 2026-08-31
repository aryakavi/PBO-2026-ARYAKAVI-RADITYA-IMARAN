package Jobsheet1;

class Smartwatch {
    String merk;
    int persentaseBaterai;

    public void gunakanUntukOlahraga() {
        persentaseBaterai -= 15;
        System.out.println("Smartwatch digunakan olahraga. Baterai berkurang.");
    }

    public void isiDaya() {
        persentaseBaterai = 100;
        System.out.println("Smartwatch diisi daya hingga penuh.");
    }

    public void cetakInformasi() {
        System.out.println("--- Info Smartwatch ---");
        System.out.println("Merk: " + merk);
        System.out.println("Baterai: " + persentaseBaterai + "%");
    }
}
