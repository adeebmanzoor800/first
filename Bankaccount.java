public class Bankaccount {
    private static int accountnumber;
    private static String accountholdername;
    private static int accountbalance;
    private static String fathersname;
    private static int age;
    public  Bankaccount(int accountnumber, int accountbalance, String accountholdername){
        this.accountnumber=accountnumber;
        this.accountbalance=accountbalance;
        this.accountholdername=accountholdername;
    }
    public static void displayaccountinfo1(){
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Account Holder Name: " + accountholdername);
        System.out.println("Account Balance: " + accountbalance);
    }
    public void deposit(double amount) {
       accountbalance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= accountbalance) {
            accountbalance -= amount;
        }
    }
    public static void main(String[] args) {
        Bankaccount account1 = new Bankaccount(12345, 10000, "johnny levelr");

        account1.deposit(500.0);
        account1.withdraw(200.0);

        account1.displayaccountinfo1();

    }}



