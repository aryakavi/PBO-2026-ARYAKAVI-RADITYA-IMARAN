package Jobsheet1;

class PerangkatAudio {
    String merk;
    int volume;

    public void naikkanVolume(int tambahan) {
        volume += tambahan;
        System.out.println("Volume dinaikkan menjadi " + volume);
    }

    public void turunkanVolume(int pengurangan) {
        volume -= pengurangan;
        System.out.println("Volume diturunkan menjadi " + volume);
    }

    public void cetakInformasi() {
        System.out.println("--- Info Perangkat Audio Umum ---");
        System.out.println("Merk: " + merk);
        System.out.println("Volume saat ini: " + volume);
    }
}
