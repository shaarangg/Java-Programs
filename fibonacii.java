import java.util.Scanner;
public class fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0]=0;
        a[1]=1;
        for(int i =0; i<n; i++)
        {
            if(i>1){
                a[i] = a[i-1]+a[i-2];
            }
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
