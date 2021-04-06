package media;
<<<<<<< HEAD
<<<<<<< HEAD

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;



    public boolean search(String input, DigitalVideoDisc disc) {  
        String[] arrTest = input.split("\\s"); 
        int count = 0;
        
        for (String check: arrTest) {
            if (disc.getTitle().contains(check)) {
                count++;
            }
        }
        if (count == arrTest.length) {
            return true;
        }
        else {
            return false;
        }
    }



// ***************************************************************************************************************************
=======
>>>>>>> bdd20d0 (Done!)
=======
>>>>>>> 87d0206 (backup data)

public class DigitalVideoDisc extends Media {
    
    public DigitalVideoDisc() {
        super();
    }
    
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    
<<<<<<< HEAD
}
=======
}
>>>>>>> 87d0206 (backup data)
