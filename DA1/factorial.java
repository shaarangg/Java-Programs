public class factorial {
    int fact(int x){
        if(x==1){
            return 1;
        }
        else{
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        factorial obj = new factorial();
        System.out.println(obj.fact(Integer.parseInt(args[0])));
    }
}