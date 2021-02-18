import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter\n1. First Patter\n2.Second Pattern");
        int choice = sc.nextInt();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        switch(choice){
            case 1:
                for(int i=1; i<=n; i++){
                    for(int j =1; j<=i; j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            
            case 2:
                char ch;
                System.out.println("Enter the character");
                ch = sc.next().charAt(0);
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int k=1; k<=i; k++){
                        System.out.print(ch+" ");
                    }
                    System.out.println();
                }
                for(int i=2; i<=n; i++){
                    for(int j=2; j<=i;j++){
                        System.out.print(" ");
                    }
                    for(int k=n; k>=i; k--){
                        System.out.print(ch+" ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Wrong Choice");
        }
        sc.close();
    }
}