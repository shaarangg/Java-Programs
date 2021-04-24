import java.util.*;
class MorningReminder extends Exception
{
    @Override
    public String toString(){
        return "Morning Reminder";
    }
}

class AfternoonReminder extends Exception
{
    @Override
    public String toString(){
        return "Afternoon Reminder";
    }
}

class EveningReminder extends Exception
{
    @Override
    public String toString(){
        return "Evening Reminder";
    }
}

class NightReminder extends Exception
{
    @Override
    public String toString(){
        return "Night Reminder";
    }
}

public class ClockApp{
    public static void main(String[] args)
    {
        System.out.println("19BCT0215\nShaarang");
        String timeofDay="";
        Calendar c = new GregorianCalendar();
        int h = c.get(Calendar.HOUR);
        int m = c.get(Calendar.MINUTE);

        try{
            if(h>=5 && h<12) 
                throw new MorningReminder();
            
            if(h>=12 && h<17) 
                throw new AfternoonReminder();
            
            if((h>=17 && h<18)|| (h>=18 && h<19 && m<=30)) 
                throw new EveningReminder();
            
            if(h>18 ||(h==18 && m>30)) {
                throw new NightReminder();
            }
        }
        catch(MorningReminder e){
            timeofDay = "Morning, Have Fresh Vegetable Juice and then Sugar Tablet with mild walking";
        }
        catch(AfternoonReminder e){
            timeofDay = "Its Day Time, after lunch have tablet to avoid sleep";
        }
        catch(EveningReminder e){
            timeofDay = "Hello, Good Evening have a dinner";
        }
        catch(NightReminder e){
            timeofDay = "Night, Go for sleep";
        }
        System.out.println(timeofDay);    
    }
}