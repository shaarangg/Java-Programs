import java.util.*;
public class demonstrateexceptions {
    public static void main(String[] args)
    {
        System.out.println("SHAARANG SINGH\n19BCT0215");
        String pno, rno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Registration number of the student");
        rno = sc.next();
        System.out.println("Enter mobile number of the student");
        pno = sc.next();
        try{
            int i;
            if(rno.length()!=9 || pno.length()!=10)
                throw new IllegalArgumentException();

            for(i=0; i<pno.length(); i++){
                if(!Character.isDigit(pno.charAt(i)))
                    throw new NumberFormatException();
            }
            
            for(i=0; i<rno.length(); i++)
            {
                if(!Character.isLetterOrDigit(rno.charAt(i)))
                    throw new NoSuchElementException();
            }
            System.out.println("Valid");
        }
        catch(NoSuchElementException | IllegalArgumentException e)
        {
            System.out.println("Invalid");
        }
        finally{
            sc.close();
        }  
    }   
}