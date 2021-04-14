package media;

public abstract class Media {
    
    protected String title;
    protected String category;
    protected float cost;
    protected int id;
    
    public Media(int id,String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id; 
    }
    
    //********************************* Getter methods **********************************
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
   
    public String getCategory() {
        return category;
    }
   
    public float getCost() {
        return cost;
    }
    
    //********************************* Override equals methods **********************************

    @Override
    public boolean equals(Object o) {
        if (o instanceof Media) {
            Media media = (Media) o;
            return media.getId() == this.id;
        }
        return false;
    }

}
