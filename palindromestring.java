import java.util.Scanner;
public class palindromestring {
    public static void main(String[] args) {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        StringBuffer s1 = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int l = s.length();
        for(int i =l-1; i>=0; i--){
            s1.append(s.charAt(i));
        }
        String s2 = s1.toString();
        if(s.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
