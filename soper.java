import java.util.Scanner;
public class soper {
    public int wordCount(String a){
        int l = a.length();
        int c=0;
        for(int i=0; i<l; i++){
            if(a.charAt(i)==' '){
                c++;
            }
        }
        return c+1;
    }
    public String arrayToString(char[] a){
        return new String(a);
    }
    public char mostFrequent(String a){
        int[] count = new int[256];
        int l = a.length();
        for(int i=0; i<l; i++){
            count[(int)a.charAt(i)]++;
        }
        int max=0;
        char ch='\0';
        for(int i=0; i<256; i++){
            if(count[i]>max){
                max = count[i];
                ch = (char)i;
            }
        }
        return ch;
    }
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        soper obj = new soper();
        String s1 = sc.nextLine();
        System.out.println("No. of words = "+obj.wordCount(s1));
        char[] a = {'a','b','c'};
        System.out.println("String from character array = "+obj.arrayToString(a));
        System.out.println("Most frequent character = "+obj.mostFrequent(s1));
        sc.close();
    }
    
}