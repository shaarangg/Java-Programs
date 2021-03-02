import java.util.*;
public class conversion {
    public void binary(int x){
        StringBuilder s= new StringBuilder();
        while(x>0){
            s.append(x%2);
            x/=2;
        }
        s.reverse();
        System.out.println("Binary : "+s);   
    }
    public void oct(int x) {
        StringBuilder s= new StringBuilder();
        while(x>0){
            s.append(x%8);
            x/=8;
        }
        s.reverse();
        System.out.println("Octal : "+s);
    }
    public void hex(int x) {
        char[] a = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder s= new StringBuilder();
        while(x>0){
            s = s.append(a[x%16]);
            x/=16;
        }
        s.reverse();
        System.out.println("Hexadecimal : "+s);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        conversion obj = new conversion();
        obj.binary(n);
        obj.oct(n);
        obj.hex(n);
        sc.close();
    }
}