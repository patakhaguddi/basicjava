package JSONFileRW;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

public class QuizProgram {
        public static void writeJSONFile() throws IOException {
                JSONObject empObj = new JSONObject();
                empObj.put("Q1", "Which of the following languages is more suited to a structured program?");
                empObj.put("Q2", "A computer assisted method for the recording and analyzing of existing or hypothetical systems is");
                empObj.put("Q3", "The brain of any computer system is");
                empObj.put("Q4", "What difference does the 5th generation computer have from other generation computers?");
                empObj.put("Q5", "Which of the following computer language is used for artificial intelligence?");
                empObj.put("Q6", " Explain JDK, JRE and JVM?");
                empObj.put("Q7", "Explain public static void main(String args[]) in Java.");
                empObj.put("Q8", "Why Java is platform independent?");
                empObj.put("Q9", "Why Java is not 100% Object-oriented?");
                empObj.put("Q10", "What are wrapper classes in Java?");
                empObj.put("Q11", "What is the difference between the QA and software testing?");
                empObj.put("Q12", "What is Tester?");
                empObj.put("Q13", "What is the difference between build and release?");
                empObj.put("Q14", "What are the automation challenges that SQA");
                empObj.put("Q15", "What is bug leakage and bug release?");
                empObj.put("Q16", "Continental United States has 4 time zones, can you name them?");
                empObj.put("Q17", "What was the Turkish city of Istanbul called before 1930?");
                empObj.put("Q18", "From which US city do the band The Killers originate?");
                empObj.put("Q19", "Name the Coffee shop in US sitcom Friends");
                empObj.put("Q20", "How many human players are there on each side in a polo match?");
//                JSONObject addressObj=new JSONObject();
//                addressObj.put("present_address","Badda,Gulshan-1");
//                addressObj.put("PO","Gulshan");
//                addressObj.put("Area","Gulshan-1");
//                empObj.put("address",addressObj);
//                empObj.put("phone_number","01620141540");
                FileWriter file = new FileWriter(".\\src\\main\\java\\File_Read_Write\\QuestionBank.json");
                file.write(empObj.toJSONString());
                file.flush();
                System.out.print(empObj);
        }

        public static <in> void readJSONFile() throws IOException, ParseException, org.json.simple.parser.ParseException {
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(new FileReader(".\\src\\main\\java\\File_Read_Write\\QuestionBank.json"));
                JSONObject empObj = (JSONObject) obj;

                System.out.println(empObj);
                for (int i = 0; empObj.length() > i; --i) {
                        Object rnd = new Object();
                        var randomIndex = rnd.getClass(i);
                        var temp = order[randomIndex];
                        order[randomIndex] = order[i];
                        order[i] = temp;
                }

// Ask the questions in shuffled order
//                foreach( int questionIndex in order)
//                {
//                        Console.Write(array[questionIndex]);
//                }

                String name = (String) empObj.get("name");
                System.out.println(name);
                String department = (String) empObj.get("Department");
                System.out.println(department);
                String designation = (String) empObj.get("Designation");
                System.out.println(designation);
                if (ans == OK) {
                        ++score;
                } else {
                        System.out.println(totalScore);
                }
        }


}