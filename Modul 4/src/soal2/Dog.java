package soal2;

public class Dog extends Pets {
    private String petColor;
    private String petSkill;

    public Dog(String petName, String petSpecies, String petColor, String petSkill) {
        super(petName, petSpecies);
        this.petColor = petColor;
        this.petSkill = petSkill;
    }

    public void displayDogDetail() {
        super.display();
        System.out.println("Memiliki warna bulu : " + petColor);
        System.out.println("Memiliki kemampuan : " + petSkill.replace(",", " "));
    }
}