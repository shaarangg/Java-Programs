import java.util.*;
class Product implements Comparable<Product>
{
    String pid;
    int diameter,length,weight;
    Product(String pid, int diameter,int length,int weight){
        this.pid = pid;
        this.diameter = diameter;
        this.length = length;
        this.weight = weight;
    }
    public int compareTo(Product c)
    {
        return pid.compareTo(c.pid);
    }
}
public class workingWithSet{
    public static void main(String[] args)
        {
            System.out.println("Shaarang Singh\n19BCT0215\n");
            String pid;
            int diameter,length,weight;
            Scanner sc = new Scanner(System.in);
            SortedSet<Product> correct = new TreeSet<>();
            HashSet<Product> wrong = new HashSet<>();
            System.out.println("Enter the number of samples");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the details of samples");
            for(int i=0; i<n; i++)
            {
                System.out.println("Sample-"+(i+1));
                System.out.print("Product ID: ");
                pid = sc.nextLine();
                System.out.print("Diameter: ");
                diameter = sc.nextInt();
                System.out.print("Length: ");
                length = sc.nextInt();
                System.out.print("Weight: ");
                weight = sc.nextInt();
                sc.nextLine();
                if(length==10 && diameter==3 && weight==100)
                {
                    correct.add(new Product(pid, diameter, length, weight));
                }
                else{
                    wrong.add(new Product(pid, diameter, length, weight));
                }
            }
            sc.close();
            System.out.println("Correct Samples are -:");
            for(Product i : correct)
            {
                System.out.println("Product ID: "+i.pid);
                System.out.println("Diameter: "+i.diameter);
                System.out.println("Length: "+i.length);
                System.out.println("Weight: "+i.weight);
            }
    }
}