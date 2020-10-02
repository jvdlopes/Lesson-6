
package library;


public class Patron {
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;
    
    public Patron(String name){
        this.name = name;
        this.book1 = null;
        this.book2 = null;
        this.book3 = null;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean borrow(Book b){
        if(book1==null){
            book1=b;
            return true;
        }
        else if(book2==null){
            book2=b;
            return true;
        }
        else if(book3==null){
            book3=b;
            return true;
        }
        return false;
    }
    
    public boolean hasBook(Book b){
        if(book1==b){
            return true;
        }
        else if(book2==b){
            return true;
        }
        else if(book3 ==b){
            return true;
        }
        return false;
    }

    public boolean returnBook(Book b){
        if(book1==b){
            book1 = null;
            return true;
        }
        else if(book2==b){
            book2 = null;
            return true;
        }
        else if(book3 ==b){
            book3 = null;
            return true;
        }
        else return false;
    }
}
