import java.util.*;
public class multiplication {
    public static void main(String[] args){
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter the number who's multiplication table you want");
        n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "X"+ i +" = "+(n*i));
        }
        sc.close();
    }
}