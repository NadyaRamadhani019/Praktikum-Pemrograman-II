public class Soal1Main {
    public static void main(String[] args) {
        Fruit Apple = new Fruit();
        Apple.setFruitName("Apel");
        Apple.setFruitWeight(0.4);
        Apple.setFruitPrice(7000.0);
        Apple.setFruitAmount(40.0);

        Fruit Mango = new Fruit();
        Mango.setFruitName("Mangga");
        Mango.setFruitWeight(0.2);
        Mango.setFruitPrice(3500.0);
        Mango.setFruitAmount(15.0);

        Fruit Avocado = new Fruit();
        Avocado.setFruitName("Alpukat");
        Avocado.setFruitWeight(0.25);
        Avocado.setFruitPrice(10000.0);
        Avocado.setFruitAmount(12.0);

        Apple.Info();
        Mango.Info();
        Avocado.Info();
    }
}