import java.util.Scanner;

public class PRAK101_2410817120019_NadyaRamadhani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double berat = input.nextDouble();

        String NamaBulan = switch (bulan){
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan Tidak Valid";
        };

        System.out.println("Nama Lengkap " + name + ", Lahir di " + tempat + " pada Tanggal " + tanggal + " " + NamaBulan + " " + tahun + " Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");
    }
}
