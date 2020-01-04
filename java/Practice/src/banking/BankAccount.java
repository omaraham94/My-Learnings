package banking;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phoneNumber;
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public int getBalance() {
        return this.balance;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(int amt) {
        if (amt <= 0) {
            System.out.println("invalid amount");
        } else {
            this.balance += amt;
            System.out.println("successful transaction");
        }
    }

    public void withdraw(int amt) {
        if ((amt <= 0)) {
            System.out.println("invalid amount");
        } else if (amt > balance) {
            System.out.println("insufficient funds");
        } else {
            this.balance -= amt;
            System.out.println("successful transaction");
        }
    }

    public static void main(String[] args) {
        BankAccount cus1 = new BankAccount();
        BankAccount cus2 = new BankAccount();
        cus1.setAccountNumber("123456789");
        cus1.setBalance(0);
        cus1.setEmail("this@gmail.com");
        cus1.setName("Clark");
        cus1.setPhoneNumber("9494949494");
        cus2.setAccountNumber("123456789");
        cus2.setBalance(0);
        cus2.setEmail("this@gmail.com");
        cus2.setName("Mark");
        cus2.setPhoneNumber("9494949494");

        if (cus1.getAccountNumber() == cus2.getAccountNumber()) {
            System.out.println("they are same");
        } else {
            System.out.println("they are different");
        }

        System.out.println("the account info is name : " + cus1.getName() +
                "\n account number is " + cus1.getAccountNumber() +
                "\n balance is " + cus1.getBalance() +
                "\n email is " + cus1.getEmail() +
                "\n phone number is " + cus1.getPhoneNumber());
    }
}
