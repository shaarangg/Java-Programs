import java.util.*;
abstract class Telephone{
    String name;
    String pno;
    Telephone(String n, String p){
        this.name = n;
        this.pno = p;
    }
    void display(){
        System.out.println("Name - "+this.name+"\nPhone Number - "+this.pno);
    }
}
class TelephoneIndex extends Telephone
{
    TelephoneIndex(String n, String p){
        super(n,p);
    }
    void chngname(String sname){
            this.name = sname;
            System.out.println("Name Successfully changed\n");
        }
    void chngpno(String pno){
        this.pno = pno;
        System.out.println("Phone Number Successfully changed\n");
    }
}
class telephoned{
    void search(TelephoneIndex[] a, String sname){
        int l = sname.length();
        int n = a.length;
        for(int i =0; i<n; i++){
            String b = a[i].name.substring(0,l);
            if(b.equals(sname)){
                System.out.println(a[i].name + " "+ a[i].pno);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of records");
        int n = sc.nextInt();
        TelephoneIndex[] a = new TelephoneIndex[n];
        String name;
        String pno;
        for(int i =0; i<n; i++){
            System.out.println("Enter the name");
            name = sc.next();
            System.out.println("Enter the no.");
            pno = sc.next();
            a[i] = new TelephoneIndex(name, pno);
            System.out.println();
        }
        System.out.println("PhoneBook");
        for(int i=0; i<n; i++){
            a[i].display();
            System.out.println();
        }
        telephoned obj = new telephoned();
        System.out.println("Enter the string to search");
        String sname = sc.next();
        obj.search(a, sname);

        System.out.println("\n\n");
        System.out.println("Enter the string you want to change");
        sname = sc.next();
        System.out.println("Enter the new name");
        String sname1 = sc.next();
        for(int i =0; i<n; i++){
            if(a[i].name.equals(sname)){
                a[i].chngname(sname1);
                break;
            }
        }
        System.out.println("Enter the no. you want to change");
        pno = sc.next();
        System.out.println("Enter the new no.");
        String pno1 = sc.next();
        for(int i =0; i<n; i++){
            if(a[i].pno.equals(pno)){
                a[i].chngpno(pno1);
                break;
            }
        }
        sc.close();
    }
}