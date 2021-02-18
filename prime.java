import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        int flag=0;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                flag=1;
                System.out.println("Not a prime Number");
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime Number");
        }
        sc.close();
    }
}
