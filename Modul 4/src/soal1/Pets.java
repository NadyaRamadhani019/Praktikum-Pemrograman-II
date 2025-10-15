package soal1;

public class Pets {
    private String petName;
    private String petSpecies;

    public Pets(String petName, String petSpecies) {
        this.petName = petName;
        this.petSpecies = petSpecies;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetSpecies(String petSpecies) {
        this.petSpecies = petSpecies;
    }

    public String getPetName() {
        return petName;
    }

    public String getPetSpecies() {
        return petSpecies;
    }

    public void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama Hewan Peliharaan: " + petName);
        System.out.println("Ras: " + petSpecies);
    }
}