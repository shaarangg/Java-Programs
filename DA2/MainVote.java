import java.util.*;
class Count{
    int[] voters = new int[240];
    int counter = 0;
    synchronized void increment(int n){
        voters[counter] = n;
        counter++;
    }
}
class VoteCount implements Runnable{
    Count obj;
    Random r = new Random();
    int n;
    String name;
    Thread t;
    VoteCount(Count o, int n, String name){
        this.obj = o;
        this.n = n;
        t = new Thread(this, name);
        t.start();
    }
    
    public void run(){
        while(obj.counter<240)
        {
            this.obj.increment(this.n);
            try{
                int s = r.nextInt((150 - 100)+1) + 100;
                Thread.sleep(s);
            }catch(InterruptedException e){System.out.println(e);}
        }
    }
}
class MainVote{
    public static void main(String[] args){
        Count c = new Count();
        VoteCount a = new VoteCount(c, 0, "A");
        VoteCount b = new VoteCount(c, 1, "B");
        VoteCount cv = new VoteCount(c, 2, "C");
        
        try{
            a.t.join();
            b.t.join();
            cv.t.join();
        }catch (InterruptedException e){System.out.println(e);}
        
        int ac,bc,cc;
        ac = bc = cc = 0;
        for(int i =0; i<240;i++){
            if(c.voters[i]==0) ac++;
            
            if(c.voters[i]==1) bc++;
            
            if(c.voters[i]==2) cc++;
        }
        
        System.out.println("A votes: "+ac);
        
        System.out.println("B votes: "+bc);
        
        System.out.println("C votes: "+cc);
        if( ac >= bc && ac >= cc){
            if(ac == bc || ac == cc)
                System.out.println("Tie in elections");
            else
                System.out.println("A has won the elections");
        }
        else if(bc >= ac && bc >= cc){
            if(bc == cc)
                System.out.println("Tie in elections!");
            else
                System.out.println("B has won the elections!");
        }
        else{
            System.out.println("C has won the elections!");
        }
    }
}