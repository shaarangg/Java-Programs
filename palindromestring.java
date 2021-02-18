import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int l = s.length();
        String s1="";
        for(int i =l-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        if(s.equals(s1)==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
