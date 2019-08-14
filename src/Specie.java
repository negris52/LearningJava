public class Specie implements Cloneable {

    private String animalType;
    private int id;

    public Specie(String type, int id) {
        this.animalType = type;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Animal cloned = (Animal) super.clone();
        cloned.setSpecie((Specie)cloned.getSpecie().clone());
        return cloned;
    }

    @Override
    public String toString() {
        return animalType + " " + id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}