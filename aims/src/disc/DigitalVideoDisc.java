package disc;

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

    public DigitalVideoDisc() {
        this.title = "unknown";
        this.category = "unknown";
        this.director = "unknown";
        this.length = 0;
        this.cost = 0.0f;
    }
    
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.category = "unknown";
        this.director = "unknown";
        this.length = 0;
        this.cost = 0.0f;
    }
    
    public DigitalVideoDisc(String title, String category) {
        this.title = title;
        this.category = category;
        this.director = "unknown";
        this.length = 0;
        this.cost = 0.0f;
    }
    
    public DigitalVideoDisc(String title, String category, String director) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = 0;
        this.cost = 0.0f;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = 0.0f;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }



// ***************************************************************************************************************************

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    

}
