//--------------Business Logic------------
//Creation of POJO class
public class Bank {
    //Initializing the global variables for POJO class named Bank
    String name;
    String pin;
    String typeOfAccount;
    String dateOfBirth;
    String balance;
    //creating a parameterized constructor for getting the data from JSON Object from child class AcquireBankData
    public Bank(String name,String pin,String typeOfAccount,String dateOfBirth,String balance) {
        //Assigning whatever the data got into class variables using "this" keyword
        this.name=name;
        this.pin=pin;
        this.typeOfAccount=typeOfAccount;
        this.dateOfBirth=dateOfBirth;
        this.balance=balance;
    }
    //creating get method for class variables with return type.
    public String getName() {
        return name;
    }
    public String getPin() {
        return pin;
    }
    public String getTypeOfAccount() {
        return typeOfAccount;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getBalance() {
        return balance;
    }
}
