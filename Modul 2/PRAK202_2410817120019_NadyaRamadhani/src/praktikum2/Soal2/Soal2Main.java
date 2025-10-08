package praktikum2.Soal2;

public class Soal2Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        coffee1.coffeeName = "Espresso";
        coffee1.coffeeSize = "Medium";
        coffee1.coffeePrice = 25000;

        coffee1.Info();
        coffee1.setCustomer("Alice");
        System.out.println("Pembeli Kopi: " + coffee1.getCustomer());
        System.out.println("Pajak Kopi: Rp. " + coffee1.getTax());
    }
}