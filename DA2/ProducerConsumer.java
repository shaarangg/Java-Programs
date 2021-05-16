import java.util.*;
class Q{
    Scanner sc = new Scanner(System.in);
    String s;
    boolean flag=false;
    boolean r = true;
    ArrayList<String> buff = new ArrayList<>();
    int i=0;
    synchronized void get(){
        if(!flag){
            try{
                wait();
            }catch(InterruptedException e){System.out.println(e);}
        }
        if(!r){
            return;
        }
        System.out.println("Consumer: "+buff.get(i-1));
        flag=false;
        notify();
    }
    synchronized void put(){
        if(flag){
            try{
                wait();
            }catch(InterruptedException e){System.out.println(e);}
        }
        System.out.println("Enter a string");
        s = sc.next();
        if(!s.equals("Stop"))
        {
            buff.add(s);
            i++;
            System.out.println("Produced: "+s);
        }
        else{
            r=false;
        }
        flag = true;
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run(){
        while(q.r){
            q.put();
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while(q.r){
            q.get();
        }
    }
}

class ProducerConsumer{
    public static void main(String[] args){
        Q q = new Q();
        System.out.println("Enter stop to stop");
        new Producer(q);
        new Consumer(q);
    }
}