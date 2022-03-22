public class classobj {
    String title;
    String author;
    classobj(String s, String a)
    {
        this.title = s;
        this.author = a;
    }
    String getTitle()
    {
        return this.title;
    }
    public static void main(String[] args)
    {
        classobj x;
        x = new classobj("Programming","Java");
        System.out.println(x.getTitle()); //membership operator

        classobj textBook;
        textBook = x;
        String titleUppercase = textBook.getTitle().toUpperCase(); // reference variable
    }
}
