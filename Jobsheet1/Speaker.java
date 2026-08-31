package Jobsheet1;

class Speaker extends PerangkatAudio {
    boolean bluetoothAktif;
    int levelBass;

    public void hubungkanBluetooth(boolean status) {
        bluetoothAktif = status;
        System.out.println("Status Bluetooth: " + (bluetoothAktif ? "Terhubung" : "Terputus"));
    }

    public void aturBass(int level) {
        levelBass = level;
        System.out.println("Level bass diatur ke " + levelBass);
    }

    public void cetakInformasi() {
        System.out.println("--- Info Speaker ---");
        System.out.println("Merk: " + merk); 
        System.out.println("Volume: " + volume); 
        System.out.println("Bluetooth Aktif: " + bluetoothAktif);
        System.out.println("Level Bass: " + levelBass);
    }
}
