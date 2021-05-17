import java.util.*;
class workingWithQueue { 
    public static void main(String[] args)
    {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        Queue<Float> q = new LinkedList<>();
        q.add(10.2f);
        q.add(11.9f);
        q.add(8.0f);
        q.add(11.2f);
        q.add(10.8f);
        q.add(6.9f);
        q.add(8.2f);
        q.add(11.5f);
        q.add(10.4f);
        q.add(8.7f);
        q.add(7.8f);
        q.add(7.5f);
        Iterator<Float> iq = q.iterator();
        float avg=0;
        while(iq.hasNext())
        {
            avg+=iq.next().floatValue();
        }
        avg = avg/12;
        int c=0;
        System.out.println("The average rainfall recorded for past 12 months is = "+avg);
        iq = q.iterator();
        while(iq.hasNext())
        {
            if(iq.next().floatValue()>avg)
                c+=1;
        }
        System.out.println("The number of months in which the rainfall is more than the average = "+c);
    }
}