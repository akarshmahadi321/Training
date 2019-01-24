import java.io.*;
import java.util.*;
public class account implements Serializable
{
    Customer customer;
    double balance;
    String type;
    long branchId;

    public account(Customer customer, double balance, String type, long branchId) {
        this.customer = customer;
        this.balance = balance;
        this.type = type;
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "account{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", branchId=" + branchId +
                '}';
    }
    public void withdraw(double amt)
    {
        if(amt>balance)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            balance=balance-amt;
        }
    }
    public void deposit(double amt)
    {
        balance=balance+amt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }
}
