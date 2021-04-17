import java.util.Scanner;
class Item{
    String item_name;
    int quantity,price,total_cost;
    Scanner sc = new Scanner(System.in);
    void item_details(){
        System.out.println("Item");
        item_name = sc.nextLine();
        System.out.println("Quantity");
        quantity = sc.nextInt();
        System.out.println("Price");
        price=sc.nextInt();
        total_cost = quantity*price;
        System.out.println();
    }
}
class Invoice
{
    public static void main(String[] args)
    {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        Item[] obj = new Item[n];
        for(int i=0; i<n; i++)
        {
            obj[i] = new Item();
            obj[i].item_details();
        }
        int sum=0;
        System.out.println("Invoice:");
        for(int i=0; i<n; i++){
            System.out.println("Item Name : "+obj[i].item_name);
            System.out.println("Quantity : "+obj[i].quantity);
            System.out.println("Cost : "+obj[i].total_cost);
            sum+=obj[i].total_cost;
        }
        System.out.println("Total Cost : "+sum);
        sc.close();
    }
}