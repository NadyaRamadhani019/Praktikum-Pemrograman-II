package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String petName = input.nextLine();
        System.out.print("Ras: ");
        String petSpecies = input.nextLine();

        Pets pets = new Pets(petName, petSpecies);
        pets.display();
    }
}