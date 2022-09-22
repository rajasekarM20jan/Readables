//--------------Business Logic------------
//import statements for
import java.io.FileReader; //1. Reading any file (here : JSON)
import java.util.ArrayList; //2. Creating Arraylist for POJO class constructor.
import org.json.simple.JSONArray; //3. Creating Json list/array
import org.json.simple.JSONObject; //4. Creating object for json which formats for json type
import org.json.simple.parser.JSONParser; //5. parsing json file into the class

public class AcquireBankData{

    //creating constructor for class AcquireBankData
    AcquireBankData() throws Exception{
        // parsing json data into regular class object
        Object oj = new JSONParser().parse(new FileReader("C:\\Users\\raj\\IdeaProjects\\rajasekar\\src\\AccountDetails.json"));
        //converting object into array of json format
        JSONArray j= (JSONArray) oj;
        //converting each json array index objects into respective jsonobjects
        JSONObject first= (JSONObject) j.get(0);
        JSONObject second= (JSONObject) j.get(1);
        JSONObject third= (JSONObject) j.get(2);
        //creating array named details for storing json objects
        JSONObject[] details = {first,second,third};
        //creating new arraylist for pojo Bank
        ArrayList<Bank> arr= new ArrayList<>();
        //using for loop for pushing data to Bank
        for(int i=0;i<details.length;i++) {
            arr.add(new Bank((String)details[i].get("name"),(String)details[i].get("pin"),(String)details[i].get("typeOfAccount"),(String)details[i].get("dateOfBirth"),(String)details[i].get("balance")));
        }
        //using for loop for pulling data from Bank
        for(int k=0;k<details.length;k++){
            //using getter methods from Bank for pulling data
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
    //------------Execution Logic-------------
    public static void main(String[] args) throws Exception {
        //calling constructor AcquireBankData for operation executions.
        new AcquireBankData();
    }
}