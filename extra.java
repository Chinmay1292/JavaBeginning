import java.util.Scanner; public class Book
{

Scanner scan = new Scanner(System.in); private String author;
private String title; private int pages;
private String refNumber;
 
private int borrowed; private boolean courseText;
public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)

{

author = bookAuthor; title = bookTitle; pages = bookPages; refNumber = ""; borrowed = 0;
courseText = bookCourseText;

}

public String getAuthor()

{

return author;

}



public String getTitle()

{

return title;

}



public String getRefNumber()

{

return refNumber;

}



public int getPages()
 
{

return pages;

}



public int getBorrowed()

{

return borrowed;

}



public boolean isCourseText()

{

return courseText;

}



public void printAuthor()

{

System.out.println(author);

}



public void printTitle()

{

System.out.println(title);

}



public void setRefNumber(String ref)

{

if (ref.length() >= 3)
 
{

refNumber = ref; System.out.println("Set success!");
}

else System.out.println("Set failed.");

}



public void borrow()

{

borrowed = borrowed + 1;

}



public void printDetails()

{

System.out.println("Title :" + title); System.out.println("Author :" + author); System.out.println("Page(s) :" + pages); if (refNumber.length() != 0)
{

System.out.println("Ref. Num :" + refNumber);

}

else System.out.println("Ref. Num :ZZZ"); System.out.println("Borrowed :" + borrowed);


} 




    
    
    
    

