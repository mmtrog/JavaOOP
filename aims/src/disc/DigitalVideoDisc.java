package disc;
public class DigitalVideoDisc extends Disc implements Playable, Comparable{

    public DigitalVideoDisc(int id, String title, String category, String director,int length, float cost) {
        super(id, title, category, director, length, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) o;
            return dvd.getTitle().compareTo(this.title);                 
        }
        return 0;
    }
}