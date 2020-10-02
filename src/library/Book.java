
package library;


public class Book {
    private String author;
    private String title;
    
    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    
    public String toString(){
        String str = "";
        str += "" + title;
        str += ", " + author;
        return str;
    }
    
    public String getTitle(){
    return title;
    }
}
