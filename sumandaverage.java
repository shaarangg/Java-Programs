import java.util.Scanner;
public class sumandaverage {
    public static void main(String[] args) {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Enter the number");
        for(int i =0; i<n; i++){
            sum+=sc.nextDouble();
        }
        double average;
        average = (double)sum/n;
        System.out.println("Sum: "+sum+"\nAverage: "+average);
        sc.close();
    }
}
