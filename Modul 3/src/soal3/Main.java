package soal3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String Name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String NIM = input.nextLine();

                    Student mhs = new Student(Name, NIM);
                    listStudent.add(mhs);

                    System.out.println("Mahasiswa " + Name + " ditambahkan");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String NIMDel = input.nextLine();
                    for (int i = 0; i < listStudent.size(); i++) {
                        if (listStudent.get(i).getNIM().equals(NIMDel)) {
                            listStudent.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + NIMDel + " dihapus.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    String NIMSearch = input.nextLine();
                    for (int j = 0 ; j < listStudent.size() ; j++) {
                        if (NIMSearch.equals(listStudent.get(j).getNIM())) {
                            System.out.println("NIM: " + listStudent.get(j).getNIM() + ", Nama: " + listStudent.get(j).getName());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for(int j = 0 ; j < listStudent.size() ; j++) {
                        System.out.println("NIM: " + listStudent.get(j).getNIM() + ", Nama: " + listStudent.get(j).getName());
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        while(choice != 0);

        input.close();
    }
}