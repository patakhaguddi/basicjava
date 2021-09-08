package JSONFileRW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ATMBooth {
    public static void main(String[] args) throws IOException {
        fileWrite();

    }

    public static void fileWrite() throws IOException {
        FileWriter fw = new FileWriter("C:\\MyFile.txt", true);
        fw.write("\nHello eo");
        fw.close();
    }

    public static void fileRead() throws IOException {
        FileReader reader = new FileReader("MyFile.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();

    }
}
