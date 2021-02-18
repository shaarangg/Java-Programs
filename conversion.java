import java.util.*;
public class conversion {
    public void binary(int x){
        String s="";
        while(x>0){
            s = Integer.toString(x%2) + s;
            x/=2;
        }
        System.out.println("Binary : "+s);   
    }
    public void oct(int x) {
        String s="";
        while(x>0){
            s = Integer.toString(x%8) + s;
            x/=8;
        }
        System.out.println("Octal : "+s);
    }
    public void hex(int x) {
        char a[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String s="";
        while(x>0){
            s = a[x%16] + s;
            x/=16;
        }
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