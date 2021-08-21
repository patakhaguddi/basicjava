package WhileLoop;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.File;

import java.io.IOException;

public class ExtractHTML {

    public static void main(String[] args) {

        String html="<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        int pos=html.indexOf("TXN");
        System.out.println(html.substring(pos,72));

    }
}