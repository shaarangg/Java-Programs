import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int temp;
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Enter the element you want to search");
        int b = sc.nextInt();
        int l =0;
        int u = n-1;
        int mid=0;
        int f=0;
        while(u>l){
            mid = (l+u)/2;
            if(b>a[mid]){
                l=mid+1;
            }
            if(b<a[mid]){
                u = mid-1;
            }
            if(b==a[mid]){
                System.out.println("Element is at "+(mid+1) + " position" );
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("Element not present");
        }
        sc.close();
    }
}
