public class TestCloning2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Specie specie1 = new Specie("predator", 1);
        Specie specie2 = new Specie("domestic", 2);
        Animal animal = new Animal("Tiger", 10, specie1);

        Animal clonedAnimal = (Animal) animal.clone();

        System.out.println(animal.toString());
        System.out.println(clonedAnimal.toString());
        specie1.setId(3);
        //animal.setAge(12);
        //animal.setSpecie(specie2);

        System.out.println(animal.toString());
        System.out.println(clonedAnimal.toString());
    }
}
