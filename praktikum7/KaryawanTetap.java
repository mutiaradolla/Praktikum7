// Mutiara Dolla Meitantya | A11.2021.13745 | 4405
package praktikum7;

public class KaryawanTetap extends Karyawan {
    int gaji_pokok;

    public KaryawanTetap(String nama, String alamat, String jk, int umur, int tunjangan_anak, int jml_hariMasuk, int gaji_pokok) {
        super(nama, alamat, jk, umur, tunjangan_anak, jml_hariMasuk);
        this.gaji_pokok = gaji_pokok;
    }

    public void tampilDataKaryawan() {
        super.tampilDataKaryawan();
        System.out.println("Gaji Pokok : " + gaji_pokok);
    }

    //method yang dimilikok KaryawanTetap
    public void tampilGaji() {
        System.out.println("Gaji Karyawan Tetap : " + (gaji_pokok + tunjangan_anak));
    }


     public static void main(String[] args) {
        KaryawanTetap Karyawan1 = new KaryawanTetap("Hartono", "Surabaya", "Laki", 53, 2000000, 25, 5000000);
        Karyawan1.tampilDataKaryawan();
        System.out.println();
        Karyawan1.tampilGaji();
        System.out.println();

    }

    
}
