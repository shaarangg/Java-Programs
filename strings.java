import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        System.out.println("Enter the string you want to compare with");
        String s2 = sc.nextLine();
        if(s1.compareTo(s2)>0){
            System.out.println(s1+" is greater than "+s2);
        }
        else if(s1.compareTo(s2)==0){
            System.out.println(s1+" is equal to "+s2);
        }
        else{
            System.out.println(s1+" is less than "+s2);
        }        
        System.out.println("Enter the position");
        int n = sc.nextInt();
        System.out.println("Character at "+n+" positon is "+s1.charAt(n-1));
        System.out.println("Enter the positions to take out the substring");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println(s1.substring(a1,a2+1));
        System.out.println("Enter the character to replace");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the character to replace to");
        char ch1 = sc.next().charAt(0);
        s1=s1.replace(ch, ch1);
        System.out.println("String after replace is done "+s1);
        sc.close();
    }
}
