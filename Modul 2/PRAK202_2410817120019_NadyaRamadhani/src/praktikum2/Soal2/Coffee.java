package praktikum2.Soal2;

public class Coffee {
    public String coffeeName;
    public String coffeeSize;
    public double coffeePrice;
    public double coffeeTax;
    private String customer;

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeSize(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public String getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeePrice(double coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeeTax(double tax) {
        this.coffeeTax = tax;
    }

    public double getTax() {
        return coffeePrice * 0.11;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void Info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + coffeeSize);
        System.out.println("Harga: Rp. " + coffeePrice);
    }
}