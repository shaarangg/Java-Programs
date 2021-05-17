import java.util.*;
class TouristSpot{
    String name;
    String sn;
    TouristSpot(String name,String sn)
    {
        this.name=name;
        this.sn=sn;
    }
}
class cat2{
    public void find(ArrayList<TouristSpot> a)
    {
        TouristSpot ts,ts1;
        ArrayList<String> s= new ArrayList<>();
        int c=0;
        for(int i =0; i<a.size()-1; i++)
        {
            ts = a.get(i);
            for(int k=i+1; k<a.size(); k++)
            {
                ts1 = a.get(k);
                if((ts1.sn).equals(ts.sn))
                {
                    c=0;
                    for(String j : s)
                    {
                        if(j.equals(ts.sn))
                        {
                            c=1;
                            break;
                        }
                    }
                    if(c==0)
                    {
                        s.add(ts.sn);
                    }
                }
            }
        }
        System.out.println("States with multiple Tourist Spots are -:");
        for(String i : s)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int n;
        System.out.println("Shaarang\n19BCT0215");
        System.out.println("Enter the number of Tourist Places");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        TouristSpot[] a = new TouristSpot[n];
        String name,sn;
        sc.nextLine();
        ArrayList<TouristSpot> l = new ArrayList<>(n);
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter name of tourist spot");
            name =sc.nextLine();
            System.out.println("Enter name of the state");
            sn=sc.nextLine();
            a[i] = new TouristSpot(name, sn);
            l.add(a[i]);
        }
        cat2 obj = new cat2();
        obj.find(l);
        sc.close();
    }
}