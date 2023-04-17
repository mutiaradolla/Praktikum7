// Mutiara Dolla Meitantya | A11.2021.13745 | 4405
package praktikum7;

public class Karyawan{ 
    String nama;
    String alamat;
    String jk;
    int umur;
    int tunjangan_anak;
    int jml_hariMasuk;

    //constractor
    public Karyawan(String nama, String alamat, String jk, int umur, int tunjangan_anak, int jml_hariMasuk){
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.tunjangan_anak = tunjangan_anak;
        this.jml_hariMasuk = jml_hariMasuk;
    }

    public void tampilDataKaryawan(){
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Jenis Kelamin : "+jk);
        System.out.println("Umur : "+umur);
        System.out.println("Tunjangan Anak : "+tunjangan_anak);
        System.out.println("Jumlah Hari Masuk : "+jml_hariMasuk);
    }


}