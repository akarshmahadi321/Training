import java.util.*;
import java.io.*;
public class BankTest {
    public static void main(String[] args) throws Exception {

        Scanner in=new Scanner(System.in);

        int option;



        long id;
        double bal;


        Bank myBank;
        try
        {
            FileInputStream f2=new FileInputStream("test.txt");
            ObjectInputStream o2=new ObjectInputStream(f2);
            myBank=(Bank) o2.readObject();

        }catch (IOException e)
        {
            myBank=new Bank();

        }
        FileOutputStream f1=new FileOutputStream("test.txt");
        ObjectOutputStream o1=new ObjectOutputStream(f1);








        while(true)
        {
            System.out.println("Enter options:\n 1.Register 2.Deposit 3.Withdraw 4.Balance info 5.Exit ");
            option=in.nextInt();

            switch(option)
            {
                case 1:
                    {
                    System.out.println("Enter id,mobile,name and address");
                    id=in.nextLong();
                    Customer c=new Customer(id,in.nextLong(),in.next(),in.next());
                    myBank.customers.put(id,c);
                    System.out.println("Enter balance,type & branchid");
                    account a=new account(c,in.nextDouble(),in.next(),in.nextLong());
                    myBank.accounts.put(id,a);
                    System.out.println(myBank);
                    o1.writeObject(myBank);

                    break;

                }
                case 2:
                {

                    System.out.println("Enter cust id");
                    account acc=myBank.getAccounts().get(in.nextLong());
                    System.out.println("Enter amt to be deposited");
                    acc.deposit(in.nextDouble());
                    System.out.println(acc.getBalance());
                    o1.writeObject(myBank);


                    break;

                }
                case 3:
                {

                    System.out.println("Enter cust id");
                    account acc=myBank.getAccounts().get(in.nextLong());
                    System.out.println("Enter amt to be withdrawn");
                    acc.withdraw(in.nextDouble());
                    System.out.println(acc.getBalance());
                    o1.writeObject(myBank);

                    break;


                }
                case 4:
                { System.out.println("Enter cust id");
                    account acc=myBank.getAccounts().get(in.nextLong());
                    System.out.println(acc.getBalance());
                    o1.writeObject(myBank);
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Enter valid option");
                    break;
                }
            }


        }

    }
}
