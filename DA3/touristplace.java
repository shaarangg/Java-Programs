import java.util.*;
class tourist implements Comparable<tourist>{
    String name, state, famous_spot;
    tourist(String name,String state,String famous_spot)
    {
        this.name = name;
        this.state = state;
        this.famous_spot = famous_spot;
    }

    @Override
    public int compareTo(tourist obj){
        return this.name.compareTo(obj.name);
    }

    @Override
    public String toString(){
        return "Name: "+this.name+"\nState: "+this.state+"\nFamous-Spot: "+this.famous_spot;
    }
}


class TourNotPresent extends Exception{
    TourNotPresent(){
        super("Tour not present in the list");
    }
}


class touristplace{
    public int indexByProperty(ArrayList<tourist> st, String famous_spot)
    {
        tourist j;
        for(int i=0; i<st.size(); i++){
            j=st.get(i);
            if(j.famous_spot.equals(famous_spot))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] agrs)throws TourNotPresent
    {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        String name,state,famous_spot;
        Scanner sc = new Scanner(System.in);
        touristplace obj = new touristplace();

        System.out.println("Enter the number of tours");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<tourist> a= new ArrayList<>(n);
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of the tour");
            name = sc.nextLine();
            System.out.println("Enter the name of the state");
            state = sc.nextLine();
            System.out.println("Enter the name of the famous-spot");
            famous_spot = sc.nextLine();
            a.add(new tourist(name, state, famous_spot));
        }


        ArrayList<tourist> st= new ArrayList<>(n);
        System.out.println("Enter the states that are in the south");
        state = sc.nextLine();
        String[] statelist = state.split(" ");
        for(int i=0; i<statelist.length; i++)
        {
            for(tourist j : a)
            {
                if(j.state.equals(statelist[i]))
                {
                    st.add(j);
                }
            }
        }

        Collections.sort(st);
        System.out.println("List in sorted order is");
        for(tourist i: st){
            System.out.println(i);
        }

        System.out.println("Enter the name of the tourist-spot to search");
        famous_spot = sc.nextLine();
        sc.close();
        int index = obj.indexByProperty(st, famous_spot);
        if(index==-1)
        {
            throw new TourNotPresent();
        }
        else{
            System.out.println(st.get(index));
        }
    }  
}