interface operation
{
    void add(float a, float b);
    void sub(float a, float b);
    void multiply(float a, float b);
    void divide(float a, float b);
}
class IntegerValues implements operation
{
    public void add(float a, float b){
        System.out.println("Addition : "+(a+b));
    }
    public void sub(float a, float b){
        System.out.println("Subtraction : "+(a-b));
    }
    public void multiply(float a, float b){
        System.out.println("Multiplication : "+(a*b));
    }
    public void divide(float a, float b){
        System.out.println("Division : "+(a/b));
    }
}
class FloatValues implements operation
{
    public void add(float a, float b){
        System.out.println("Addition : "+(a+b));
    }
    public void sub(float a, float b){
        System.out.println("Subtraction : "+(a-b));
    }
    public void multiply(float a, float b){
        System.out.println("Multiplication : "+(a*b));
    }
    public void divide(float a, float b){
        System.out.println("Division : "+(a/b));
    }
}
public class Arithmetic {
    public static void main(String[] args){
        System.out.println("Shaarang Singh\n19BCT0215\n");
        IntegerValues a = new IntegerValues();
        FloatValues b = new FloatValues();
        System.out.println("Integer Operations");
        a.add(14, 15);
        a.sub(14, 15);
        a.multiply(14, 15);
        a.divide(14, 15);
        System.out.println("\nFloat Operations");
        b.add(14.2F, 15.1F);
        b.sub(14.2F, 15.1F);
        b.multiply(14.2F, 15.1F);
        b.divide(14.2F, 15.1F);
    }
}