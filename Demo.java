
class BankCustomer {
    String custName;
    int custId;
    String address;

    public BankCustomer(String custName, int custId, String address) {
        this.custName = custName;
        this.custId = custId;
        this.address = address;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + custId);
        System.out.println("Address: " + address);
    }
}

class BankTransaction {
    String accountName; 
    String accountType; 
    long accountNumber;
    double amount;

    public BankTransaction(String accountName, String accountType, long accountNumber, double amount) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void displayTransaction() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Transaction Amount: " + amount);
    }
}

public class Demo {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Alice", 1001, "123 Main St");
        BankTransaction transaction = new BankTransaction("SBI", "Saving", 9876543210L, 1500.75);

        customer.displayCustomerInfo();
        transaction.displayTransaction();
        System.out.println("Data pushed to main branch.");
    }
}