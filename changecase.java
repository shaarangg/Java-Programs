import java.util.Scanner;
public class changecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a;
        StringBuffer s1 = new StringBuffer();
        for(int i =0; i<s.length(); i++){
            a = s.charAt(i);
            if(a>=65 && a<=90){
                s1.append((char)(a+32));
            }
            else{
                s1.append((char)(a-32));
            }
        }
        System.out.println(s1);
        sc.close();
    }
}