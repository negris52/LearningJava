import java.io.*;

public class SerializationTest {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serialtest"))) {
            ClassForSer object1 = new ClassForSer("Text info", 15, 1391473249723.25245435);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serialtest"))) {
            ClassForSer object2 = (ClassForSer) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
        }

        File file = new File("serialtest");
        file.delete();
    }
}
