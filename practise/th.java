public class th{
    public static void main(String[] args)
    {
        try{
            for(int i=0; i<5; i++){
                System.out.println(i+1);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
    }
}
