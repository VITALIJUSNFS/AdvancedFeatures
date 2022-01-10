package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class example1 {

    public static void main(String[] args) {
        readFile("manoDokumentas.txt");
        try {
            readFileDifferently("manoDokumentas.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Handlinu exceptiona");
        }

    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println('\n' + "Failas nerastas ar kazkas blogo ivyko");
        }
    }

    private static void readFileDifferently(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }

}
