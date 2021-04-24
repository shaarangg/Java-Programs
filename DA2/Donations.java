import java.io.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class Donor implements Serializable {
    String name, address, blood_group, pno;
    Date d;
    int age;
    Donor(String name, int age, String address, String pno, String bgroup, Date dold) {
        this.name = name;
        this.address = address;
        this.blood_group = bgroup;
        this.d = dold;
        this.age = age;
        this.pno = pno;
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Age is:" + age);
        System.out.println("Contact Number:" + name);
        System.out.println("Address:" + address);
        System.out.println("Blood group:"+ blood_group);
        System.out.println("Last date of donations:" + d);        
    }
}

public class Donations {
    public static int getMonths(Date start, Date end){
        Calendar startCal = new GregorianCalendar();
        startCal.setTime(start);
        Calendar endCal = new GregorianCalendar();
        endCal.setTime(end);

        int diffYear = endCal.get(Calendar.YEAR) - startCal.get(Calendar.YEAR);
        return diffYear * 12 + endCal.get(Calendar.MONTH) - startCal.get(Calendar.MONTH);

    }

    public static void main(String[] args)throws IOException 
    {
        String name, address, blood_group, pno, date;
        int age;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of patient");
        n = sc.nextInt();
        Donor[] donors = new Donor[n];

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for(int i=0; i<n; i++)
            {
                System.out.println("Enter name");
                name = sc.next();
                System.out.println("Enter age");
                age = sc.nextInt();
                System.out.println("Enter address");
                address = sc.next();
                System.out.println("Enter contact number");
                pno = sc.next();
                System.out.println("Enter Blood Group");
                blood_group = sc.next();
                System.out.println("Enter Date in dd/MM/yy format");
                date = sc.next();
                donors[i] = new Donor(name,age,address,pno,blood_group,sdf.parse(date));
            }
        }catch (ParseException e){
            System.out.println(e);
        }
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("donation.txt"))){
            oos.writeObject(donors);
        }

        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("donation.txt")))
        {
            Donor[] savedDonors = (Donor[])ois.readObject();

            System.out.println("Donors with A+ve and Last date of Donation more than 6 months: ");
            
            for(Donor d: savedDonors)
            {
                if(getMonths(d.d,new Date()) > 6 && d.blood_group.equals("A+ve"))
                    d.display();
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        sc.close();
    }
}