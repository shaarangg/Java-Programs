import java.util.*;
interface Anagram
{
    void CheckAnagram(String a, String b);
}
class demo implements Anagram
{
    public void CheckAnagram(String a, String b)
    {
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.length()==b.length()){
            int count=0;
            for(int i=0; i<a.length(); i++){
                for(int j=0; j<b.length(); j++){
                    if(a.charAt(i)==b.charAt(j)){
                        count++;
                        b = b.substring(0,j)+b.substring(j+1); // Removing the character
                        break;
                    }
                }
            }
            if(count==a.length()){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
public class ques{
    public static void main(String[] args)
    {
        System.out.println("SHAARANG SINGH\n19BCT0215");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = sc.nextLine();
        System.out.println("Enter the second string");
        String b = sc.nextLine();
        demo obj = new demo();
        obj.CheckAnagram(a,b);
        sc.close();
    }
}