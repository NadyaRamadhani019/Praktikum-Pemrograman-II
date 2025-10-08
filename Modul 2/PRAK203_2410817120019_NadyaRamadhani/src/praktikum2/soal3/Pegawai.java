// Penjelasan: Kode di baris ke-1 ini, terdapat typo pada kata yang seharusnya "package", tetapi tertulis "Napackage".
// Napackage praktikum2.soal3;
package praktikum2.soal3;

// Penjelasan: Kode di baris ini, nama class tidak ditulis dengan konsisten, di mana kelas diberi nama "Pegawai",
// tetapi di kode tertulis "Employee".
// public class Employee {
public class Pegawai {
    public String nama;
    // Penjelasan: Kode di baris ini, variabel "asal" dideklarasikan sebagai char, padahal tipe data char hanya dapat
    // menyimpan karakter dalam jumlah terbatas sehingga tipe data asal dirubah menjadi String agar dapat menyimpan
    // seluruh karakter dalam string "Kingdom of Orvel".
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getAsal() {
        return asal;
    }

    // Penjelasan: Kesalahan kode di baris ini terletak pada method setJabatan yang diituliskan tanpa adanya parameter.
    // Method ini harus memiliki parameter karena berfungsi ntuk menerima nilai dari luar dan menyimpannya ke dalam
    // class, tanpa adanya parameter method tidak tahu nilai apa yang harus ditetapkan sehingga program akan error.
    // public void setJabatan() {
    public void setJabatan(String j){
        this.jabatan = j;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
}