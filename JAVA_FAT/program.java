import java.util.*;
class Organization{
    Random r;
    List<Integer> d1 = new ArrayList<>(40);
    List<Integer> d2 = new ArrayList<>(40);
    int counter = 0,n;
    synchronized void assign(int d){
        r = new Random();
        if(d==1){
            if (this.d1.size()<40)
            {
                n = r.nextInt(100);
                if(this.d1.contains(n))
                {
                    return;
                }
                this.d1.add(n);
                counter++;
            }
        }
        else{
            if (this.d2.size()<40)
            {
                n = r.nextInt(100);
                if(this.d2.contains(n)){
                    return;
                }
                this.d2.add(n);
                counter++;
            }
        }
    }
}
class AssignPeople implements Runnable{
    Organization obj;
    Thread t;
    int n;
    AssignPeople(Organization o, int n){
        this.obj = o;
        this.n = n;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        while(obj.counter<80){
            this.obj.assign(n);
        }
    }
}
class program{
    public static void main(String[] args){


        Organization o = new Organization();
        AssignPeople d1 = new AssignPeople(o, 1);
        AssignPeople d2 = new AssignPeople(o, 2);
        System.out.println("Shaarang\n19BCT0215\n");


        try{
            d1.t.join();
            d2.t.join();
        }catch(Exception e){System.out.println(e);}


        System.out.println("Employee ID of people assigned for duty in Department 1:");
        for(int i: o.d1){
            System.out.print(i+1 + " ");
        }

        System.out.println();


        System.out.println("Employee ID of people assigned for duty in Department 2:");
        for(int i: o.d2){
            System.out.print(i+1 + " ");
        }
    }
}