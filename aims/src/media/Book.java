package media;
import java.util.ArrayList;

public class Book extends Media implements Comparable {
    private ArrayList<String> authorsList = new ArrayList<String>();
    
//************************************* Constructors *************************************
    
    public Book(int id, String title, String category, float cost, ArrayList<String> authorsList) {
        super(id, title, category, cost);
        this.authorsList.addAll(authorsList);
    }
//************************************* Getters and Setters methods ************************************* 

    

//************************************* ArrayList authors method ************************************* 


    public void addAuthors(String author) {
        if (authorsList.contains(author)) {
                System.out.println("Author exist!!!");
        }
        else {
                authorsList.add(author);
                System.out.println("Add author successfully!!!");
        }
    }
 
     
    public void removeAuthors(String author) {
        if (authorsList.contains(author)) {
            authorsList.remove(author);
            System.out.println("Remove author successfully!!!");
        }
        else {
            System.out.println("Author not exist!!!");
        }
    }

    public void printAuthors() {
        for(String test : authorsList) {
            System.out.println(test);
        }
    }



    @Override
    public int compareTo(Object o) {
        if (o instanceof Book) {
            Book book = (Book) o;
            return book.getTitle().compareTo(this.title);                 
        }
        return 0;
    }
}