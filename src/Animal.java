public class Animal implements Cloneable {
    private String name;
    private int age;
    private Specie specie;

    public Animal(String name,int age, Specie specie){
        this.name = name;
        this.age = age;
        this.specie = specie;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Animal cloned = (Animal) super.clone();
        cloned.setSpecie((Specie)cloned.getSpecie().clone());
        return cloned;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }
}