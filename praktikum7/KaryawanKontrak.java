// Mutiara Dolla Meitantya | A11.2021.13745 | 4405
package praktikum7;

public class KaryawanKontrak extends Karyawan{
    int upah_harian;
    
    //constractor
    public KaryawanKontrak(String nama, String alamat, String jk, int umur, int tunjangan_anak, int jml_hariMasuk,
            int upah_harian) {
        super(nama, alamat, jk, umur, tunjangan_anak, jml_hariMasuk);
        this.upah_harian = upah_harian;
    }

    public void tampilDataKaryawan() {
        super.tampilDataKaryawan();
        System.out.println("Upah Harian : " + upah_harian);
    }

    //method yang dimilikok KaryawanKontrak
    public void totalUpah() {
        System.out.println("Total Upah Karyawan Kontrak : " + ((upah_harian * jml_hariMasuk)+tunjangan_anak));
    }

    public static void main(String[] args) {
        KaryawanKontrak Karyawan2 = new KaryawanKontrak("Mahardhika", "Semarang", "Laki", 28, 500000, 25, 200000);
        Karyawan2.tampilDataKaryawan();
        System.out.println();
        Karyawan2.totalUpah();
        System.out.println();

    }



   

    

    
    
}
