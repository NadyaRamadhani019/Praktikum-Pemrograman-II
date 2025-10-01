import java.util.Scanner;

public class PRAK103_2410817120019_NadyaRamadhani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int Awal = input.nextInt();

        int count = 0;
        int angka = Awal;
        do {
            if (angka % 2 != 0) {
                System.out.print(angka + ", ");
                count++;
            }
            angka++;
        } while (count < N);
    }
}