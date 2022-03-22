public class classobj {
    String title;
    String author;
    int price;
    classobj(String s, String a, int p)
    {
        this.title = s;
        this.author = a;
        this.price = p;
    }
    String getTitle()
    {
        return this.title;
    }
    String getAuthor()
    {
        return this.author;
    }
    int getPrice()
    {
        return this.price;
    }
    public static void main(String[] args)
    {
        classobj x;
        x = new classobj("Programming","Man",1000);
        System.out.println("The title of the book: "+ x.getTitle() + " and its Author is: " + x.getAuthor() +" and its price is: "+ x.getPrice()); //membership operator

        //classobj textBook;
        //textBook = x;
        //String titleUppercase = textBook.getTitle().toUpperCase(); // reference variable
        //System.out.println(titleUppercase);

    }
}
