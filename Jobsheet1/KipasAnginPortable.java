package Jobsheet1;

class KipasAnginPortable {
    String merk;
    int kecepatan;

    public void nyalakan(int tingkatKecepatan) {
        kecepatan = tingkatKecepatan;
        System.out.println("Kipas dinyalakan dengan kecepatan " + kecepatan);
    }

    public void matikan() {
        kecepatan = 0;
        System.out.println("Kipas dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("--- Info Kipas Angin Portable ---");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan saat ini: " + kecepatan);
    }
}
