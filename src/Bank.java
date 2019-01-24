import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements Serializable {

    HashMap<Long,Customer> customers;
    HashMap<Long,Branch> branches;
    HashMap<Long,account> accounts;
    HashMap<Long,Transaction> transactions;
    static int counter=0;
    Bank()
    {

        customers=new HashMap<>();
        branches=new HashMap<>();
        accounts=new HashMap<>();
        transactions=new HashMap<>();
    }

    public HashMap<Long, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Long, Customer> customers) {
        this.customers = customers;
    }

    public HashMap<Long, Branch> getBranches() {
        return branches;
    }

    public void setBranches(HashMap<Long, Branch> branches) {
        this.branches = branches;
    }

    public HashMap<Long, account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<Long, account> accounts) {
        this.accounts = accounts;
    }

    public HashMap<Long, Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(HashMap<Long, Transaction> transactions) {
        this.transactions = transactions;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                ", branches=" + branches +
                ", accounts=" + accounts +
                ", transactions=" + transactions ;
    }



}
