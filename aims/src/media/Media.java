package media;

public abstract class Media {
    
    protected String title;
    protected String category;
    protected float cost;
    
    
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    //********************************* Getter methods **********************************
    
    public String getTitle() {
        return title;
    }
   
    public String getCategory() {
        return category;
    }
   
    public float getCost() {
        return cost;
    }    
}
