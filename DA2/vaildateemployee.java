import java.util.*;
class Employee{
    String eid,name,year;
    Employee(String eid, String name, String year)
    {
        this.eid=eid;
        this.name=name;
        this.year=year;
    }
    void display()
    {
        System.out.println("\nEmployee Details");
        System.out.println("Employee ID: "+this.eid);
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Year of Joinning: "+this.year);
    }
}
class InvalidEmployeeCode extends Exception{
    InvalidEmployeeCode(String msg)
    {
        super(msg);
    }
}

class vaildateemployee{
    public static void main(String[] args) throws InvalidEmployeeCode
    {   
        System.out.println("SHAARANG SINGH\n19BCT0215");
        String eid,name,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        eid=sc.nextLine();
        System.out.println("Enter the Employee Name");
        name = sc.nextLine();
        System.out.println("Enter the year of birth");
        year = sc.nextLine();
        sc.close();
        String[] arr = eid.split("-",0);

        if(arr[0].length()!=2)
            throw new InvalidEmployeeCode("Invalid Employee ID");
        else
        {
            for(int i=0; i<2; i++)
            {
                if(!Character.isDigit(arr[0].charAt(i)))
                    throw new InvalidEmployeeCode("Invalid Employee ID");
            }
        }
        
        if(arr[1].charAt(0)!='F' && arr[1].charAt(0)!='S')
            throw new InvalidEmployeeCode("Invalid Employee ID");
        
        if(arr[2].length()!=3)
            throw new InvalidEmployeeCode("Invalid Employee ID");
        else
        {
            for(int i=0; i<3; i++)
            {
                if(!Character.isDigit(arr[2].charAt(i)))
                    throw new InvalidEmployeeCode("Invalid Employee ID");
            }
        }
        Employee obj = new Employee(eid, name, year);
        obj.display();
    }
}