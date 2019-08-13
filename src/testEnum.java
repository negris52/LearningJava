import java.util.Arrays;
import java.util.EnumSet;

public class testEnum {

    enum Cat {
        Leopard(120), Puma(80), Lion, Tiger(), Manul(70);

        int speed;

        Cat(int speed) {
            this.speed = speed;
        }

        Cat(){
        }

        boolean hasSpeed(){
            return speed != 0;
        }

    }

    public static void main(String[] args) {
        /*System.out.println((Cat.Leopard.toString()));
        System.out.println(Cat.Puma.values());
        System.out.println(Cat.Leopard.ordinal());*/

        /*for (Cat cat:Cat.values()) {
            if(cat.hasSpeed()) {
                System.out.println(cat + " have speed, " + cat.speed);
            } else {
                System.out.println(cat + " don't have speed.");
            }
        }*/

        /*EnumSet<Cat> cats = EnumSet.allOf(Cat.class);
        Cat[]cats1 = Cat.values();
        System.out.println(Arrays.toString(cats1));*/

        System.out.println(Cat.Leopard.compareTo(Cat.Manul));
        System.out.println(Cat.valueOf("Puma").ordinal());
        }

    }


