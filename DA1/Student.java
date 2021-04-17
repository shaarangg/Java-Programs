import java.util.Scanner;
public class Student {
    String regno,name,branch;
    int year,semester;
    int[] marks = new int[5];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your regno.");
        regno = sc.nextLine();
        System.out.println("Enter your branch");
        branch = sc.next();
        System.out.println("Enter the year you are in");
        year = sc.nextInt();
        System.out.println("Enter the semester you are in");
        semester=sc.nextInt();
        System.out.println("Enter the marks in all subjects");
        for(int i=0; i<5; i++)
        {
            marks[i]=sc.nextInt();
        }
        sc.close();
    }
    char grade(int[] a){
        int sum=0;
        for(int i=0; i<5; i++){
            sum+=a[i];
        }
        sum/=5;
        if(sum>=90)
            return 'S';
        else if(sum>=80 && sum<90)
            return 'A';
        else if(sum>=70 && sum<80)
            return 'B';
        else if(sum>=60 && sum<70)
            return 'C';
        else if(sum>=50 && sum<60)
            return 'D';
        else if(sum>=40 && sum<50)
            return 'E';
        else
            return 'F';
    }
    void print(){
        System.out.println(name);
        System.out.println(regno);
        System.out.println(branch);
        System.out.println(year);
        System.out.println(semester);
        System.out.println(grade(marks));
    }
    public static void main(String[] args){
        Student obj = new Student();
        System.out.println("Shaarang Singh\n19BCT0215\n");
        obj.input();
        obj.print();
    }
}