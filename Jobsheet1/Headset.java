package Jobsheet1;

class Headset extends PerangkatAudio {
    boolean micAktif;
    String jenisKonektor;

    public void tekanTombolMic(boolean status) {
        micAktif = status;
        System.out.println("Microphone: " + (micAktif ? "Menyala (Unmuted)" : "Mati (Muted)"));
    }

    public void setJenisKonektor(String jenis) {
        jenisKonektor = jenis;
        System.out.println("Jenis konektor: " + jenisKonektor);
    }

    public void cetakInformasi() {
        System.out.println("--- Info Headset ---");
        System.out.println("Merk: " + merk); 
        System.out.println("Volume: " + volume); 
        System.out.println("Mic Aktif: " + micAktif);
        System.out.println("Konektor: " + jenisKonektor);
    }
}
