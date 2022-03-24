class book1
{
    // The fields.
    private String author;
    private String title;
    public int pages;
    public String refNumber;
    int borrowed;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public book1(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    //Exercise 1
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }

    //Exercise 3
    public int getPages()
    {
        return pages;
    }

    //Exercise 6
    public String getRefNumber()
    {
        return refNumber;
    }

    //Exercise 7
    public int getBorrowed()
    {
        return borrowed;
    }

    public void setRefNumber(String ref)
    {
        //Exercise 8
        if (ref.length()>=3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Refernce # must be at least 3 characters");
        }
    }

    //Exercise 9
    public void borrow()
    {
        borrowed = borrowed +1;
    }

    //Exercise 10
    public boolean isCourseText()
    {
        return courseText;
    }

    //Exercise 2
    public void printAuthor()
    {
        System.out.println("Author is: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Title is: " + title);
    }

    //Exercise 5
    public void printDetails()
    {
    System.out.println("Title is: " + title + " and Author is: " + author +" and it has pages: "+ pages);
    

    //Exercise 7
    if(refNumber.length()>0)
    {
        System.out.println("Reference number: " + refNumber);
    }
    else
    {
        System.out.println("ZZZ");
    }
System.out.println("\" " + title + "\" has been borrowed " + borrowed + " times");
    }
}
