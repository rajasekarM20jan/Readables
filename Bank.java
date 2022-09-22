public class Bank {
    String name;
    String pin;
    String typeOfAccount;
    String dateOfBirth;
    String balance;

    public Bank(String name,String pin,String typeOfAccount,String dateOfBirth,String balance) {
        this.name=name;
        this.pin=pin;
        this.typeOfAccount=typeOfAccount;
        this.dateOfBirth=dateOfBirth;
        this.balance=balance;
    }
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
