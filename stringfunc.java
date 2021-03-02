import java.util.Scanner;
public class stringfunc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option: \n1. Compare two strings\n2. Get character at specified position\n3. Extract a substring\n4. Replace a character with the given character\n5. Get the position of a specified substring/character");
        int n = sc.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Enter the two strings");
                String s1 = sc.next();
                String s2 = sc.next();
                if(s1.compareTo(s2)==0){
                    System.out.println(s1+" equals "+s2);
                }
                else if(s1.compareTo(s2)<0){
                    System.out.println(s2+" greater than "+s1);
                }
                else{
                    System.out.println(s1+" greater than "+s2);
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter a string ");
                String s1 = sc.next();
                System.out.println("Enter the position you want to extract the character of");
                int a = sc.nextInt();
                System.out.println("Character at "+a+" is "+s1.charAt(a-1));
                break;
            }
            case 3:
            {
                System.out.println("Enter a string ");
                String s1 = sc.next();
                System.out.println("Enter the positons of the substring you want to extract from the string");
                int p1 = sc.nextInt();
                int p2 = sc.nextInt();
                System.out.println(s1.substring(p1-1,p2));
                break;
            }
            case 4:
            {
                System.out.println("Enter a string ");
                String s1 = sc.next();
                System.out.println("Enter the character you want to replace and the character you want to replace to");
                char ch1 = sc.next().charAt(0);
                char ch2 = sc.next().charAt(0);
                System.out.println("String : "+s1.replace(ch1, ch2));
                break;
            }
            case 5:
            {
                System.out.println("Enter a string ");
                String s1 = sc.next();
                System.out.println("Enter a string you want to find the position of");
                String s2 = sc.next();
                System.out.println("Position of "+s2+" is = "+s1.indexOf(s2));
                break;
            }
            default:
                System.out.println("Wrong Input");
        }
        sc.close();
    }
}