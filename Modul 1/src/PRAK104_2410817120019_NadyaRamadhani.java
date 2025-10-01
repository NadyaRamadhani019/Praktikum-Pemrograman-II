import java.util.Scanner;

public class PRAK104_2410817120019_NadyaRamadhani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] abu = new char[3];
        char[] bagas = new char[3];
        System.out.println("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abu[i] = input.next().charAt(0);
        }
        System.out.println("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagas[i] = input.next().charAt(0);
        }

        int skorAbu = 0, skorBagas = 0;
        for (int i = 0; i < 3; i++) {
            if (abu[i] == bagas[i]) continue;
            else if ((abu[i] == 'B' && bagas[i] == 'G') ||
                    (abu[i] == 'G' && bagas[i] == 'K') ||
                    (abu[i] == 'K' && bagas[i] == 'B')) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) System.out.println("Abu");
        else if (skorBagas > skorAbu) System.out.println("Bagas");
        else System.out.println("Seri");
    }
}