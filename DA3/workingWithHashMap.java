import java.util.*;
public class workingWithHashMap {
    public void add(Scanner sc, HashMap<String, String[]> h1)
    {
        String name;
        String[] sub;
        System.out.println("Enter the name of the student");
        name  = sc.nextLine();
        System.out.println("Enter the names of the subjects");
        sub = sc.nextLine().split(" ");
        h1.put(name, sub);
        System.out.println("Student successfully added");
    }
    public void remove(Scanner sc, HashMap<String, String[]> h1)
    {
        String name;
        System.out.println("Enter the name of the student");
        name  = sc.nextLine();
        h1.remove(name);
        System.out.println("Student successfully removed");
    }
    public void dispteacher(Scanner sc, HashMap<String, String[]> h1,HashMap<String, String> h2)
    {
        String name;
        System.out.println("Enter the name of the student");
        name  = sc.nextLine();
        System.out.println("Teachers who teaches "+name+" are:");
        String[] sub = h1.get(name);
        for(int i=0; i<sub.length; i++)
        {
            System.out.println(h2.get(sub[i]));
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        workingWithHashMap obj = new workingWithHashMap();
        Scanner sc = new Scanner(System.in);
        HashMap<String, String[]> h1 = new HashMap<>();
        HashMap<String, String> h2 = new HashMap<>();
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();
        String name, faculty;
        String[] sub;
        for(int i=0; i<n; i++)
        {
            System.out.println("Name of Student-"+(i+1));
            name = sc.nextLine();
            System.out.println("Name of Subjects");
            sub = sc.nextLine().split(" ");
            h1.put(name, sub);
        }
        System.out.println("Enter the number of courses offered");
        int m = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<m; i++)
        {
            System.out.println("Course name:");
            name = sc.nextLine();
            System.out.println("Faculty name:");
            faculty = sc.nextLine();
            h2.put(name, faculty);
        }
        do{
            System.out.println("Enter\n1. Add a student\n2. Remove a student\n3. Fetch the name of all teachers of a student\n4. Exit");
            n= sc.nextInt();
            sc.nextLine();
            switch(n){
                case 1:
                    obj.add(sc, h1);
                    break;
                
                case 2:
                    obj.remove(sc, h1);
                    break;
                
                case 3:
                    obj.dispteacher(sc, h1, h2);
                    break;
                
                case 4:
                    continue;
                
                default:
                    System.out.println("Wrong Input!");
            }
        }while(n!=4);
        sc.close();
    }   
}