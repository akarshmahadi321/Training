import java.util.Date;
public class Transaction {
long id;
double amt;
String date;
account a;
String transactionType;

    public Transaction(long id, double amt, String date, account a, String transactionType) {
        this.id = id;
        this.amt = amt;
        this.date = date;
        this.a = a;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amt=" + amt +
                ", date='" + date + '\'' +
                ", a=" + a +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public account getA() {
        return a;
    }

    public void setA(account a) {
        this.a = a;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
