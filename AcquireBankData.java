import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AcquireBankData{


    AcquireBankData() throws Exception{
        Object oj = new JSONParser().parse(new FileReader("C:\\Users\\raj\\IdeaProjects\\rajasekar\\src\\AccountDetails.json"));
        JSONArray j= (JSONArray) oj;
        JSONObject first= (JSONObject) j.get(0);
        JSONObject second= (JSONObject) j.get(1);
        JSONObject third= (JSONObject) j.get(2);
        JSONObject[] details = {first,second,third};
        ArrayList<Bank> arr= new ArrayList<>();
        for(int i=0;i<details.length;i++) {
            arr.add(new Bank((String)details[i].get("name"),(String)details[i].get("pin"),(String)details[i].get("typeOfAccount"),(String)details[i].get("dateOfBirth"),(String)details[i].get("balance")));
        }
        for(int k=0;k<details.length;k++){
            String nameFetcher= arr.get(k).getName();
            int pinFetcher = Integer.parseInt(arr.get(k).getPin());
            String accountTypeFetcher = arr.get(k).getTypeOfAccount();
            double balanceFetcher =  Double.parseDouble(arr.get(k).getBalance());
            System.out.println("------------------------");
            System.out.println("Name : " +nameFetcher);
            System.out.println("Pin  : " +pinFetcher);
            System.out.println("Account Type : " +accountTypeFetcher);
            System.out.println("Balance : " +balanceFetcher);
        }
    }

    public static void main(String[] args) throws Exception {
        new AcquireBankData();
    }
}
