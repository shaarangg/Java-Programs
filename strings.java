import java.util.Scanner;
public class strings 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer();
        System.out.println("Enter a string");
        s.append(sc.next());
        System.out.println("Select an option: \n1. Append a string\n2. Insert a string\n3. Delete a portion of string");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Enter the string you want to append");
                s.append(" "+sc.next());
                break;
            case 2:
                System.out.println("Enter the string you want to insert");
                String a = sc.next();
                System.out.println("Enter the position you want to insert the string");
                s.insert(sc.nextInt(),a);
                break;
            case 3:
                System.out.println("Enter the positons of the portion you want to delete from the string");
                int p1 = sc.nextInt();
                int p2 = sc.nextInt();
                s.delete(p1-1, p2);
                break;
            default:
                System.out.println("Wrong Input");
        }
        System.out.println("String after performing the "+n+" operation is "+s);
        sc.close();
    }
}