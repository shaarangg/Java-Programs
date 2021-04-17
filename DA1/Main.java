interface Test
{
    int x = 10;
}
public class Main {
    public static void main(String[] args)
    {
        Test.x = 20;
        System.out.println(Test.x);
    }
}
