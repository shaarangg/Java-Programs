import java.util.*;
abstract class BankAccount{
    String name;
    String dob;
    String ad;
    String acno;
    Double bal;
    BankAccount(String n,String d,String a,String ac,Double b){
        name=n;
        dob=d;
        ad=a;
        acno=ac;
        bal=b;
    }
    void display(){
        System.out.println("\nAccount Details");
        System.out.println("Name : "+name);
        System.out.println("Date of Birth : "+dob);
        System.out.println("Address : "+ad);
        System.out.println("Account Number "+acno);
        System.out.println("Current Balance "+bal);
        System.out.println();
    }
}
class SavingsAccount extends BankAccount{
    SavingsAccount(String n,String d,String a,String ac,Double b){
        super(n, d, a, ac, b);
    }
    void deposit(Double b){
        bal+=b;
        System.out.println("Current Balance : "+bal);
    }
    void withdraw(Double b){
        bal-=b;
        System.out.println("Current Balance : "+bal);
    }
}
public class CreateAccount{
    public static void main(String[] args){
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter date of birth");
        String dob=sc.nextLine();
        System.out.println("Enter Address");
        String ad=sc.nextLine();
        System.out.println("Enter Account Number");
        String acno=sc.nextLine();
        System.out.println("Enter balance in account");
        Double bal=sc.nextDouble();
        SavingsAccount a = new SavingsAccount(name, dob, ad, acno, bal);
        a.display();
        System.out.println("Enter the ammount you want to deposit");
        bal =sc.nextDouble();
        a.deposit(bal);
        System.out.println("Enter the ammount you want to withdraw");
        bal =sc.nextDouble();
        a.withdraw(bal);
        sc.close();
    }
}
