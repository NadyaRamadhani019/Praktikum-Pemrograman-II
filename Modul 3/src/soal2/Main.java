package soal2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer,String> inputMonth = new HashMap<Integer,String>();
        inputMonth.put(1,"Januari");
        inputMonth.put(2,"Februari");
        inputMonth.put(3,"Maret");
        inputMonth.put(4, "April");
        inputMonth.put(5, "Mei");
        inputMonth.put(6, "Juni");
        inputMonth.put(7, "Juli");
        inputMonth.put(8, "Agustus");
        inputMonth.put(9, "September");
        inputMonth.put(10, "Oktober");
        inputMonth.put(11, "November");
        inputMonth.put(12, "Desember");

        LinkedList<Country> listCountry = new LinkedList();

        int amountcount = input.nextInt();
        input.nextLine();

        for(int i = 0; i < amountcount; i++){
            String Country = input.nextLine();
            String type = input.nextLine();
            String name = input.nextLine();
            if (type.equalsIgnoreCase("monarki")) {
                listCountry.add(new Country(Country, type, name));
            } else {
                int date = input.nextInt();
                int month = input.nextInt();
                int year = input.nextInt();
                input.nextLine();
                listCountry.add(new Country(Country, type, name, date, month, year));
            }
        }

        System.out.println();

        for(Country countr : listCountry){
                String monthmap = inputMonth.get(countr.getMonth());
                countr.Display(monthmap);
        }

        input.close();
    }
}