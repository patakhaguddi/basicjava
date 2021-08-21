package WhileLoop;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.File;

import java.io.IOException;

public class ExtractHTML {
    public static void main(String[] args) {
        try {
            String fileName = "sample.html";
            File file = new File(fileName);

            for (Element element : elements) {
                String id = element.id();
                System.out.println("ID: " + id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
            }