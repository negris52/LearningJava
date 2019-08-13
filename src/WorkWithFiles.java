import java.io.*;

public class WorkWithFiles {

    public static void main(String[] args) {
        File dir1 = new File("/home/andrey/Testdir");
        File file1 = new File("/home/andrey/Testdir/testfile.txt");
        dir1.mkdir();
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            System.out.println("Ошибка создания файла");
        }
        System.out.println(dir1.isDirectory());
        System.out.println(file1.isFile());
    }

}

