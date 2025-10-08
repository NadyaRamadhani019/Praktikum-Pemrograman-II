package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // Penjelasan: Pada baris ini terjadi error karena kurangnya titik koma (;)
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // Penjelasan: Sebenarnya, tanpa baris ini program tidak error hanya saja bagian umur tidak  terisi apapun,
        // atau 0, padahal seharusnya umur menampilkan 17. Sehingga ditulislah kode yang mengatur default umur.
        // (Kosong, tidak ada kode yang menuliskan default umur)
        p1.umur = 17;

        // Penjelasan: Sebenarnya, tanpa baris ini program tidak error hanya saja output yang dihasilkan tidak sesuai
        // dengan yang seharusnya. Sehingga "Nama Pegawai" ditulis menjadi "Nama" saja.
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}