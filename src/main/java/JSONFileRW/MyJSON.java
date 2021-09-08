package JSONFileRW;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyJSON {
    public static void main(String[] args) throws IOException, ParseException {
//        writeJSON();
//        readJSON();
        writeJSONList();

    }

//    public static void writeJSON() throws IOException {
//        JSONObject empObj=new JSONObject();
//        empObj.put("Name", "Saima");
//        empObj.put("PID", "1234");
//
//        FileWriter writer=new FileWriter("User.json");
//        writer.write(empObj.toJSONString());
//        writer.flush();
//        writer.close();
//    }
//    public static void readJSON() throws IOException, ParseException {
//        JSONParser jsonParser = new JSONParser();
//        Object obj = jsonParser.parse(new FileReader(".\\src\\main\\java\\JSONFileRW\\User.json"));
//        JSONObject empObj = (JSONObject) obj;
//
//        System.out.println(empObj);
//        String name = (String) empObj.get("Name");
//        System.out.println(name);
//        String department = (String) empObj.get("Department");
//        System.out.println(department);
//        String designation = (String) empObj.get("Designation");
//        System.out.println(designation);
//
//        JSONObject addressObj = (JSONObject) empObj.get("address");
//        String area=(String) addressObj.get("Area");
//        System.out.println(area);
//        String po=(String) addressObj.get("PO");
//        System.out.println(po);
//        String present_address=(String) addressObj.get("present_address");
//        System.out.println(present_address);
//
//        String phone_number = (String) empObj.get("phone_number");
//        System.out.println(phone_number);
//    }
    public static void writeJSONList() throws IOException, ParseException {
        char ch;
        String fileName=".\\src\\main\\java\\JSONFileRW\\User.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject userObj = new JSONObject();

            Scanner input = new Scanner(System.in);
            System.out.println("Input user name: ");
            userObj.put("Name", input.nextLine());
            System.out.println("Input Pin: ");
            userObj.put("PIN", input.nextLine());
            System.out.println("Input balance: ");
            userObj.put("Balance", input.nextLine());
//            System.out.println("Input roll: ");
//            studentObj.put("roll", input.next());

            JSONArray jsonArray = (JSONArray) obj;
            //System.out.print(jsonArray);
            jsonArray.add(userObj);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch=input.next().charAt(0);

        }
        while(ch!='n');
    }
    public static void readJSONList() throws IOException, ParseException {
        String fileName=".\\src\\main\\java\\JSONFileRW\\User.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) obj;
        int pos = 0;
        JSONObject json = (JSONObject) jsonArray.get(pos);
        //System.out.println(json);

        String name = (String) json.get("name");
        String roll = (String) json.get("roll");
        String section = (String) json.get("section");
        String _class = (String) json.get("class");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(section);
        System.out.println(_class);
    }
}
