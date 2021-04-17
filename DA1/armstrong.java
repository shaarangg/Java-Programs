import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        int a = n;
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,3);
            n/=10;
        }
        if(sum==a){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}