import java.util.Scanner;

public class PRAK105_2410817120019_NadyaRamadhani {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double volume = PHI * r * r * t;
        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + volume + " m3");
    }
}