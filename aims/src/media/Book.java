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
<<<<<<< HEAD
<<<<<<< HEAD
        this.authorsList.addAll(authorsList);
=======
        this.authorsList = authorsList;
>>>>>>> bdd20d0 (Done!)
=======
        this.authorsList = authorsList;
>>>>>>> 87d0206 (backup data)
    }
//************************************* Getters and Setters methods ************************************* 

    

//************************************* ArrayList authors method ************************************* 

<<<<<<< HEAD
<<<<<<< HEAD

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

}
=======
=======
>>>>>>> 87d0206 (backup data)
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
<<<<<<< HEAD
}
>>>>>>> bdd20d0 (Done!)
=======
}
>>>>>>> 87d0206 (backup data)
