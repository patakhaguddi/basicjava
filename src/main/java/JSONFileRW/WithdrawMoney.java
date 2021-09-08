package JSONFileRW;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WithdrawMoney {
    private static Object String;
    private static Object IOException;
    private static Object ParseException;

    public static void main(String args[] ) throws IOException, ParseException {
        Scanner s = new Scanner(System.in);
        int amount=1000;
        while(true)
        {
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
//            int amount;
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    JSONParser jsonParser = new JSONParser();
                    Object obj = jsonParser.parse(new FileReader(".\\src\\main\\java\\JSONFileRW\\User.json"));
                    JSONObject empObj = (JSONObject) obj;

                    System.out.println(empObj);
                    String name = (String) empObj.get("Name");
                    System.out.println(name);
                    String pin = (String) empObj.get("PIN");
                    System.out.println(pin);
                    int balance = (int) empObj.get("Balance");
                    System.out.println(balance);
                    String PINest = s.nextLine();
                    if (PINest == pin)
                        {
//                        balance = balance - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("Choose 1 for Check Balance");
                            System.out.println("Choose 2 for Withdraw Money");

                            int option = s.nextInt();

                            if (amount % 500 != 0) {
                                System.out.println("Please input amount that is multiply by 500");
                            }
                            else if(amount > balance)
                            {
                                System.out.println("Not enough balance");
                            }
                            int deductedBalance = balance - amount;
                            System.out.println(deductedBalance);
                    }


                    else
                    {
                        System.out.println("Incorrect pin");
                    }
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + n);
            }

                    System.out.println("Card is blocked");

//            default:
//                    throw new IllegalStateException("Unexpected value: " + n);
            }

        public static void updateJSON;(int name, int balance){
            String fileName="User.json";
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject empObj = (JSONObject) obj;
            System.out.println(empObj);
            empObj.put(name, balance);
            FileWriter file = new FileWriter(fileName);
            file.write(empObj.toJSONString());
            file.flush();
            file.close();
            System.out.println("Updated!");
            System.out.print(empObj);
        }






    }
}
