import java.util.Scanner;

public class PRAK102_2410817120019_NadyaRamadhani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        int count = 0;
        while (count <= 10) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1) + " ");
            } else {
                System.out.print(angka + ", ");
            }
            angka++;
            count++;
        }
    }
}