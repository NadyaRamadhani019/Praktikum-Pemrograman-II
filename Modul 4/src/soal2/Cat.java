package soal2;

public class Cat extends Pets {
    private String petColor;

    public Cat(String petName, String petSpecies, String petColor) {
        super(petName, petSpecies);
        this.petColor = petColor;
    }

    public void displayCatDetail() {
        super.display();
        System.out.println("Memiliki warna bulu : " + petColor);
    }
}