package media;
import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authorsList = new ArrayList<String>();
    
//************************************* Constructors *************************************
    public Book() {
        super();
    }
    
    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(String title, String category, float cost, ArrayList<String> authorsList) {
        super(title, category, cost);
        this.authorsList = authorsList;
    }
//************************************* Getters and Setters methods ************************************* 

    

//************************************* ArrayList authors method ************************************* 

    public void addAuthors(String author) {
        for(String authorsCheck : authorsList) {
            if (authorsCheck.equals(author)) {
                break;
            }
            else {
                authorsList.add(author);
            }
        }
    }
     
    public void removeAuthors(String author) {
        for(String authorsCheck : authorsList) {
            if (authorsCheck.equals(author)) {
                authorsList.remove(author);
            }
            else {
                break;
            }
        }
    }
}