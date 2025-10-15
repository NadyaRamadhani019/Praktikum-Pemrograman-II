package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String petName = input.nextLine();
        System.out.print("Ras: ");
        String petSpecies = input.nextLine();
        System.out.print("Warna Bulu: ");
        String petColor = input.nextLine();

        if (pilihan == 1) {
            Cat cat = new Cat(petName, petSpecies, petColor);
            System.out.println();
            cat.displayCatDetail();
        } else if (pilihan == 2) {
            System.out.print("Kemampuan: ");
            String petSkill = input.nextLine();
            Dog dog = new Dog(petName, petSpecies, petColor, petSkill);
            System.out.println();
            dog.displayDogDetail();
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}