package Jobsheet1;

public class Demo {
    public static void main(String[] args) {
        KipasAnginPortable kipas = new KipasAnginPortable();
        kipas.merk = "Robot RT-BF11";
        kipas.nyalakan(3);
        kipas.matikan();
        kipas.cetakInformasi();
        System.out.println();

        Smartwatch jam = new Smartwatch();
        jam.merk = "Xiaomi Mi Band";
        jam.isiDaya();
        jam.gunakanUntukOlahraga();
        jam.cetakInformasi();
        System.out.println();

        PerangkatAudio audioUmum = new PerangkatAudio();
        audioUmum.merk = "Audio Generic";
        audioUmum.naikkanVolume(50);
        audioUmum.turunkanVolume(20);
        audioUmum.cetakInformasi();
        System.out.println();

        Speaker spk = new Speaker();
        spk.merk = "JBL Go 3";          
        spk.volume = 40;                
        spk.hubungkanBluetooth(true);   
        spk.aturBass(8);                
        spk.cetakInformasi();          
        System.out.println();

        Headset hds = new Headset();
        hds.merk = "Logitech G Pro";    
        hds.volume = 25;                
        hds.setJenisKonektor("Wireless USB Dongle"); 
        hds.tekanTombolMic(false);                   
        hds.cetakInformasi();                        
    }
}
