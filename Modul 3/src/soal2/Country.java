package soal2;

import java.util.*;

public class Country {
    private String country;
    private String type;
    private String name;
    private int date;
    private int month;
    private int year;

    public Country(String country, String type, String name, int date, int month, int year) {
        this.country = country;
        this.type = type;
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public Country(String country, String type, String name) {
        this.country = country;
        this.type = type;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void Display(String month){
        if(type.equals("Presiden")){
            System.out.println("Negara "+country+" mempunyai "+type+" bernama "+name);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "+date+" "+month+" "+year);
            System.out.println("");
        }else if(type.equals("Perdana menteri")){
            System.out.println("Negara "+country+" mempunyai "+type+" bernama "+name);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "+date+" "+month+" "+year);
            System.out.println("");
        }else{
            System.out.println("Negara "+country+" mempunyai Raja bernama "+name);
            System.out.println("");
        }
    }
}