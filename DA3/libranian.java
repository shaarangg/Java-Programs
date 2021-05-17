import java.util.*;
class Book{
    String name,author;
    int price,no_of_copies;
    Book(String name, String author, int price, int no_of_copies)
    {
        this.name = name;
        this.author = author;
        this.price = price; 
        this.no_of_copies= no_of_copies;
    }
}
class libranian{
    public int search(String name, HashMap<Integer,ArrayList<Book>> shelf)
    {
        for(Integer i : shelf.keySet())
        {
            ArrayList<Book> temp = shelf.get(i);
            for(Book j : temp)
            {
                if((j.name).equals(name))
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public void sort(HashMap<Integer,ArrayList<Book>> shelf)
    {
        for(Integer i : shelf.keySet())
        {
            System.out.println("Books in Rack-"+i.intValue());
            ArrayList<Book> temp = shelf.get(i);
            for(Book j : temp)
            {
                System.out.println(j.name);
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Shaarang Singh\n19BCT0215\n");
        String name,author;
        int price,no_of_copies,rno=1;
        Scanner sc = new Scanner(System.in);
        libranian obj = new libranian();
        HashMap<Integer,ArrayList<Book>> shelf= new HashMap<>();
        ArrayList<Book> book = new ArrayList<>(5);
        System.out.println("Enter the no. of books");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Enter details of Book-"+i);
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Author: ");
            author = sc.nextLine();
            System.out.print("Price: ");
            price = sc.nextInt();
            System.out.print("Number of copies: ");
            no_of_copies = sc.nextInt();
            sc.nextLine();
            book.add(new Book(name, author, price, no_of_copies));
            if(i%5==0)
            {
                shelf.put(rno, book);
                book = new ArrayList<>(5);
                rno++;
            }
        }
        System.out.println("Enter the name of the book you want to search");
        name = sc.nextLine();
        int ch = obj.search(name, shelf);
        if(ch==-1)
        {
            System.out.println("Book not present");
        }
        else{
            System.out.println("Rack Number: "+ch);
        }
        obj.sort(shelf);
        sc.close();
    }
}