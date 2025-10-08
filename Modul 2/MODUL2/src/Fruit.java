public class Fruit{
    String fruitName;
    double fruitWeight;
    double fruitPrice;
    double fruitAmount;

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitWeight(double fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public double getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitAmount(double fruitAmount) {
        this.fruitAmount = fruitAmount;
    }

    public double getFruitAmount() {
        return fruitAmount;
    }

    public double beforeDiscount() {
        return (fruitAmount / fruitWeight) * fruitPrice;
    }

    public double Discount() {
        int totalDiscount = (int)(fruitAmount / 4);
        double discount;
        discount = totalDiscount * (4 * fruitPrice) * 0.02;
        return discount;
    }

    public double afterDiscount() {
        return beforeDiscount() - Discount();
    }

    public void Info() {
        System.out.println("Nama Buah: " + fruitName);
        System.out.println("Berat: " + fruitWeight);
        System.out.println("Harga per unit: " + fruitPrice);
        System.out.println("Jumlah Beli: " + fruitAmount + " kg");
        System.out.println("Harga Sebelum Diskon: Rp" + beforeDiscount());
        System.out.println("Total Diskon: Rp" + Discount());
        System.out.println("Harga Setelah Diskon: Rp" + afterDiscount());
        System.out.println();
    }
}