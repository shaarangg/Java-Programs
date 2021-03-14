import java.util.Scanner;
class bubblesort {
    public static void main(String[] args) {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] a = new int[l];
        for(int i=0; i<l; i++){
            a[i] = sc.nextInt();
        }
        int temp;
        for(int i =0; i<l-1; i++){
            for(int j =0; j<l-1-i; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array");
        for(int i =0; i<l; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
